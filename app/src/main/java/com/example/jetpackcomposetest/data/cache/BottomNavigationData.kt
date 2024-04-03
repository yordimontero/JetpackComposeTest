package com.example.jetpackcomposetest.data.cache

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Wallet
import com.example.jetpackcomposetest.data.model.BottomNavigationItem
import com.example.jetpackcomposetest.navigation.Screen

class BottomNavigationData {
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
}