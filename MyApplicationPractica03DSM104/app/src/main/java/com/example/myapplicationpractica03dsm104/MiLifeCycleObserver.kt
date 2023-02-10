package com.example.myapplicationpractica03dsm104

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner


class MiLifeCycleObserver: DefaultLifecycleObserver {
    override fun onCreate(lifecycler: LifecycleOwner) {
        super.onCreate(lifecycler)
        Log.d("MiLifeCycleObserver", "OnCreate")
    }

    override fun onStart(lifecycler: LifecycleOwner) {
        super.onStart(lifecycler)
        Log.d("MiLifeCycleObserver", "OnStart")
    }

    override fun onPause(lifecycler: LifecycleOwner) {
        super.onPause(lifecycler)
        Log.d("MiLifeCycleObserver", "OnPause")
    }

    override fun onResume(lifecycler: LifecycleOwner) {
        super.onResume(lifecycler)
        Log.d("MiLifeCycleObserver", "OnResume")
    }

    override fun onStop(lifecycler: LifecycleOwner) {
        super.onStop(lifecycler)
        Log.d("MiLifeCycleObserver", "OnStop")
    }

    override fun onDestroy(lifecycler: LifecycleOwner) {
        super.onDestroy(lifecycler)
        Log.d("MiLifeCycleObserver", "OnDestroy")
    }
}