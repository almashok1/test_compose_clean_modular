package com.example.testingcompose.di

import com.example.data.repository.AnimeRepositoryImpl
import com.example.domain.repository.AnimeRepository
import org.koin.dsl.module

val dataModule = module {

    single<AnimeRepository> { AnimeRepositoryImpl(get()) }

}