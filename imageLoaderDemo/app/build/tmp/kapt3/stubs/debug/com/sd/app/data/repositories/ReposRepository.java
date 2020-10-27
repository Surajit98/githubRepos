package com.sd.app.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000f\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/sd/app/data/repositories/ReposRepository;", "", "dataSource", "Lcom/sd/app/data/data_source/RepoDataSource;", "connectivityUtil", "Lcom/sd/app/utils/ConnectivityUtil;", "(Lcom/sd/app/data/data_source/RepoDataSource;Lcom/sd/app/utils/ConnectivityUtil;)V", "getRepos", "Landroidx/lifecycle/LiveData;", "", "Lcom/sd/app/data/model/ReposResponseItem;", "page", "", "getReposFromApi", "getReposFromDb", "pageNumber", "app_debug"})
public final class ReposRepository {
    private final com.sd.app.data.data_source.RepoDataSource dataSource = null;
    private final com.sd.app.utils.ConnectivityUtil connectivityUtil = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.sd.app.data.model.ReposResponseItem>> getRepos(int page) {
        return null;
    }
    
    private final androidx.lifecycle.LiveData<java.util.List<com.sd.app.data.model.ReposResponseItem>> getReposFromApi(int page) {
        return null;
    }
    
    private final androidx.lifecycle.LiveData<java.util.List<com.sd.app.data.model.ReposResponseItem>> getReposFromDb(int pageNumber) {
        return null;
    }
    
    public ReposRepository(@org.jetbrains.annotations.NotNull()
    com.sd.app.data.data_source.RepoDataSource dataSource, @org.jetbrains.annotations.NotNull()
    com.sd.app.utils.ConnectivityUtil connectivityUtil) {
        super();
    }
}