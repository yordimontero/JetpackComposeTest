package com.example.jetpackcomposetest.ui.composableviews.home

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposetest.data.cache.CardData
import com.example.jetpackcomposetest.ui.composableviews.home.card.CardItem

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun CardSection() {
    LazyRow {
        items(CardData().items.size) { index ->
            CardItem(
                index = index, cardData = CardData().items
            )
        }
    }
}