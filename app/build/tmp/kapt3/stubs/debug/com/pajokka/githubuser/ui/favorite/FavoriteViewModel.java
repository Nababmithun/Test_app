package com.pajokka.githubuser.ui.favorite;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/pajokka/githubuser/ui/favorite/FavoriteViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lcom/pajokka/githubuser/data/UserRepository;", "(Lcom/pajokka/githubuser/data/UserRepository;)V", "getAllFavoriteUser", "Landroidx/lifecycle/LiveData;", "", "Lcom/pajokka/githubuser/data/source/local/entity/UserEntity;", "app_debug"})
public final class FavoriteViewModel extends androidx.lifecycle.ViewModel {
    private final com.pajokka.githubuser.data.UserRepository userRepository = null;
    
    public FavoriteViewModel(@org.jetbrains.annotations.NotNull()
    com.pajokka.githubuser.data.UserRepository userRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<java.util.List<com.pajokka.githubuser.data.source.local.entity.UserEntity>> getAllFavoriteUser() {
        return null;
    }
}