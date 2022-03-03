package com.example.disample.view

import androidx.lifecycle.ViewModel
import com.example.disample.sub.SampleController

class SubViewModel(private val controller: SampleController): ViewModel() {

    val vmText = "SubViewModel " + controller.getSampleText()
    val vmValue = controller.getSampleValue() + 1000

    val vmController = controller
}