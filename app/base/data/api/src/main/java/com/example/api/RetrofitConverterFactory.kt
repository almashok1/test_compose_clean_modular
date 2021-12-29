package com.example.api

import retrofit2.Converter

interface RetrofitConverterFactory {

    fun getConverterFactory(): Converter.Factory

}