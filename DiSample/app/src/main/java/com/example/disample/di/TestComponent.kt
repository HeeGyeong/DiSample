package com.example.disample.di

import com.example.disample.view.SubActivity
import dagger.Component

@Component(modules = [TestModule::class])
interface TestComponent {
    fun inject(activity: SubActivity)
}