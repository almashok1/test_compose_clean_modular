package com.example.testingcompose.di

import com.example.domain.usecases.Get10RandomQuotesUseCase
import com.example.domain.usecases.GetAllAvailableAnimeUseCase
import com.example.domain.usecases.GetRandomQuoteUseCase
import org.koin.dsl.module

val domainModule = module {

    factory { GetAllAvailableAnimeUseCase(get()) }
    factory { Get10RandomQuotesUseCase(get()) }
    factory { GetRandomQuoteUseCase(get()) }

}