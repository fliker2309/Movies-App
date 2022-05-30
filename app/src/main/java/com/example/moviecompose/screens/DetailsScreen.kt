package com.example.moviecompose.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.navigation.NavController
import com.example.moviecompose.MainViewModel

@Composable
fun DetailsScreen(navController: NavController, viewModel: MainViewModel, itemId: String) {
    val currentItem = viewModel.allMovies.observeAsState().value

    Text(text = "This is a movie ${itemId}")
}
