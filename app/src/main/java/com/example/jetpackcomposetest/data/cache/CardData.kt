package com.example.jetpackcomposetest.data.cache

import com.example.jetpackcomposetest.data.model.Card
import com.example.jetpackcomposetest.ui.theme.BlueEnd
import com.example.jetpackcomposetest.ui.theme.BlueStart
import com.example.jetpackcomposetest.ui.theme.GreenEnd
import com.example.jetpackcomposetest.ui.theme.GreenStart
import com.example.jetpackcomposetest.ui.theme.OrangeStart
import com.example.jetpackcomposetest.ui.theme.PurpleEnd
import com.example.jetpackcomposetest.ui.theme.PurpleStart
import com.example.jetpackcomposetest.ui.utils.getGradient

class CardData {
    val items = listOf(
        Card(
            type = "VISA",
            number = "1234 4321 5678 8765",
            name = "Business",
            balance = "550.00",
            color = getGradient(
                startColor = PurpleStart,
                endColor = PurpleEnd
            )
        ),
        Card(
            type = "MASTER CARD",
            number = "1234 4321 5678 8765",
            name = "Savings",
            balance = "550.00",
            color = getGradient(
                startColor = BlueStart,
                endColor = BlueEnd
            )
        ),
        Card(
            type = "VISA",
            number = "1234 4321 5678 8765",
            name = "School",
            balance = "550.00",
            color = getGradient(
                startColor = OrangeStart,
                endColor = OrangeStart
            )
        ),
        Card(
            type = "MASTER CARD",
            number = "1234 4321 5678 8765",
            name = "Trips",
            balance = "550.00",
            color = getGradient(
                startColor = GreenStart,
                endColor = GreenEnd
            )
        )
    )
}