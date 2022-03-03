package com.example.disample.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.disample.R
import com.example.disample.dagger.DaggerTestComponent
import com.example.disample.dagger.TestModule
import com.example.disample.sub.BluePrint
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger
import com.orhanobut.logger.PrettyFormatStrategy
import javax.inject.Inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class SubActivity: AppCompatActivity() {

    @Inject
    lateinit var bluePrint: BluePrint

    private val viewModel: SubViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        DaggerTestComponent.builder()
            .testModule(TestModule()).build()
            .inject(this)

//        Log.d("printLog" , "sub activity :: ${bluePrint.material.getMaterial()}\ntool : ${bluePrint.tool.getTool()}")

        val logFormat = PrettyFormatStrategy.newBuilder()
            .tag("CustomLogTag")
            .build()

        Logger.addLogAdapter(AndroidLogAdapter(logFormat))
        Logger.d("subActivity\n${viewModel.vmText}\n${viewModel.vmValue}\n" +
                "${viewModel.vmController.getSampleValue()}\n${viewModel.vmController.getSampleText()}")
    }


    fun btnClick(view: View) {
        when(view.id) {
            R.id.main_btn -> {
                startActivity(Intent(this, MainActivity::class.java))
            }
        }
    }
}