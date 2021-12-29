package com.example.testingcompose.ui.screens

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.testingcompose.ui.screens.all_anime.AllAnimeScreen
import com.example.testingcompose.ui.screens.quotes.QuotesScreen
import com.example.testingcompose.ui.screens.random.RandomQuoteScreen

@ExperimentalMaterialApi
@Composable
fun MainNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = MainNavScreen.Quotes.route) {

        composable(route = MainNavScreen.Quotes.route) {
            QuotesScreen()
        }

        composable(route = MainNavScreen.AllAnime.route) {
            AllAnimeScreen()
        }

        composable(route = MainNavScreen.RandomQuote.route) {
            RandomQuoteScreen()
        }

    }
}