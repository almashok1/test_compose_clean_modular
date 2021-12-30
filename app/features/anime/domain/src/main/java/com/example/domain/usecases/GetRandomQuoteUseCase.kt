package com.example.domain.usecases

import com.example.arch.models.Outcome
import com.example.domain.models.AnimeQuote
import com.example.domain.repository.AnimeRepository

interface GetRandomQuoteUseCase {

    suspend operator fun invoke(): Outcome<AnimeQuote>

    class Base(
        private val repo: AnimeRepository
    ) : GetRandomQuoteUseCase {

        override suspend operator fun invoke() = repo.getRandomQuote()
    }

}