package com.pajokka.githubuser.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/pajokka/githubuser/utils/SettingPreference;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "THEME_KEY", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "dataStoreTheme", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "dataStore", "Landroid/content/Context;", "getDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", "dataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getThemeSetting", "Lkotlinx/coroutines/flow/Flow;", "saveThemeSetting", "", "isDarkModeActive", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class SettingPreference {
    private final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> THEME_KEY = null;
    private final kotlin.properties.ReadOnlyProperty dataStore$delegate = null;
    private final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStoreTheme = null;
    
    public SettingPreference(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    private final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> getDataStore(android.content.Context $this$dataStore) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getThemeSetting() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveThemeSetting(boolean isDarkModeActive, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}