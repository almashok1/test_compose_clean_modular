package com.example.testingcompose.di

import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.example.api.ApiBuilder
import com.example.data.api.ANIME_BASE_URL
import com.example.data.api.AnimeApi
import org.koin.dsl.module

val networkModule = module {

    single { ChuckerInterceptor.Builder(get()).build() }

    single<AnimeApi> {
        ApiBuilder(get(), get()).buildService(ANIME_BASE_URL, get<ChuckerInterceptor>())
    }

}