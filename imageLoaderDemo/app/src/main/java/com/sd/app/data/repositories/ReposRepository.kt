package com.sd.app.data.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.sd.app.data.data_source.RepoDataSource
import com.sd.app.data.model.ReposResponseItem
import com.sd.app.data.network.ApiResult
import com.sd.app.utils.ConnectivityUtil
import kotlinx.coroutines.Dispatchers

class ReposRepository(
    private val dataSource: RepoDataSource,
    private val connectivityUtil: ConnectivityUtil
) {


    fun getRepos(page: Int): LiveData<List<ReposResponseItem>> {
        val hasConnection = connectivityUtil.isNetworkAvailable()
        var observableFromApi: LiveData<List<ReposResponseItem>>? = null
        if (hasConnection){
            observableFromApi = getReposFromApi(page)
        }
        val observableFromDb = getReposFromDb( page)

        return if (hasConnection) observableFromApi!!
        else observableFromDb
    }

    private fun getReposFromApi(page:Int): LiveData<List<ReposResponseItem>>? =
        liveData(Dispatchers.IO) {
            val response = dataSource.fetchRepos(page)
            if (response.status == ApiResult.Status.SUCCESS) {
                response.data?.let {
                    dataSource.insert(it)
                    emit(it)
                }
            } else if (response.status == ApiResult.Status.ERROR) {
                emit(emptyList())
            }

        }

    private fun getReposFromDb(pageNumber: Int): LiveData<List<ReposResponseItem>> {
        return dataSource.fetchReposFromDb( (10 * pageNumber) - 10)

    }

}