package com.example.disample.hilt

import com.example.disample.sub.HiltDataController
import com.example.disample.sub.HiltDataSource
//import com.example.disample.view.HiltViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

// Module 은 필요 없음. 글 작성 해보고 필요 없으면 viewModel 과 같이 한곳에 몰아 두고 하나 제거
@Module
@InstallIn(ActivityComponent::class)
object HiltModule {

    @Provides
    fun provideHiltData(): HiltDataSource {
        return HiltDataSource()
    }

    @Provides
    fun provideHiltController(dataSource: HiltDataSource): HiltDataController {
        return HiltDataController(dataSource)
    }
}

/*
@Module
@InstallIn(ViewModelComponent::class)
object HiltViewModelModule {

    @Provides
    @ViewModelScoped
    fun provideHiltViewModel(controller: HiltDataController): HiltViewModel {
        return HiltViewModel(controller)
    }
}*/

