package com.example.domain.usecases

import com.example.arch.models.Outcome
import com.example.domain.repository.AnimeRepository

interface GetAllAvailableAnimeUseCase {

    suspend operator fun invoke(): Outcome<List<String>>

    class Base(
        private val repo: AnimeRepository
    ) : GetAllAvailableAnimeUseCase {

        override suspend operator fun invoke() = repo.getAllAvailableAnime()
    }

}