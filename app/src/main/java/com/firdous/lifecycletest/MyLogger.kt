package com.firdous.lifecycletest

import android.util.Log

class MyLogger {

    companion object{
        private const val TAG = "MyLogger"
    }

    fun logCreate(){
        Log.d(TAG,"Activity Created")
    }

    fun logStart(){
        Log.d(TAG,"Activity Started")
    }
    fun logResume(){
        Log.d(TAG,"Activity Resumed")
    }
    fun logPaused(){
        Log.d(TAG,"Activity Paused")
    }
    fun logStop(){
        Log.d(TAG,"Activity Stopped")
    }
    fun logDestroyed(){
        Log.d(TAG,"Activity Destroyed")
    }


}