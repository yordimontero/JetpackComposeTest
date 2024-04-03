package com.example.jetpackcomposetest.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import com.example.jetpackcomposetest.data.BottomNavigationItem
import com.example.jetpackcomposetest.navigation.Screen

val items = listOf(
    BottomNavigationItem(
        title = "Home",
        icon = Icons.Rounded.Home,
        route = Screen.HomeScreen.route
    ),
    BottomNavigationItem(
        title = "Wallet",
        icon = Icons.Rounded.Wallet,
        route = Screen.WalletScreen.route
    ),
    BottomNavigationItem(
        title = "Notifications",
        icon = Icons.Rounded.Notifications,
        route = Screen.NotificationsScreen.route
    ),
    BottomNavigationItem(
        title = "Account",
        icon = Icons.Rounded.AccountCircle,
        route = Screen.AccountScreen.route
    )
)

@Composable
fun BottomNavigationBar(navController: NavController) {
    NavigationBar {
        Row(
            modifier = Modifier.background(MaterialTheme.colorScheme.inverseOnSurface)
        ) {

            items.forEachIndexed { index, item ->
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
                    }
                )
            }

        }
    }
}