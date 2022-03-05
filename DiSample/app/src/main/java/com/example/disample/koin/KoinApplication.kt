package com.example.disample.koin

import android.app.Application
import com.example.disample.datastore.DataStore
import dagger.hilt.android.HiltAndroidApp
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

// Koin 과 Hilt 는 동시에 사용이 가능하다.
@HiltAndroidApp
class KoinApplication: Application() {

    private lateinit var dataStore: DataStore

    companion object {
        private lateinit var application: KoinApplication
        fun getInstance(): KoinApplication = application
    }

    override fun onCreate() {
        super.onCreate()
        application = this
        dataStore = DataStore(this)

        startKoin {
            androidContext(this@KoinApplication)
            modules(sampleModule)
        }
    }

    fun getDataStore(): DataStore = dataStore
}