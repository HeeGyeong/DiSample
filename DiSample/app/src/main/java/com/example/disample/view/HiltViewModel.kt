package com.example.disample.view

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.disample.sub.HiltDataController
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel // @ViewModelInject 가 deprecated 된 후에 새로 생긴 Annotation. @HiltViewModel 선언 후 @Inject 로 주입한다.
class HiltViewModel /*@ViewModelInject*/ @Inject constructor(private val controller: HiltDataController) :
    ViewModel() {

    fun vmText(): String {
        return controller.getHiltText() + " ::: in ViewModel"
    }

    fun vmValue(): Int {
        return controller.getHiltValue() + 800000
    }
}