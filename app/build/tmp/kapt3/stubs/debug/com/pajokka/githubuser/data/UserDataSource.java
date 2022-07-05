package com.pajokka.githubuser.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JQ\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u0011H&J.\u0010\u0014\u001a \u0012\u001c\u0012\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00180\u00150\u00112\u0006\u0010\u0004\u001a\u00020\u0005H&J.\u0010\u0019\u001a \u0012\u001c\u0012\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00180\u00150\u00112\u0006\u0010\u0004\u001a\u00020\u0005H&J.\u0010\u001a\u001a \u0012\u001c\u0012\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00180\u00150\u00112\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/pajokka/githubuser/data/UserDataSource;", "", "addToFavorite", "", "username", "", "name", "avatar", "company", "location", "repository", "follower", "following", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFavorite", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllFavoriteUser", "Landroidx/lifecycle/LiveData;", "", "Lcom/pajokka/githubuser/data/source/local/entity/UserEntity;", "getFollowersUser", "Lcom/pajokka/githubuser/vo/Resource;", "Ljava/util/ArrayList;", "Lcom/pajokka/githubuser/data/source/local/entity/UserModel;", "Lkotlin/collections/ArrayList;", "getFollowingUser", "getUser", "getUserByUsername", "app_debug"})
public abstract interface UserDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserByUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.pajokka.githubuser.data.source.local.entity.UserEntity> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteFavorite(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addToFavorite(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String avatar, @org.jetbrains.annotations.NotNull()
    java.lang.String company, @org.jetbrains.annotations.NotNull()
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    java.lang.String repository, @org.jetbrains.annotations.NotNull()
    java.lang.String follower, @org.jetbrains.annotations.NotNull()
    java.lang.String following, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.pajokka.githubuser.data.source.local.entity.UserEntity>> getAllFavoriteUser();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.pajokka.githubuser.vo.Resource<? extends java.util.ArrayList<com.pajokka.githubuser.data.source.local.entity.UserModel>>> getFollowersUser(@org.jetbrains.annotations.NotNull()
    java.lang.String username);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.pajokka.githubuser.vo.Resource<? extends java.util.ArrayList<com.pajokka.githubuser.data.source.local.entity.UserModel>>> getUser(@org.jetbrains.annotations.NotNull()
    java.lang.String username);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.pajokka.githubuser.vo.Resource<? extends java.util.ArrayList<com.pajokka.githubuser.data.source.local.entity.UserModel>>> getFollowingUser(@org.jetbrains.annotations.NotNull()
    java.lang.String username);
}