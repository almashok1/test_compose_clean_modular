package com.example.domain.usecases

import com.example.domain.repository.AnimeRepository

class GetAllAvailableAnimeUseCase(
    private val repo: AnimeRepository
) {

    suspend operator fun invoke() = repo.getAllAvailableAnime()

}