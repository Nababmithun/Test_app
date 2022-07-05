package com.pajokka.githubuser.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\"\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\b2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/pajokka/githubuser/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lcom/pajokka/githubuser/data/UserRepository;", "pref", "Lcom/pajokka/githubuser/utils/SettingPreference;", "(Lcom/pajokka/githubuser/data/UserRepository;Lcom/pajokka/githubuser/utils/SettingPreference;)V", "getThemeSettings", "Landroidx/lifecycle/LiveData;", "", "getUser", "Lcom/pajokka/githubuser/vo/Resource;", "Ljava/util/ArrayList;", "Lcom/pajokka/githubuser/data/source/local/entity/UserModel;", "username", "", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.pajokka.githubuser.data.UserRepository userRepository = null;
    private final com.pajokka.githubuser.utils.SettingPreference pref = null;
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.pajokka.githubuser.data.UserRepository userRepository, @org.jetbrains.annotations.NotNull()
    com.pajokka.githubuser.utils.SettingPreference pref) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.pajokka.githubuser.vo.Resource<? extends java.util.ArrayList<com.pajokka.githubuser.data.source.local.entity.UserModel>>> getUser(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getThemeSettings() {
        return null;
    }
}