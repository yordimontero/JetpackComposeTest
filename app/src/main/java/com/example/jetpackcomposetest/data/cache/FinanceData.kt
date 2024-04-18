package com.example.jetpackcomposetest.data.cache

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.StarHalf
import androidx.compose.material.icons.rounded.MonetizationOn
import androidx.compose.material.icons.rounded.Wallet
import com.example.jetpackcomposetest.data.model.Finance
import com.example.jetpackcomposetest.ui.theme.BlueStart
import com.example.jetpackcomposetest.ui.theme.GreenStart
import com.example.jetpackcomposetest.ui.theme.OrangeStart
import com.example.jetpackcomposetest.ui.theme.PurpleStart

class FinanceData {
    val data = listOf(
        Finance(
            icon = Icons.AutoMirrored.Rounded.StarHalf,
            name = "My\nBusiness",
            background = OrangeStart
        ),
        Finance(
            icon = Icons.Rounded.Wallet,
            name = "My\nWallet",
            background = BlueStart
        ),
        Finance(
            icon = Icons.AutoMirrored.Rounded.StarHalf,
            name = "Finance\nAnalytics",
            background = PurpleStart
        ),
        Finance(
            icon = Icons.Rounded.MonetizationOn,
            name = "My\nTransactions",
            background = GreenStart
        )
    )
}