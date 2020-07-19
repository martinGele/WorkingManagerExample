package com.martin.workingmanagerexample.application

import android.app.Application
import com.martin.workingmanagerexample.koin_injections.AllInjections
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class WorkApplication : Application() {

    override fun onCreate() {
        super.onCreate()


        startKoin {
            androidLogger()
            androidContext(this@WorkApplication)
            modules(AllInjections.myModule)

        }
    }
}