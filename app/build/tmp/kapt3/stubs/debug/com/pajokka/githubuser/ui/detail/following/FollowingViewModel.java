package com.pajokka.githubuser.ui.detail.following;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/pajokka/githubuser/ui/detail/following/FollowingViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lcom/pajokka/githubuser/data/UserRepository;", "(Lcom/pajokka/githubuser/data/UserRepository;)V", "getFollowingUser", "Landroidx/lifecycle/LiveData;", "Lcom/pajokka/githubuser/vo/Resource;", "Ljava/util/ArrayList;", "Lcom/pajokka/githubuser/data/source/local/entity/UserModel;", "username", "", "app_debug"})
public final class FollowingViewModel extends androidx.lifecycle.ViewModel {
    private final com.pajokka.githubuser.data.UserRepository userRepository = null;
    
    public FollowingViewModel(@org.jetbrains.annotations.NotNull()
    com.pajokka.githubuser.data.UserRepository userRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.pajokka.githubuser.vo.Resource<? extends java.util.ArrayList<com.pajokka.githubuser.data.source.local.entity.UserModel>>> getFollowingUser(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
}