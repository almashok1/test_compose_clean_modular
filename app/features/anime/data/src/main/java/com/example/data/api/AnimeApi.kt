package com.example.data.api

import com.example.arch.models.Outcome
import com.example.domain.models.AnimeQuote
import retrofit2.http.GET

interface AnimeApi {

    @GET("random")
    suspend fun getRandomQuote(): Outcome<AnimeQuote>

    @GET("quotes")
    suspend fun get10RandomQuotes(): Outcome<List<AnimeQuote>>

    @GET("available/anime")
    suspend fun getAllAvailableAnime(): Outcome<List<String>>

}