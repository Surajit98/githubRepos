package com.sd.app.app

import android.app.Application
import com.sd.app.di.*

import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import timber.log.Timber

class ReposApp : Application() {


    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@ReposApp)
            modules(
                listOf(
                    appModule,
                    networkModule,
                    repositoryModule,
                    viewModelModule,
                    databaseModule
                )
            )
        }


        Timber.plant(Timber.DebugTree())

    }

    companion object {
        val TAG = ReposApp::class.java.simpleName

    }
}