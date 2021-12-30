package com.example.testingcompose.ui.screens.random

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.base.extensions.getState
import com.example.domain.models.AnimeQuote
import com.example.domain.usecases.GetRandomQuoteUseCase
import kotlinx.coroutines.launch

class RandomQuoteViewModel(
    private val getRandomQuoteUseCase: GetRandomQuoteUseCase
) : ViewModel() {

    private val _state = getState<AnimeQuote>()
    val state = _state.flow

    fun getRandomQuote() {
        viewModelScope.launch {
            _state.request { getRandomQuoteUseCase() }
        }
    }

    init {
        getRandomQuote()
    }

}