package com.example.jetpackcomposetest.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import com.example.jetpackcomposetest.data.cache.BottomNavigationData
import com.example.jetpackcomposetest.navigation.Screen

@Composable
fun BottomNavigationBar(navController: NavController) {
    NavigationBar {
        Row(
            modifier = Modifier.background(MaterialTheme.colorScheme.inverseOnSurface)
        ) {

            BottomNavigationData().items.forEachIndexed { index, item ->
                NavigationBarItem(
                    selected = navController.currentDestination?.hierarchy?.any { it.route == item.route } == true /*_*/,
                    onClick = {
                        when (index) {

                            0 -> {
                                navController.navigate(route = Screen.HomeScreen.route)
                            }

                            1 -> {
                                navController.navigate(route = Screen.WalletScreen.route)
                            }

                        }
                    },
                    icon = {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = item.title,
                            tint = MaterialTheme.colorScheme.onBackground
                        )
                    },
                    label = {
                        Text(
                            text = item.title,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    }
                )
            }

        }
    }
}