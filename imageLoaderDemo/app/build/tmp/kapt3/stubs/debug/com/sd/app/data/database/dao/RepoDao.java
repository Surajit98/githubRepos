package com.sd.app.data.database.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\'J\u0016\u0010\u000b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\'\u00a8\u0006\f"}, d2 = {"Lcom/sd/app/data/database/dao/RepoDao;", "", "getRepos", "Landroidx/lifecycle/LiveData;", "", "Lcom/sd/app/data/model/ReposResponseItem;", "offset", "", "insert", "", "repo", "insertAll", "app_debug"})
public abstract interface RepoDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.sd.app.data.model.ReposResponseItem repo);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sd.app.data.model.ReposResponseItem> repo);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from repos limit 10 offset :offset")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.sd.app.data.model.ReposResponseItem>> getRepos(int offset);
}