package com.example.disample.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.disample.R
import com.example.disample.di.DaggerViewModelComponent
import com.example.disample.di.ViewModelModule
import com.example.disample.sub.BluePrint
import com.example.disample.sub.Material
import com.example.disample.sub.Tool
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

//    @Inject
//    lateinit var bluePrint: BluePrint

    @Inject
    @Named("sample")
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val innerBluePrint = BluePrint(Material(), Tool())
        Log.d("printLog" , "innerBluePrint : ${innerBluePrint.material.getMaterial()}\ntool : ${innerBluePrint.tool.getTool()}")

        // Build > Rebuild Project 시 생성한 DaggerComponent 사용 가능.
//        DaggerBluePrintComponent.builder()
//            .bluePrintModule(BluePrintModule()).build()
//            .inject(this)

//        Log.d("printLog" , "bluePrint .. material : ${bluePrint.material.getMaterial()}\ntool : ${bluePrint.tool.getTool()}")

        DaggerViewModelComponent.builder()
            .viewModelModule(ViewModelModule()).build()
            .inject(this)

        Log.d("printLog" , "viewModel .. ${viewModel.getTest()}\n${viewModel.getMaterialText()}, ${viewModel.getToolText()}\n==${viewModel.getMaterialText()}")
    }

    fun btnClick(view: View) {
        when(view.id) {
            R.id.sub_btn -> {
                startActivity(Intent(this, SubActivity::class.java))
            }
        }
    }
}