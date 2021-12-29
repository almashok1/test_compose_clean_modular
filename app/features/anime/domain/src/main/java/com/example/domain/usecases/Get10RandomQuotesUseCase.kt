package com.example.domain.usecases

import com.example.domain.repository.AnimeRepository

class Get10RandomQuotesUseCase(
    private val repo: AnimeRepository
) {

    suspend operator fun invoke() = repo.get10RandomQuotes()

}