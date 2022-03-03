package com.example.disample.sub

class SampleController(private val dataSource: SampleDataSource) {

    fun getSampleText(): String {
        return dataSource.sampleText
    }

    fun getSampleValue(): Int {
        return dataSource.sampleValue
    }
}