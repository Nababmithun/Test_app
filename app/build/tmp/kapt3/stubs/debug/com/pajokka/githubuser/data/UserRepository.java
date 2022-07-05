package com.pajokka.githubuser.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006JQ\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016H\u0016J$\u0010\u0019\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a0\u00162\u0006\u0010\t\u001a\u00020\nH\u0016J$\u0010\u001d\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a0\u00162\u0006\u0010\t\u001a\u00020\nH\u0016J$\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a0\u00162\u0006\u0010\t\u001a\u00020\nH\u0016J\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u00182\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lcom/pajokka/githubuser/data/UserRepository;", "Lcom/pajokka/githubuser/data/UserDataSource;", "remoteDataSource", "Lcom/pajokka/githubuser/data/source/remote/RemoteDataSource;", "localDataSource", "Lcom/pajokka/githubuser/data/source/local/LocalDataSource;", "(Lcom/pajokka/githubuser/data/source/remote/RemoteDataSource;Lcom/pajokka/githubuser/data/source/local/LocalDataSource;)V", "addToFavorite", "", "username", "", "name", "avatar", "company", "location", "repository", "follower", "following", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFavorite", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllFavoriteUser", "Landroidx/lifecycle/LiveData;", "", "Lcom/pajokka/githubuser/data/source/local/entity/UserEntity;", "getFollowersUser", "Lcom/pajokka/githubuser/vo/Resource;", "Ljava/util/ArrayList;", "Lcom/pajokka/githubuser/data/source/local/entity/UserModel;", "getFollowingUser", "getUser", "getUserByUsername", "app_debug"})
public final class UserRepository implements com.pajokka.githubuser.data.UserDataSource {
    private final com.pajokka.githubuser.data.source.remote.RemoteDataSource remoteDataSource = null;
    private com.pajokka.githubuser.data.source.local.LocalDataSource localDataSource;
    
    public UserRepository(@org.jetbrains.annotations.NotNull()
    com.pajokka.githubuser.data.source.remote.RemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull()
    com.pajokka.githubuser.data.source.local.LocalDataSource localDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getUserByUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.pajokka.githubuser.data.source.local.entity.UserEntity> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteFavorite(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object addToFavorite(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String avatar, @org.jetbrains.annotations.NotNull()
    java.lang.String company, @org.jetbrains.annotations.NotNull()
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    java.lang.String repository, @org.jetbrains.annotations.NotNull()
    java.lang.String follower, @org.jetbrains.annotations.NotNull()
    java.lang.String following, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.pajokka.githubuser.data.source.local.entity.UserEntity>> getAllFavoriteUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.pajokka.githubuser.vo.Resource<? extends java.util.ArrayList<com.pajokka.githubuser.data.source.local.entity.UserModel>>> getUser(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.pajokka.githubuser.vo.Resource<? extends java.util.ArrayList<com.pajokka.githubuser.data.source.local.entity.UserModel>>> getFollowersUser(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.pajokka.githubuser.vo.Resource<? extends java.util.ArrayList<com.pajokka.githubuser.data.source.local.entity.UserModel>>> getFollowingUser(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
}