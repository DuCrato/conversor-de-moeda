package com.example.conversodemoeda.domain.di

import com.example.conversodemoeda.domain.GetExchangeValueUseCase
import com.example.conversodemoeda.domain.ListExchangeUseCase
import com.example.conversodemoeda.domain.SaveExchangeUseCase
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object DomainModule {

    fun load() {
        loadKoinModules(useCaseModules())
    }

    private fun useCaseModules(): Module {
        return module {
            factory { ListExchangeUseCase(get()) }
            factory { SaveExchangeUseCase(get()) }
            factory { GetExchangeValueUseCase(get()) }
        }
    }
}