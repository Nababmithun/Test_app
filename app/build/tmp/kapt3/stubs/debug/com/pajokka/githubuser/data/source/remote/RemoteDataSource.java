package com.pajokka.githubuser.data.source.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u00042\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ/\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u00042\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ/\u0010\f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u00042\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/pajokka/githubuser/data/source/remote/RemoteDataSource;", "", "()V", "getFollowersUser", "Lcom/pajokka/githubuser/data/source/remote/response/ApiResponse;", "Ljava/util/ArrayList;", "Lcom/pajokka/githubuser/data/source/local/entity/UserModel;", "Lkotlin/collections/ArrayList;", "username", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFollowingUser", "getUser", "app_debug"})
public final class RemoteDataSource {
    
    public RemoteDataSource() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUser(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.pajokka.githubuser.data.source.remote.response.ApiResponse<java.util.ArrayList<com.pajokka.githubuser.data.source.local.entity.UserModel>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFollowersUser(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.pajokka.githubuser.data.source.remote.response.ApiResponse<java.util.ArrayList<com.pajokka.githubuser.data.source.local.entity.UserModel>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFollowingUser(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.pajokka.githubuser.data.source.remote.response.ApiResponse<java.util.ArrayList<com.pajokka.githubuser.data.source.local.entity.UserModel>>> continuation) {
        return null;
    }
}