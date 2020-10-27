package com.sd.app.data.network


import com.sd.app.data.network.network_responses.ReposResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {


    @GET("/orgs/octokit/repos?per_page=10")
    suspend fun fetchRepos(
        @Query("page") page: Int
    ): Response<ReposResponse>


}