package com.pajokka.githubuser.data.source.remote.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\'\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\'\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/pajokka/githubuser/data/source/remote/network/ApiService;", "", "getDetailUser", "Lretrofit2/Response;", "Lcom/pajokka/githubuser/data/source/remote/response/DetailResponse;", "username", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFollowers", "", "Lcom/pajokka/githubuser/data/source/remote/response/FollowResponseItem;", "getFollowing", "getSearch", "Lcom/pajokka/githubuser/data/source/remote/response/SearchResponse;", "user", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/search/users")
    @retrofit2.http.Headers(value = {"Authorization: token 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"})
    public abstract java.lang.Object getSearch(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.pajokka.githubuser.data.source.remote.response.SearchResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/users/{username}")
    @retrofit2.http.Headers(value = {"Authorization: token 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"})
    public abstract java.lang.Object getDetailUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "username")
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.pajokka.githubuser.data.source.remote.response.DetailResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/users/{username}/followers")
    @retrofit2.http.Headers(value = {"Authorization: token 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"})
    public abstract java.lang.Object getFollowers(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "username")
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.pajokka.githubuser.data.source.remote.response.FollowResponseItem>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/users/{username}/following")
    @retrofit2.http.Headers(value = {"Authorization: token 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"})
    public abstract java.lang.Object getFollowing(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "username")
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.pajokka.githubuser.data.source.remote.response.FollowResponseItem>>> continuation);
}