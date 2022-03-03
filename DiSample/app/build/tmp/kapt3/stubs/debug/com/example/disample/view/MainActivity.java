package com.example.disample.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0012\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R$\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0017"}, d2 = {"Lcom/example/disample/view/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "controller", "Lcom/example/disample/sub/SampleController;", "getController", "()Lcom/example/disample/sub/SampleController;", "controller$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/example/disample/view/MainViewModel;", "getViewModel$annotations", "getViewModel", "()Lcom/example/disample/view/MainViewModel;", "setViewModel", "(Lcom/example/disample/view/MainViewModel;)V", "btnClick", "", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject()
    public com.example.disample.view.MainViewModel viewModel;
    private final kotlin.Lazy controller$delegate = null;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.disample.view.MainViewModel getViewModel() {
        return null;
    }
    
    @javax.inject.Named(value = "sample")
    @java.lang.Deprecated()
    public static void getViewModel$annotations() {
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.example.disample.view.MainViewModel p0) {
    }
    
    private final com.example.disample.sub.SampleController getController() {
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