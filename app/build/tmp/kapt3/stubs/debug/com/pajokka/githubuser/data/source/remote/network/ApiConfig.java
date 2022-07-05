package com.pajokka.githubuser.data.source.remote.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/pajokka/githubuser/data/source/remote/network/ApiConfig;", "", "()V", "URL", "", "provideApiService", "Lcom/pajokka/githubuser/data/source/remote/network/ApiService;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "app_debug"})
public final class ApiConfig {
    @org.jetbrains.annotations.NotNull()
    public static final com.pajokka.githubuser.data.source.remote.network.ApiConfig INSTANCE = null;
    private static final java.lang.String URL = "https://api.github.com";
    
    private ApiConfig() {
        super();
    }
    
    private final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.pajokka.githubuser.data.source.remote.network.ApiService provideApiService() {
        return null;
    }
}