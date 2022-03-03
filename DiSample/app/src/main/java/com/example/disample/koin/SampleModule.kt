package com.example.disample.koin

import com.example.disample.sub.SampleController
import com.example.disample.sub.SampleDataSource
import com.example.disample.view.SubViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val sampleModule: Module = module {

    single { SampleDataSource() }
    single { SampleController(get()) }

    viewModel { SubViewModel(get()) }
}