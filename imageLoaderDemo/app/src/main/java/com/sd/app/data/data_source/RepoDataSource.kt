package com.sd.app.data.data_source

import com.sd.app.data.database.dao.RepoDao
import com.sd.app.data.model.ReposResponseItem
import com.sd.app.data.network.ApiService


class RepoDataSource(val apiService: ApiService,val repoDao: RepoDao) : BaseDataSource() {


    suspend fun fetchRepos(page:Int) = getResult { apiService.fetchRepos(page) }


    fun fetchReposFromDb(offset: Int) = repoDao.getRepos(offset)


    fun insert(it: List<ReposResponseItem>) {
        repoDao.insertAll(it)
    }


}