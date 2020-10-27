/*
 * *
 *  * Created by Surajit on 30/5/20 2:33 PM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 29/3/20 3:26 PM
 *  *
 */

package com.sd.app.data.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.sd.app.data.model.ReposResponseItem

@Dao
interface RepoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(repo: ReposResponseItem)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(repo: List<ReposResponseItem>)

    @Query("select * from repos limit 10 offset :offset")
    fun getRepos(offset:Int): LiveData<List<ReposResponseItem>>
}