package com.example.data.repository

import com.example.arch.models.Outcome
import com.example.data.api.AnimeApi
import com.example.domain.models.AnimeQuote
import com.example.domain.repository.AnimeRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class AnimeRepositoryImpl(
    private val api: AnimeApi
) : AnimeRepository {
    override suspend fun getRandomQuote(): Outcome<AnimeQuote> = withContext(Dispatchers.IO) {
        api.getRandomQuote()
    }

    override suspend fun get10RandomQuotes(): Outcome<List<AnimeQuote>> = withContext(Dispatchers.IO) {
        api.get10RandomQuotes()
    }
    override suspend fun getAllAvailableAnime(): Outcome<List<String>> = withContext(Dispatchers.IO) {
        api.getAllAvailableAnime()
    }
}