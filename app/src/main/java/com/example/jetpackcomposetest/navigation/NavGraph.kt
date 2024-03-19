package com.example.jetpackcomposetest.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.jetpackcomposetest.DetailScreen
import com.example.jetpackcomposetest.HomeScreen

@Composable
fun SetUpNavGraph(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = Screen.Home.route) {

        composable(route = Screen.Home.route) {
            HomeScreen(navController)
        }

        composable(route = Screen.Detail.route) {
            DetailScreen(navController)
        }

    }
}