package com.example.domain.repository

import com.example.arch.models.Outcome
import com.example.domain.models.AnimeQuote

interface AnimeRepository {

    suspend fun getRandomQuote(): Outcome<AnimeQuote>

    suspend fun get10RandomQuotes(): Outcome<List<AnimeQuote>>

    suspend fun getAllAvailableAnime(): Outcome<List<String>>

}