package com.pajokka.githubuser.ui.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\u00062\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0018\u0010\u0013\u001a\u00020\u00062\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0015H\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/pajokka/githubuser/ui/detail/FollowAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/pajokka/githubuser/ui/detail/FollowAdapter$ListViewHolder;", "listener", "Lkotlin/Function1;", "Lcom/pajokka/githubuser/data/source/local/entity/UserModel;", "", "(Lkotlin/jvm/functions/Function1;)V", "listUserData", "Ljava/util/ArrayList;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setDataUser", "userData", "", "ListViewHolder", "app_debug"})
public final class FollowAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.pajokka.githubuser.ui.detail.FollowAdapter.ListViewHolder> {
    private final kotlin.jvm.functions.Function1<com.pajokka.githubuser.data.source.local.entity.UserModel, kotlin.Unit> listener = null;
    private java.util.ArrayList<com.pajokka.githubuser.data.source.local.entity.UserModel> listUserData;
    
    public FollowAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.pajokka.githubuser.data.source.local.entity.UserModel, kotlin.Unit> listener) {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setDataUser(@org.jetbrains.annotations.Nullable()
    java.util.List<com.pajokka.githubuser.data.source.local.entity.UserModel> userData) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.pajokka.githubuser.ui.detail.FollowAdapter.ListViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.pajokka.githubuser.ui.detail.FollowAdapter.ListViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/pajokka/githubuser/ui/detail/FollowAdapter$ListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/pajokka/githubuser/ui/detail/FollowAdapter;Landroid/view/View;)V", "imgPhoto", "Landroid/widget/ImageView;", "tvLocation", "Landroid/widget/TextView;", "tvName", "tvRepository", "bind", "", "userData", "Lcom/pajokka/githubuser/data/source/local/entity/UserModel;", "app_debug"})
    public final class ListViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private android.widget.TextView tvName;
        private android.widget.TextView tvLocation;
        private android.widget.TextView tvRepository;
        private android.widget.ImageView imgPhoto;
        
        public ListViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.pajokka.githubuser.data.source.local.entity.UserModel userData) {
        }
    }
}