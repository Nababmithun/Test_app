package com.pajokka.githubuser.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0003J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J$\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020\u0019H\u0016J\u001a\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\"2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010,\u001a\u00020\u0019H\u0002J\b\u0010-\u001a\u00020\u0019H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/pajokka/githubuser/ui/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/kodein/di/KodeinAware;", "()V", "_binding", "Lcom/pajokka/githubuser/databinding/HomeFragmentBinding;", "binding", "getBinding", "()Lcom/pajokka/githubuser/databinding/HomeFragmentBinding;", "factory", "Lcom/pajokka/githubuser/utils/ViewModelFactory;", "getFactory", "()Lcom/pajokka/githubuser/utils/ViewModelFactory;", "factory$delegate", "Lkotlin/Lazy;", "homeViewModel", "Lcom/pajokka/githubuser/ui/home/HomeViewModel;", "kodein", "Lorg/kodein/di/Kodein;", "getKodein", "()Lorg/kodein/di/Kodein;", "kodein$delegate", "userAdapter", "Lcom/pajokka/githubuser/ui/home/UserAdapter;", "getDataUser", "", "user", "", "isDarkMode", "isLoading", "state", "", "isUserNotFound", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "searchUser", "setRecyclerview", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment implements org.kodein.di.KodeinAware {
    private com.pajokka.githubuser.ui.home.UserAdapter userAdapter;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy kodein$delegate = null;
    private final kotlin.Lazy factory$delegate = null;
    private com.pajokka.githubuser.ui.home.HomeViewModel homeViewModel;
    private com.pajokka.githubuser.databinding.HomeFragmentBinding _binding;
    
    public HomeFragment() {
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
    
    private final com.pajokka.githubuser.databinding.HomeFragmentBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void searchUser() {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void getDataUser(java.lang.String user) {
    }
    
    private final void setRecyclerview() {
    }
    
    private final void isLoading(boolean state) {
    }
    
    private final void isUserNotFound(boolean state) {
    }
    
    private final void isDarkMode() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.kodein.di.KodeinContext<?> getKodeinContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.kodein.di.KodeinTrigger getKodeinTrigger() {
        return null;
    }
}