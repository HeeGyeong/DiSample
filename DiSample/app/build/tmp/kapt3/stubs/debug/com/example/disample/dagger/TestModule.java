package com.example.disample.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\u0006H\u0007J\b\u0010\n\u001a\u00020\bH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/example/disample/dagger/TestModule;", "", "()V", "provideBluePrint", "Lcom/example/disample/sub/BluePrint;", "material", "Lcom/example/disample/sub/Material;", "tool", "Lcom/example/disample/sub/Tool;", "provideMaterial", "provideTool", "app_debug"})
@dagger.Module()
public final class TestModule {
    
    public TestModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.disample.sub.BluePrint provideBluePrint(@org.jetbrains.annotations.NotNull()
    com.example.disample.sub.Material material, @org.jetbrains.annotations.NotNull()
    com.example.disample.sub.Tool tool) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.disample.sub.Material provideMaterial() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.disample.sub.Tool provideTool() {
        return null;
    }
}