package com.example.jetpackcomposetest.ui.utils

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

fun getGradient(
    startColor: Color,
    endColor: Color
): Brush = Brush.horizontalGradient(
    colors = listOf(startColor, endColor)
)