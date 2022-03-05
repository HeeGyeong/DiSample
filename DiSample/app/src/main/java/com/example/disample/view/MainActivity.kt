package com.example.disample.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.disample.R
//import com.example.disample.dagger.DaggerViewModelComponent
//import com.example.disample.dagger.ViewModelModule
import com.example.disample.sub.BluePrint
import com.example.disample.sub.Material
import com.example.disample.sub.SampleController
import com.example.disample.sub.Tool
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.TedPermission
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger
import com.orhanobut.logger.PrettyFormatStrategy
import kotlinx.coroutines.launch
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
            .tag("permission")
            .build()

        Logger.addLogAdapter(AndroidLogAdapter(logFormat))
        Logger.d("controller ..\n${controller.getSampleText()}\n${controller.getSampleValue()}")

        /**
         * Dagger2 와 Hilt 는 동시에 사용이 불가능하다.
         * 따라서 전부 주석처리.
         */

        // Build > Rebuild Project 시 생성한 DaggerComponent 사용 가능.
/*        DaggerBluePrintComponent.builder()
            .bluePrintModule(BluePrintModule()).build()
            .inject(this)

        Log.d("printLog" , "bluePrint .. material : ${bluePrint.material.getMaterial()}\ntool : ${bluePrint.tool.getTool()}")*/

        /*val innerBluePrint = BluePrint(Material(), Tool())
        Log.d("printLog",
            "innerBluePrint : ${innerBluePrint.material.getMaterial()}\ntool : ${innerBluePrint.tool.getTool()}")

        DaggerViewModelComponent.builder()
            .viewModelModule(ViewModelModule()).build()
            .inject(this)

        Log.d("printLog",
            "viewModel .. ${viewModel.getTest()}\n${viewModel.getMaterialText()}, ${viewModel.getToolText()}\n==${viewModel.getMaterialText()}")*/

        // PermissionChecker
//        permissionCheck()
    }

    fun btnClick(view: View) {
        when (view.id) {
            R.id.sub_btn -> {
                startActivity(Intent(this, KoinActivity::class.java))
            }
            R.id.hilt_btn -> {
                startActivity(Intent(this, HiltActivity::class.java))
            }
        }
    }

    /**
     * TedPermission Library 사용을 해보기 위해 추가.
     */
    private fun permissionCheck() {
        lifecycleScope.launch {
            if (!viewModel.getPermission()) {
                val permissionListener: PermissionListener = object : PermissionListener {
                    override fun onPermissionGranted() {
                        Toast.makeText(this@MainActivity, "권한 허가", Toast.LENGTH_SHORT).show()
                        viewModel.setPermission()
                    }

                    override fun onPermissionDenied(deniedPermissions: ArrayList<String>) {
                        Toast.makeText(this@MainActivity, "권한 거부\n$deniedPermissions", Toast.LENGTH_SHORT)
                            .show()
                        viewModel.setPermission()
                    }
                }

                TedPermission.with(this@MainActivity)
                    .setPermissionListener(permissionListener)
                    .setRationaleMessage("Permission Check Library Test")
                    .setDeniedMessage("Permission Denied")
                    .setPermissions(
                        android.Manifest.permission.READ_EXTERNAL_STORAGE
                    )
                    .check()


            }
        }
    }
}