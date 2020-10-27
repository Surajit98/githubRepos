package com.sd.app.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/sd/app/utils/ErrorHandler;", "", "()V", "EMPTY_RESPONSE", "", "NETWORK_ERROR_MESSAGE", "NO_SUCH_DATA", "REQUEST_TIME_OUT", "UNKNOWN_ERROR", "NoDataException", "NoInternetException", "NoResponseException", "SocketTimeOutException", "app_debug"})
public final class ErrorHandler {
    private static final java.lang.String NETWORK_ERROR_MESSAGE = "Please check your internet connectivity and try again!";
    private static final java.lang.String EMPTY_RESPONSE = "Server returned empty response.";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NO_SUCH_DATA = "Data not found in the database";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UNKNOWN_ERROR = "An unknown error occurred!";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REQUEST_TIME_OUT = "Request timed out. Please try again.";
    public static final com.sd.app.utils.ErrorHandler INSTANCE = null;
    
    private ErrorHandler() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/sd/app/utils/ErrorHandler$NoResponseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "app_debug"})
    public static final class NoResponseException extends java.lang.Exception {
        
        public NoResponseException(@org.jetbrains.annotations.Nullable()
        java.lang.String message) {
            super();
        }
        
        public NoResponseException() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/sd/app/utils/ErrorHandler$SocketTimeOutException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "app_debug"})
    public static final class SocketTimeOutException extends java.lang.Exception {
        
        public SocketTimeOutException(@org.jetbrains.annotations.Nullable()
        java.lang.String message) {
            super();
        }
        
        public SocketTimeOutException() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/sd/app/utils/ErrorHandler$NoDataException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "app_debug"})
    public static final class NoDataException extends java.lang.Exception {
        
        public NoDataException(@org.jetbrains.annotations.Nullable()
        java.lang.String message) {
            super();
        }
        
        public NoDataException() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/sd/app/utils/ErrorHandler$NoInternetException;", "Ljava/io/IOException;", "message", "", "(Ljava/lang/String;)V", "app_debug"})
    public static final class NoInternetException extends java.io.IOException {
        
        public NoInternetException(@org.jetbrains.annotations.Nullable()
        java.lang.String message) {
            super();
        }
        
        public NoInternetException() {
            super();
        }
    }
}