package com.example.unitconverterapp

import androidx.lifecycle.ViewModel
import com.example.unitconverterapp.data.Conversion

class ConverterViewModel:ViewModel() {
    fun getConversions()= listOf(
        Conversion(1,"Pounds to Kilograms","lbs","kg",0.453592),
        Conversion(2,"Kilograms to Pounds","kg","lbs",2.20462),
        Conversion(3,"Yards to Meters","yd","m",0.9144),
        Conversion(4,"Meters to Yards","m","yd",1.09361),
        Conversion(5,"Feet to Meters","ft","m",0.3048),
        Conversion(6,"Meters to Feet","m","ft",3.28084),
        Conversion(7,"Inches to Centimeters","in","cm",2.54),
        Conversion(8,"Centimeters to Inches","cm","in",0.393701),
        Conversion(9,"Miles to Kilometers","mi","km",1.60934),
        Conversion(10,"Kilometers to Miles","km","mi",0.621371)

    )
}