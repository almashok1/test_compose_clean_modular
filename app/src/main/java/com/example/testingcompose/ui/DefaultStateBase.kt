package com.example.testingcompose.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.arch.models.OutcomeState
import com.example.testingcompose.R

@Composable
fun <T> DefaultStateBase(
    state: State<OutcomeState<T>>,
    content: @Composable (OutcomeState.Success<T>) -> Unit
) {
    when (val value = state.value) {
        is OutcomeState.Error -> {
            Text(text = stringResource(id = R.string.error_text))
        }
        OutcomeState.Idle -> {}
        OutcomeState.Loading -> {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                CircularProgressIndicator()
            }
        }
        is OutcomeState.Success -> {
            content(value)
        }
    }
}