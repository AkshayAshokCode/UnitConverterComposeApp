package com.example.unitconverterapp.data

import kotlinx.coroutines.flow.Flow

class ConverterRepositoryImpl(private val converterDAO: ConverterDAO):ConverterRepository {
    override suspend fun insertResult(conversionResult: ConversionResult) {
        converterDAO.insertResult(conversionResult)
    }

    override suspend fun deleteResult(conversionResult: ConversionResult) {
        converterDAO.deleteResult(conversionResult)
    }

    override suspend fun deleteAllResults() {
        converterDAO.deleteAll()
    }

    override fun getAllResults(): Flow<List<ConversionResult>> {
        return converterDAO.getAllResults()
    }
}