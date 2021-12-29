package com.example.testingcompose.ui.screens.quotes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.base.extensions.getState
import com.example.domain.models.AnimeQuote
import com.example.domain.usecases.Get10RandomQuotesUseCase
import kotlinx.coroutines.launch

class QuotesViewModel(
    private val get10RandomQuotesUseCase: Get10RandomQuotesUseCase
) : ViewModel() {

    private val _state = getState<List<AnimeQuote>>()
    val state = _state.flow

    private fun get10RandomQuotes() {
        viewModelScope.launch {
            _state.request { get10RandomQuotesUseCase() }
        }
    }

    init {
        get10RandomQuotes()
    }

}