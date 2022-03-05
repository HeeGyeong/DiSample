package com.example.disample.sub

import javax.inject.Inject

class HiltDataController @Inject constructor(private val dataSource: HiltDataSource) {

    fun getHiltText(): String {
        return dataSource.hiltText + " :: Controller"
    }

    fun getHiltValue(): Int {
        return dataSource.hiltValue + 8000
    }
}