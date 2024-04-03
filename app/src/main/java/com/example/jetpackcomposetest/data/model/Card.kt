package com.example.jetpackcomposetest.data.model

import androidx.compose.ui.graphics.Brush

data class Card(
    val type: String,
    val number: String,
    val name: String,
    val balance: String,
    val color: Brush
)
