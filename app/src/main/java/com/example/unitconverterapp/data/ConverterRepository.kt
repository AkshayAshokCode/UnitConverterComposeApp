package com.example.unitconverterapp.data

import kotlinx.coroutines.flow.Flow

interface ConverterRepository {

    suspend fun insertResult(conversionResult: ConversionResult)
    suspend fun deleteResult(conversionResult: ConversionResult)
    suspend fun deleteAllResults()

    fun getAllResults(): Flow<List<ConversionResult>>
}