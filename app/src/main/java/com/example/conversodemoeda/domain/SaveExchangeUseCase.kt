package com.example.conversodemoeda.domain

import com.example.conversodemoeda.core.UseCase
import com.example.conversodemoeda.data.model.ExchangeResponseValue
import com.example.conversodemoeda.data.respository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class SaveExchangeUseCase(
    private val repository: CoinRepository
) : UseCase.NoSource<ExchangeResponseValue>() {

    override suspend fun execute(param: ExchangeResponseValue): Flow<Unit> {
        return flow {
            repository.save(param)
            emit(Unit)
        }
    }
}