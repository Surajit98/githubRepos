package com.sd.app.di


import android.content.Context
import androidx.room.Room
import com.sd.app.constants.Constants
import com.sd.app.data.database.AppDatabase
import com.sd.app.data.database.dao.RepoDao
import org.koin.dsl.module

val databaseModule = module {
    fun provideDatabase(context: Context): AppDatabase? {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java, Constants.DATABASE_NAME
        )
            .fallbackToDestructiveMigration()
            .build()
    }


    fun provideDeviceDao(appDatabase: AppDatabase): RepoDao {
        return appDatabase.getRepoDao();
    }

    single { provideDatabase(get()) }
    single { provideDeviceDao(get()) }

}