package com.example.disample.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.disample.R
import com.example.disample.di.DaggerTestComponent
import com.example.disample.di.TestModule
import com.example.disample.sub.BluePrint
import javax.inject.Inject

class SubActivity: AppCompatActivity() {

    @Inject
    lateinit var bluePrint: BluePrint

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        DaggerTestComponent.builder()
            .testModule(TestModule()).build()
            .inject(this)

        Log.d("printLog" , "sub activity :: ${bluePrint.material.getMaterial()}\ntool : ${bluePrint.tool.getTool()}")
    }


    fun btnClick(view: View) {
        when(view.id) {
            R.id.main_btn -> {
                startActivity(Intent(this, MainActivity::class.java))
            }
        }
    }
}