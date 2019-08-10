package com.firdous.lifecycletest

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent

class MyLifeCycleObserver (private val lifecycle: Lifecycle, private val myLogger: MyLogger) : LifecycleObserver{

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun logCreate(){
        myLogger.logCreate()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun logStart(){
        myLogger.logStart()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun logResume(){
        myLogger.logResume()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun logPause(){
        myLogger.logPaused()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun logStop(){
        myLogger.logStop()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun logDestroy(){
        myLogger.logDestroyed()
    }
}