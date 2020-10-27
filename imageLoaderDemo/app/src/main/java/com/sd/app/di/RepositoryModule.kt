package com.sd.app.di

import com.sd.app.data.data_source.RepoDataSource
import com.sd.app.data.database.dao.RepoDao
import com.sd.app.data.network.ApiService
import com.sd.app.data.repositories.ReposRepository
import com.sd.app.utils.ConnectivityUtil

import org.koin.dsl.module

val repositoryModule = module {

    fun providePhotosDataSource(api: ApiService,repoDao: RepoDao) = RepoDataSource(api,repoDao)
    fun providePhotosRepository(dataSource: RepoDataSource,connectivityUtil: ConnectivityUtil) =
        ReposRepository(
            dataSource,
            connectivityUtil

        )

    factory { providePhotosDataSource(get(),get()) }
    factory { providePhotosRepository(get(),get()) }


}