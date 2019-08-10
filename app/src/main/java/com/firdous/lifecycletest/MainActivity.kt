package com.firdous.lifecycletest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lifecycleObserver = MyLifeCycleObserver(lifecycle, MyLogger())
        lifecycle.addObserver(lifecycleObserver)
    }
}
