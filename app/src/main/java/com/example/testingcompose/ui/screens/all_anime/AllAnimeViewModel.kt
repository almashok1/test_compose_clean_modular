package com.example.testingcompose.ui.screens.all_anime

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.base.extensions.getState
import com.example.domain.usecases.GetAllAvailableAnimeUseCase
import kotlinx.coroutines.launch

class AllAnimeViewModel(
    private val getAllAvailableAnimeUseCase: GetAllAvailableAnimeUseCase
) : ViewModel() {

    private val _state = getState<List<String>>()
    val state = _state.flow

    private fun getAllAvailableAnime() {
        viewModelScope.launch {
            _state.request { getAllAvailableAnimeUseCase() }
        }
    }

    init {
        getAllAvailableAnime()
    }

}