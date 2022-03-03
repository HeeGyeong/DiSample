package com.example.disample.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/example/disample/dagger/ViewModelModule;", "", "()V", "provideMainViewModel", "Lcom/example/disample/view/MainViewModel;", "bluePrintModule", "Lcom/example/disample/dagger/BluePrintModule;", "app_debug"})
@dagger.Module(includes = {com.example.disample.dagger.BluePrintModule.class})
public final class ViewModelModule {
    
    public ViewModelModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "sample")
    @dagger.Provides()
    public final com.example.disample.view.MainViewModel provideMainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.disample.dagger.BluePrintModule bluePrintModule) {
        return null;
    }
}