package com.sd.app.data.data_source;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\u0006\u0010\u0015\u001a\u00020\u000fJ\u0014\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/sd/app/data/data_source/RepoDataSource;", "Lcom/sd/app/data/data_source/BaseDataSource;", "apiService", "Lcom/sd/app/data/network/ApiService;", "repoDao", "Lcom/sd/app/data/database/dao/RepoDao;", "(Lcom/sd/app/data/network/ApiService;Lcom/sd/app/data/database/dao/RepoDao;)V", "getApiService", "()Lcom/sd/app/data/network/ApiService;", "getRepoDao", "()Lcom/sd/app/data/database/dao/RepoDao;", "fetchRepos", "Lcom/sd/app/data/network/ApiResult;", "Lcom/sd/app/data/network/network_responses/ReposResponse;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchReposFromDb", "Landroidx/lifecycle/LiveData;", "", "Lcom/sd/app/data/model/ReposResponseItem;", "offset", "insert", "", "it", "app_debug"})
public final class RepoDataSource extends com.sd.app.data.data_source.BaseDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.sd.app.data.network.ApiService apiService = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sd.app.data.database.dao.RepoDao repoDao = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchRepos(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.sd.app.data.network.ApiResult<com.sd.app.data.network.network_responses.ReposResponse>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.sd.app.data.model.ReposResponseItem>> fetchReposFromDb(int offset) {
        return null;
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sd.app.data.model.ReposResponseItem> it) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sd.app.data.network.ApiService getApiService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sd.app.data.database.dao.RepoDao getRepoDao() {
        return null;
    }
    
    public RepoDataSource(@org.jetbrains.annotations.NotNull()
    com.sd.app.data.network.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.sd.app.data.database.dao.RepoDao repoDao) {
        super();
    }
}