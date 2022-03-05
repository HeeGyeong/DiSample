package com.example.disample.sub;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/example/disample/sub/HiltDataSource;", "", "()V", "hiltText", "", "getHiltText", "()Ljava/lang/String;", "hiltValue", "", "getHiltValue", "()I", "app_debug"})
@javax.inject.Singleton()
public final class HiltDataSource {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String hiltText = "HiltDataSource in text";
    private final int hiltValue = 123;
    
    @javax.inject.Inject()
    public HiltDataSource() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHiltText() {
        return null;
    }
    
    public final int getHiltValue() {
        return 0;
    }
}