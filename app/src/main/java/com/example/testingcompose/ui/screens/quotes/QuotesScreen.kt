package com.example.testingcompose.ui.screens.quotes

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ListItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.arch.models.OutcomeState
import com.example.testingcompose.ui.DefaultStateBase
import org.koin.androidx.compose.getViewModel

@ExperimentalMaterialApi
@Composable
fun QuotesScreen(
    viewModel: QuotesViewModel = getViewModel()
) {
    val state = viewModel.state.collectAsState(initial = OutcomeState.Idle)

    DefaultStateBase(state) {
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            val data = it.data ?: emptyList()
            items(data.size) { pos ->
                ListItem(
                    text = {
                        Column {
                            Text(data[pos].anime, fontWeight = FontWeight.Black)
                            Size(height = 2.dp.value, width = 0.dp.value)
                            Text(data[pos].character, fontWeight = FontWeight.Medium)
                        }
                    },
                    secondaryText = { Text(data[pos].quote, fontWeight = FontWeight.Normal) },
                )
            }
        }
    }
}