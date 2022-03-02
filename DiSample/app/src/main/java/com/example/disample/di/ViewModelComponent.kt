package com.example.disample.di

import com.example.disample.view.MainActivity
import dagger.Component

@Component(modules = [ViewModelModule::class])
interface ViewModelComponent {
    fun inject(activity: MainActivity)
}