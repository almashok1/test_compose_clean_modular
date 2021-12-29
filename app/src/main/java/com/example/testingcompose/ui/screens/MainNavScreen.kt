package com.example.testingcompose.ui.screens

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.testingcompose.R

sealed class MainNavScreen(
    val route: String,
    @StringRes val title: Int,
    val icon: ImageVector
) {

    object Quotes : MainNavScreen(
        route = "quotes",
        title = R.string.nav_quotes,
        icon = Icons.Default.Home
    )

    object RandomQuote : MainNavScreen(
        route = "random-quote",
        title = R.string.nav_random_quote,
        icon = Icons.Default.Info
    )

    object AllAnime : MainNavScreen(
        route = "all-anime",
        title = R.string.nav_all_anime,
        icon = Icons.Default.List
    )

}