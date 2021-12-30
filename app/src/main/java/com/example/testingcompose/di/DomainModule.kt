package com.example.testingcompose.di

import com.example.domain.usecases.Get10RandomQuotesUseCase
import com.example.domain.usecases.GetAllAvailableAnimeUseCase
import com.example.domain.usecases.GetRandomQuoteUseCase
import org.koin.dsl.module

val domainModule = module {

    factory<GetAllAvailableAnimeUseCase> { GetAllAvailableAnimeUseCase.Base(get()) }
    factory<Get10RandomQuotesUseCase> { Get10RandomQuotesUseCase.Base(get()) }
    factory<GetRandomQuoteUseCase> { GetRandomQuoteUseCase.Base(get()) }

}