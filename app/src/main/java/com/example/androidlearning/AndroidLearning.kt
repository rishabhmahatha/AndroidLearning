package com.example.androidlearning

import android.app.Application
import com.example.androidlearning.dagger.ApplicationComponent
import com.example.androidlearning.dagger.DaggerApplicationComponent


class AndroidLearning : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.builder().build()
    }
}