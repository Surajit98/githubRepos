package com.sd.app.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lcom/sd/app/utils/CustomBindingAdapter;", "Lorg/koin/core/KoinComponent;", "()V", "picasso", "Lcom/squareup/picasso/Picasso;", "getPicasso", "()Lcom/squareup/picasso/Picasso;", "setPicasso", "(Lcom/squareup/picasso/Picasso;)V", "loadImage", "", "view", "Landroid/widget/ImageView;", "url", "", "progressBar", "Landroid/widget/ProgressBar;", "app_debug"})
public final class CustomBindingAdapter implements org.koin.core.KoinComponent {
    @org.jetbrains.annotations.NotNull()
    private static com.squareup.picasso.Picasso picasso;
    public static final com.sd.app.utils.CustomBindingAdapter INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.squareup.picasso.Picasso getPicasso() {
        return null;
    }
    
    public final void setPicasso(@org.jetbrains.annotations.NotNull()
    com.squareup.picasso.Picasso p0) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"url", "progressBar"})
    public static final void loadImage(@org.jetbrains.annotations.Nullable()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar progressBar) {
    }
    
    private CustomBindingAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}