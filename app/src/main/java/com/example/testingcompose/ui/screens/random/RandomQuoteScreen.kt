package com.example.testingcompose.ui.screens.random

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.arch.models.OutcomeState
import com.example.testingcompose.R
import com.example.testingcompose.ui.DefaultStateBase
import org.koin.androidx.compose.getViewModel

@ExperimentalMaterialApi
@Composable
fun RandomQuoteScreen(
    viewModel: RandomQuoteViewModel = getViewModel()
) {
    val state = viewModel.state.collectAsState(initial = OutcomeState.Idle)

    DefaultStateBase(state) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            val data = it.data
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ListItem(
                    text = {
                        Column {
                            Text(data?.anime ?: "", fontWeight = FontWeight.Black)
                            Size(height = 2.dp.value, width = 0.dp.value)
                            Text(data?.character ?: "", fontWeight = FontWeight.Medium)
                        }
                    },
                    secondaryText = { Text(data?.quote ?: "", fontWeight = FontWeight.Normal) },
                )
                OutlinedButton(
                    modifier = Modifier.padding(16.dp),
                    onClick = { viewModel.getRandomQuote() }
                ) {
                    Text(text = stringResource(id = R.string.get_another_quote))
                }
            }
        }
    }
}