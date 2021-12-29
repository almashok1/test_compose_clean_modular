package com.example.testingcompose.ui.screens.all_anime

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ListItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.example.arch.models.OutcomeState
import com.example.testingcompose.ui.DefaultStateBase
import org.koin.androidx.compose.getViewModel

@ExperimentalMaterialApi
@Composable
fun AllAnimeScreen(
    viewModel: AllAnimeViewModel = getViewModel()
) {
    val state = viewModel.state.collectAsState(initial = OutcomeState.Idle)

    DefaultStateBase(state) {
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            val data = it.data ?: emptyList()
            items(data.size) { pos ->
                ListItem(
                    text = { Text(data[pos], fontWeight = FontWeight.Medium) }
                )
            }
        }
    }
}