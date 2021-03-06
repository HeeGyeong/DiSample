// Generated by Dagger (https://dagger.dev).
package com.example.disample.dagger;

import com.example.disample.view.MainViewModel;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ViewModelModule_ProvideMainViewModelFactory implements Factory<MainViewModel> {
  private final ViewModelModule module;

  private final Provider<BluePrintModule> bluePrintModuleProvider;

  public ViewModelModule_ProvideMainViewModelFactory(ViewModelModule module,
      Provider<BluePrintModule> bluePrintModuleProvider) {
    this.module = module;
    this.bluePrintModuleProvider = bluePrintModuleProvider;
  }

  @Override
  public MainViewModel get() {
    return provideMainViewModel(module, bluePrintModuleProvider.get());
  }

  public static ViewModelModule_ProvideMainViewModelFactory create(ViewModelModule module,
      Provider<BluePrintModule> bluePrintModuleProvider) {
    return new ViewModelModule_ProvideMainViewModelFactory(module, bluePrintModuleProvider);
  }

  public static MainViewModel provideMainViewModel(ViewModelModule instance,
      BluePrintModule bluePrintModule) {
    return Preconditions.checkNotNullFromProvides(instance.provideMainViewModel(bluePrintModule));
  }
}
