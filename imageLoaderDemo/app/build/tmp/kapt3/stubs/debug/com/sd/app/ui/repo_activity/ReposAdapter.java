package com.sd.app.ui.repo_activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0006\u0010\u000b\u001a\u00020\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/sd/app/ui/repo_activity/ReposAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/sd/app/ui/repo_activity/ReposAdapter$ViewHolder;", "repos", "Ljava/util/ArrayList;", "Lcom/sd/app/data/model/ReposResponseItem;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "add", "", "list", "clear", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class ReposAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.sd.app.ui.repo_activity.ReposAdapter.ViewHolder> {
    private final java.util.ArrayList<com.sd.app.data.model.ReposResponseItem> repos = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sd.app.ui.repo_activity.ReposAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.sd.app.ui.repo_activity.ReposAdapter.ViewHolder holder, int position) {
    }
    
    public final void add(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.sd.app.data.model.ReposResponseItem> list) {
    }
    
    public final void clear() {
    }
    
    public ReposAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.sd.app.data.model.ReposResponseItem> repos) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/sd/app/ui/repo_activity/ReposAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/sd/app/databinding/ListItemReposBinding;", "(Lcom/sd/app/databinding/ListItemReposBinding;)V", "getBinding", "()Lcom/sd/app/databinding/ListItemReposBinding;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.sd.app.databinding.ListItemReposBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.sd.app.databinding.ListItemReposBinding getBinding() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.sd.app.databinding.ListItemReposBinding binding) {
            super(null);
        }
    }
}