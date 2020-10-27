package com.sd.app.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/sd/app/utils/NetworkConnectionInterceptor;", "Lokhttp3/Interceptor;", "connectivityManager", "Lcom/sd/app/utils/ConnectivityUtil;", "(Lcom/sd/app/utils/ConnectivityUtil;)V", "getConnectivityManager", "()Lcom/sd/app/utils/ConnectivityUtil;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "app_debug"})
public final class NetworkConnectionInterceptor implements okhttp3.Interceptor {
    @org.jetbrains.annotations.NotNull()
    private final com.sd.app.utils.ConnectivityUtil connectivityManager = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sd.app.utils.ConnectivityUtil getConnectivityManager() {
        return null;
    }
    
    public NetworkConnectionInterceptor(@org.jetbrains.annotations.NotNull()
    com.sd.app.utils.ConnectivityUtil connectivityManager) {
        super();
    }
}