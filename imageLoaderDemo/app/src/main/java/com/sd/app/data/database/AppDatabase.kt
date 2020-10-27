package com.sd.app.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sd.app.data.database.dao.RepoDao
import com.sd.app.data.model.ReposResponseItem

@Database(entities = [ReposResponseItem::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getRepoDao(): RepoDao


}