package com.sd.app.data.data_source;

import java.lang.System;

/**
 * Abstract Base Data source class with error handling
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J \u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\n\u0010\t\u001a\u00060\nj\u0002`\u000bH\u0002JA\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\"\u0010\r\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH\u0084@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/sd/app/data/data_source/BaseDataSource;", "", "()V", "error", "Lcom/sd/app/data/network/ApiResult;", "T", "message", "", "errorMsg", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getResult", "call", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lretrofit2/Response;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract class BaseDataSource {
    
    @org.jetbrains.annotations.Nullable()
    protected final <T extends java.lang.Object>java.lang.Object getResult(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super retrofit2.Response<T>>, ? extends java.lang.Object> call, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.sd.app.data.network.ApiResult<? extends T>> p1) {
        return null;
    }
    
    private final <T extends java.lang.Object>com.sd.app.data.network.ApiResult<T> error(java.lang.String message) {
        return null;
    }
    
    private final <T extends java.lang.Object>com.sd.app.data.network.ApiResult<T> errorMsg(java.lang.Exception e) {
        return null;
    }
    
    public BaseDataSource() {
        super();
    }
}