package com.example.jetpackcomposetest.ui.composableviews.home.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetest.R
import com.example.jetpackcomposetest.data.model.Card

@Composable
fun CardItem(index: Int, cardData: List<Card>) {

    val card = cardData[index]

    var lastItemPaddingEnd = 0.dp
    if (index == cardData.size - 1) lastItemPaddingEnd = 16.dp

    var image = painterResource(id = R.drawable.ic_visa)
    if (card.type == "MASTER CARD") image = painterResource(id = R.drawable.ic_mastercard)

    Box(
        modifier = Modifier.padding(
            start = 16.dp,
            end = lastItemPaddingEnd
        )
    ) {

        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(card.color)
                .width(250.dp)
                .height(160.dp)
                .padding(
                    vertical = 12.dp,
                    horizontal = 16.dp
                ),
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            Image(
                painter = image,
                contentDescription = card.name,
                colorFilter = ColorFilter.tint(Color.White),
                modifier = Modifier.width(60.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = card.name,
                color = Color.White,
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "$ ${card.balance}",
                color = Color.White,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = card.number,
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )

        }

    }

}