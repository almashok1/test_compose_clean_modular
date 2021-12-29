package com.example.testingcompose.di

import com.example.testingcompose.ui.screens.all_anime.AllAnimeViewModel
import com.example.testingcompose.ui.screens.quotes.QuotesViewModel
import com.example.testingcompose.ui.screens.random.RandomQuoteViewModel
import org.koin.dsl.module

val appModule = module {
    factory { QuotesViewModel(get()) }
    factory { AllAnimeViewModel(get()) }
    factory { RandomQuoteViewModel(get()) }
}