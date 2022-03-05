package com.example.disample.view

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.disample.koin.KoinApplication
import com.example.disample.sub.BluePrint
import com.example.disample.sub.Material
import com.example.disample.sub.Tool
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel(
    private val material: Material,
    private val tool: Tool,
    private val bluePrint: BluePrint,
): ViewModel() {

    fun getTest(): String {
        return "MainViewModel Text"
    }

    fun getMaterialText(): String {
        return material.getMaterial()
    }

    fun getToolText(): String {
        return tool.getTool()
    }

    fun getBluePrintText(): String {
        return bluePrint.getBluePrint()
    }

    suspend fun getPermission(): Boolean =
        withContext(CoroutineScope(Dispatchers.Main).coroutineContext) {
            KoinApplication.getInstance().getDataStore().dataStorePermission.first()
        }

    fun setPermission() {
        CoroutineScope(Dispatchers.Main).launch {
            KoinApplication.getInstance().getDataStore().setDataStorePermission(true)
        }
    }
}