package com.example.domain.usecases

import com.example.arch.models.Outcome
import com.example.domain.models.AnimeQuote
import com.example.domain.repository.AnimeRepository

interface Get10RandomQuotesUseCase {

    suspend operator fun invoke(): Outcome<List<AnimeQuote>>

    class Base(
        private val repo: AnimeRepository
    ) : Get10RandomQuotesUseCase {

        override suspend operator fun invoke() = repo.get10RandomQuotes()
    }

}