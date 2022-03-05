package com.example.disample.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.disample.R
import com.example.disample.sub.HiltDataController
import com.example.disample.sub.HiltDataSource
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger
import com.orhanobut.logger.PrettyFormatStrategy
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HiltActivity : AppCompatActivity() {

    @Inject
    lateinit var dataSource: HiltDataSource
    @Inject
    lateinit var controller: HiltDataController

    private val viewModel: HiltViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val logFormat = PrettyFormatStrategy.newBuilder()
            .tag("HiltLog")
            .build()

        Logger.addLogAdapter(AndroidLogAdapter(logFormat))
        Logger.d("-DataSource-\n${dataSource.hiltText}\n${dataSource.hiltValue}\n" +
                "-Controller-\n${controller.getHiltText()}\n${controller.getHiltValue()}")

        Logger.d("-viewModel-\n${viewModel.vmText()}\n${viewModel.vmValue()}")
    }

    fun btnClick(view: View) {
        when (view.id) {
            R.id.main_btn -> {
                startActivity(Intent(this, MainActivity::class.java))
            }
        }
    }
}