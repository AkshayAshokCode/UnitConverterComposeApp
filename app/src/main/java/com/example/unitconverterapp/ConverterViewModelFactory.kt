package com.example.unitconverterapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.unitconverterapp.data.ConverterRepository

class ConverterViewModelFactory(private val converterRepository: ConverterRepository):
    ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T =ConverterViewModel(converterRepository) as T
}