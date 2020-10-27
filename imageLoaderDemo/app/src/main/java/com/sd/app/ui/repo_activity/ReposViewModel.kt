package com.sd.app.ui.repo_activity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.sd.app.data.model.ReposResponseItem
import com.sd.app.data.repositories.ReposRepository


class ReposViewModel(
    private val repository: ReposRepository
) : ViewModel() {
    var showMessage = MutableLiveData<String>()
    var fetch = MutableLiveData<Boolean>()
    var currentPage: Int = 0
    var isLastPage = false
    var fetchNextPage = MutableLiveData<Boolean>().apply { value = false }


    private val repos: MutableLiveData<List<ReposResponseItem>> = MutableLiveData<List<ReposResponseItem>>()
    private val repoLoadError = MutableLiveData<Boolean>()
    private val loading = MutableLiveData<Boolean>()


    fun getRepos(): LiveData<List<ReposResponseItem>>? {
        return repos
    }

    fun getError(): LiveData<Boolean?>? {
        return repoLoadError
    }

    fun getLoading(): LiveData<Boolean?>? {
        return loading
    }




    fun fetchRepos() = Transformations.switchMap(fetch) {
        loading.value=true
        Transformations.map(repository.getRepos(
                currentPage
            )){
            loading.value=false
            if(it.isEmpty()){
                isLastPage=true
                true
            }else{
                repos.value=it
                false
            }
        }

    }




    fun load() {
        if (isLastPage)
            return
        currentPage++
        fetch.value = true
        fetchNextPage.value = true

    }




}