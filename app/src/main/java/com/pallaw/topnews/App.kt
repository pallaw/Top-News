package com.pallaw.topnews

import android.app.Application
import androidx.annotation.NonNull
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber
import javax.inject.Inject

/**
 * Created by Pallaw Pathak on 08/05/20. - https://www.linkedin.com/in/pallaw-pathak-a6a324a1/
 */
@HiltAndroidApp
class App : Application() {

    @Inject
    lateinit var timberDebugTree: Timber.DebugTree

    override fun onCreate() {
        super.onCreate()

        setupTimber()
    }

    private fun setupTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(timberDebugTree)
        }
    }
}