package com.sd.app.ui.repo_activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\"\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010\r0\r0#J\u0010\u0010%\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010#J\u0010\u0010&\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010#J\u0014\u0010\'\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0018\u00010#J\u0006\u0010(\u001a\u00020)R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011\u00a8\u0006*"}, d2 = {"Lcom/sd/app/ui/repo_activity/ReposViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/sd/app/data/repositories/ReposRepository;", "(Lcom/sd/app/data/repositories/ReposRepository;)V", "currentPage", "", "getCurrentPage", "()I", "setCurrentPage", "(I)V", "fetch", "Landroidx/lifecycle/MutableLiveData;", "", "getFetch", "()Landroidx/lifecycle/MutableLiveData;", "setFetch", "(Landroidx/lifecycle/MutableLiveData;)V", "fetchNextPage", "getFetchNextPage", "setFetchNextPage", "isLastPage", "()Z", "setLastPage", "(Z)V", "loading", "repoLoadError", "repos", "", "Lcom/sd/app/data/model/ReposResponseItem;", "showMessage", "", "getShowMessage", "setShowMessage", "fetchRepos", "Landroidx/lifecycle/LiveData;", "kotlin.jvm.PlatformType", "getError", "getLoading", "getRepos", "load", "", "app_debug"})
public final class ReposViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> showMessage;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> fetch;
    private int currentPage = 0;
    private boolean isLastPage = false;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> fetchNextPage;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.sd.app.data.model.ReposResponseItem>> repos = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> repoLoadError = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loading = null;
    private final com.sd.app.data.repositories.ReposRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getShowMessage() {
        return null;
    }
    
    public final void setShowMessage(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getFetch() {
        return null;
    }
    
    public final void setFetch(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final int getCurrentPage() {
        return 0;
    }
    
    public final void setCurrentPage(int p0) {
    }
    
    public final boolean isLastPage() {
        return false;
    }
    
    public final void setLastPage(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getFetchNextPage() {
        return null;
    }
    
    public final void setFetchNextPage(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<java.util.List<com.sd.app.data.model.ReposResponseItem>> getRepos() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getError() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> fetchRepos() {
        return null;
    }
    
    public final void load() {
    }
    
    public ReposViewModel(@org.jetbrains.annotations.NotNull()
    com.sd.app.data.repositories.ReposRepository repository) {
        super();
    }
}