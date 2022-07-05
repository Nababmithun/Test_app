package com.pajokka.githubuser.ui.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0001H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0002JH\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020!2\u0006\u0010\'\u001a\u00020!2\u0006\u0010(\u001a\u00020!H\u0002J\u0010\u0010)\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010*\u001a\u00020\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006,"}, d2 = {"Lcom/pajokka/githubuser/ui/detail/DetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lorg/kodein/di/KodeinAware;", "()V", "binding", "Lcom/pajokka/githubuser/databinding/ActivityDetailBinding;", "dataUser", "Lcom/pajokka/githubuser/data/source/local/entity/UserModel;", "detailViewModel", "Lcom/pajokka/githubuser/ui/detail/DetailViewModel;", "factory", "Lcom/pajokka/githubuser/utils/ViewModelFactory;", "getFactory", "()Lcom/pajokka/githubuser/utils/ViewModelFactory;", "factory$delegate", "Lkotlin/Lazy;", "kodein", "Lorg/kodein/di/Kodein;", "getKodein", "()Lorg/kodein/di/Kodein;", "kodein$delegate", "obtainViewModel", "activity", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setButtonFavorite", "favorite", "", "setDataFavorite", "username", "", "name", "avatar", "company", "location", "repository", "follower", "following", "setDetailUser", "setTabLayout", "Companion", "app_debug"})
public final class DetailActivity extends androidx.appcompat.app.AppCompatActivity implements org.kodein.di.KodeinAware {
    private com.pajokka.githubuser.databinding.ActivityDetailBinding binding;
    private com.pajokka.githubuser.data.source.local.entity.UserModel dataUser;
    private com.pajokka.githubuser.ui.detail.DetailViewModel detailViewModel;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy kodein$delegate = null;
    private final kotlin.Lazy factory$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.pajokka.githubuser.ui.detail.DetailActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATA_USER = "DATA_USER";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USERNAME_USER = "USERNAME_USER";
    @androidx.annotation.StringRes()
    private static final int[] TAB_TITLE = {com.pajokka.githubuser.R.string.tab_followers, com.pajokka.githubuser.R.string.tab_following};
    
    public DetailActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.kodein.di.Kodein getKodein() {
        return null;
    }
    
    private final com.pajokka.githubuser.utils.ViewModelFactory getFactory() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setTabLayout() {
    }
    
    private final void setDetailUser(com.pajokka.githubuser.data.source.local.entity.UserModel dataUser) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void setButtonFavorite(boolean favorite) {
    }
    
    private final void setDataFavorite(java.lang.String username, java.lang.String name, java.lang.String avatar, java.lang.String company, java.lang.String location, java.lang.String repository, java.lang.String follower, java.lang.String following) {
    }
    
    private final com.pajokka.githubuser.ui.detail.DetailViewModel obtainViewModel(androidx.appcompat.app.AppCompatActivity activity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.kodein.di.KodeinContext<?> getKodeinContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.kodein.di.KodeinTrigger getKodeinTrigger() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/pajokka/githubuser/ui/detail/DetailActivity$Companion;", "", "()V", "DATA_USER", "", "TAB_TITLE", "", "USERNAME_USER", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}