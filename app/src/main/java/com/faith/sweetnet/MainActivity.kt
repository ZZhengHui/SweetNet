package com.faith.sweetnet

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.faith.sweetnet.okhttp.OkHttpManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        OkHttpManager.Builder().get()


    }
}
