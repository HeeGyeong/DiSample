package com.example.disample.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.disample.R
import com.example.disample.dagger.DaggerViewModelComponent
import com.example.disample.dagger.ViewModelModule
import com.example.disample.sub.BluePrint
import com.example.disample.sub.Material
import com.example.disample.sub.SampleController
import com.example.disample.sub.Tool
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger
import com.orhanobut.logger.PrettyFormatStrategy
import org.koin.android.ext.android.inject
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

//    @Inject
//    lateinit var bluePrint: BluePrint

    @Inject
    @Named("sample")
    lateinit var viewModel: MainViewModel

    private val controller: SampleController by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logFormat = PrettyFormatStrategy.newBuilder()
            .tag("CustomLogTag")
            .build()

        Logger.addLogAdapter(AndroidLogAdapter(logFormat))
        Logger.d("controller ..\n${controller.getSampleText()}\n${controller.getSampleValue()}")

        // Build > Rebuild Project 시 생성한 DaggerComponent 사용 가능.
//        DaggerBluePrintComponent.builder()
//            .bluePrintModule(BluePrintModule()).build()
//            .inject(this)

//        Log.d("printLog" , "bluePrint .. material : ${bluePrint.material.getMaterial()}\ntool : ${bluePrint.tool.getTool()}")

        val innerBluePrint = BluePrint(Material(), Tool())
        Log.d("printLog" , "innerBluePrint : ${innerBluePrint.material.getMaterial()}\ntool : ${innerBluePrint.tool.getTool()}")

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