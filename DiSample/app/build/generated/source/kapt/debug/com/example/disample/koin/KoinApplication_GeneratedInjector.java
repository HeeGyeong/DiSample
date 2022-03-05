package com.example.disample.koin;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = KoinApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface KoinApplication_GeneratedInjector {
  void injectKoinApplication(KoinApplication koinApplication);
}
