package com.example.domain.usecases

import com.example.domain.repository.AnimeRepository

class GetRandomQuoteUseCase(
    private val repo: AnimeRepository
) {

    suspend operator fun invoke() = repo.getRandomQuote()

}