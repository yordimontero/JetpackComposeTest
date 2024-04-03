package com.example.jetpackcomposetest.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.jetpackcomposetest.HomeScreen
import com.example.jetpackcomposetest.WalletScreen

@Composable
fun SetUpNavGraph(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {

        composable(route = Screen.HomeScreen.route) {
            HomeScreen(navController)
        }

        composable(
            route = Screen.WalletScreen.route/*,
            arguments = listOf(
                navArgument(DETAIL_ARGUMENT_KEY) {
                    type = NavType.IntType
                    defaultValue = 0
                    //nullable = true // FIXME: IntType doesn't support nullables.
                },
                navArgument(DETAIL_ARGUMENT_KEY2) {
                    type = NavType.StringType
                    nullable = true
                }
            )*/
        ) {
            //Log.wtf("TAG", "Argument 1: ${it.arguments?.getInt(DETAIL_ARGUMENT_KEY).toString()}")
            //Log.wtf("TAG", "Argument 2: ${it.arguments?.getString(DETAIL_ARGUMENT_KEY2).toString()}")
            WalletScreen(navController)
        }

    }
}