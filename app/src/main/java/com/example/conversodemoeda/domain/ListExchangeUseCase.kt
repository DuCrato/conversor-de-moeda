package com.example.conversodemoeda.domain

import com.example.conversodemoeda.core.UseCase
import com.example.conversodemoeda.data.model.ExchangeResponseValue
import com.example.conversodemoeda.data.respository.CoinRepository
import kotlinx.coroutines.flow.Flow

class ListExchangeUseCase(
    private val repository: CoinRepository
) : UseCase.NoParam<List<ExchangeResponseValue>>() {

    override suspend fun execute(): Flow<List<ExchangeResponseValue>> {
        return repository.list()
    }
}