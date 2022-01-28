package com.example.conversodemoeda

import android.app.Application
import android.app.Presentation
import com.example.conversodemoeda.data.di.DataModules
import com.example.conversodemoeda.domain.di.DomainModule
import com.example.conversodemoeda.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModules.load()
        DomainModule.load()
        PresentationModule.load()
    }
}