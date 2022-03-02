package com.example.disample.view

import com.example.disample.sub.BluePrint
import com.example.disample.sub.Material
import com.example.disample.sub.Tool

class MainViewModel(
    private val material: Material,
    private val tool: Tool,
    private val bluePrint: BluePrint,
) {

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
}