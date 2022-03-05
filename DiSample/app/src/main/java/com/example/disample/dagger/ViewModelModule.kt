package com.example.disample.dagger

import com.example.disample.view.MainViewModel
import dagger.Module
import dagger.Provides
import javax.inject.Named

/*
@Module(includes = [BluePrintModule::class])
class ViewModelModule {

    @Provides
    @Named("sample")
    fun provideMainViewModel(bluePrintModule: BluePrintModule): MainViewModel {
        // BluePrintModule 에 있는 객체들을 주입.
        val material = BluePrintModule_ProvideMaterialFactory.provideMaterial(bluePrintModule)
        val tool = BluePrintModule_ProvideToolFactory.provideTool(bluePrintModule)
        val bluePrint = BluePrintModule_ProvideBluePrintFactory.provideBluePrint(bluePrintModule, material, tool)

        return MainViewModel(material, tool, bluePrint)
    }
}*/
