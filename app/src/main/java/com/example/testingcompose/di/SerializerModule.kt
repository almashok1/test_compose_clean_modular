package com.example.testingcompose.di

import com.example.api.MoshiSerializer
import com.example.api.RetrofitConverterFactory
import com.example.arch.api.JsonSerializer
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.koin.dsl.module

val serializerModule = module {

    single<Moshi> { Moshi.Builder()
        .add(KotlinJsonAdapterFactory()).build()
    }

    single<JsonSerializer> { MoshiSerializer(get())  }

    single<RetrofitConverterFactory> { MoshiSerializer(get())  }

}