package com.example.disample.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001c"}, d2 = {"Lcom/example/disample/view/HiltActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "controller", "Lcom/example/disample/sub/HiltDataController;", "getController", "()Lcom/example/disample/sub/HiltDataController;", "setController", "(Lcom/example/disample/sub/HiltDataController;)V", "dataSource", "Lcom/example/disample/sub/HiltDataSource;", "getDataSource", "()Lcom/example/disample/sub/HiltDataSource;", "setDataSource", "(Lcom/example/disample/sub/HiltDataSource;)V", "viewModel", "Lcom/example/disample/view/HiltViewModel;", "getViewModel", "()Lcom/example/disample/view/HiltViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "btnClick", "", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HiltActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject()
    public com.example.disample.sub.HiltDataSource dataSource;
    @javax.inject.Inject()
    public com.example.disample.sub.HiltDataController controller;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public HiltActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.disample.sub.HiltDataSource getDataSource() {
        return null;
    }
    
    public final void setDataSource(@org.jetbrains.annotations.NotNull()
    com.example.disample.sub.HiltDataSource p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.disample.sub.HiltDataController getController() {
        return null;
    }
    
    public final void setController(@org.jetbrains.annotations.NotNull()
    com.example.disample.sub.HiltDataController p0) {
    }
    
    private final com.example.disample.view.HiltViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void btnClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
}