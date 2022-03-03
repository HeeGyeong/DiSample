// Generated by Dagger (https://dagger.dev).
package com.example.disample.dagger;

import com.example.disample.sub.BluePrint;
import com.example.disample.sub.Material;
import com.example.disample.sub.Tool;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TestModule_ProvideBluePrintFactory implements Factory<BluePrint> {
  private final TestModule module;

  private final Provider<Material> materialProvider;

  private final Provider<Tool> toolProvider;

  public TestModule_ProvideBluePrintFactory(TestModule module, Provider<Material> materialProvider,
      Provider<Tool> toolProvider) {
    this.module = module;
    this.materialProvider = materialProvider;
    this.toolProvider = toolProvider;
  }

  @Override
  public BluePrint get() {
    return provideBluePrint(module, materialProvider.get(), toolProvider.get());
  }

  public static TestModule_ProvideBluePrintFactory create(TestModule module,
      Provider<Material> materialProvider, Provider<Tool> toolProvider) {
    return new TestModule_ProvideBluePrintFactory(module, materialProvider, toolProvider);
  }

  public static BluePrint provideBluePrint(TestModule instance, Material material, Tool tool) {
    return Preconditions.checkNotNullFromProvides(instance.provideBluePrint(material, tool));
  }
}