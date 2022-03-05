package com.example.disample.sub

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HiltDataSource @Inject constructor() {

    val hiltText = "HiltDataSource in text"
    val hiltValue = 123
}