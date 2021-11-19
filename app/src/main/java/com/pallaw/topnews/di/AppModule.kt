package com.pallaw.topnews.di

import androidx.annotation.NonNull
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import timber.log.Timber
import javax.inject.Singleton

/**
 * Created by Pallaw Pathak on 19/11/21. - https://www.linkedin.com/in/pallaw-pathak-a6a324a1/
 */
@Module
@InstallIn(ApplicationComponent::class)
object AppModule {


    @Singleton
    @Provides
    fun provideTimberDebug(): Timber.DebugTree{
        return object : Timber.DebugTree() {
            override fun log(
                priority: Int,
                tag: String?,
                @NonNull msg: String,
                t: Throwable?
            ) {
                super.log(priority, "top_news_$tag", msg, t)
            }
        }
    }
}