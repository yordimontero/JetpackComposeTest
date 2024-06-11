package com.example.jetpackcomposetest.data.cache

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AttachMoney
import androidx.compose.material.icons.rounded.CurrencyYen
import androidx.compose.material.icons.rounded.Euro
import com.example.jetpackcomposetest.data.model.Currency

class CurrencyData {
    val items = listOf(
        Currency(
            name = "USD",
            buy = 23.35F,
            sell = 23.25F,
            icon = Icons.Rounded.AttachMoney
        ),

        Currency(
            name = "EURO",
            buy = 25.35F,
            sell = 24.25F,
            icon = Icons.Rounded.Euro
        ),

        Currency(
            name = "YEN",
            buy = 27.35F,
            sell = 22.25F,
            icon = Icons.Rounded.CurrencyYen
        )
    )
}