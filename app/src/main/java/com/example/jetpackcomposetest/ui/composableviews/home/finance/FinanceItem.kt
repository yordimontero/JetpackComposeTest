package com.example.jetpackcomposetest.ui.composableviews.home.finance

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetest.data.model.Finance

@Composable
fun FinanceItem(index: Int, financeData: List<Finance>) {

    val financeItem = financeData[index]

    var lastPaddingEnd = 0.dp
    if (index == financeData.size - 1) lastPaddingEnd = 16.dp

    Box(
        modifier = Modifier
            .padding(start = 16.dp, end = lastPaddingEnd)
    ) {

        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(MaterialTheme.colorScheme.secondaryContainer)
                .size(135.dp)
                .clickable { /*_*/ }
                .padding(13.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .background(financeItem.background)
                    .padding(6.dp)
            ) {
                Icon(
                    imageVector = financeItem.icon,
                    contentDescription = financeItem.name,
                    tint = Color.White
                )
            }

            Text(
                text = financeItem.name,
                color = MaterialTheme.colorScheme.onSecondaryContainer,
                fontWeight = FontWeight.SemiBold,
                fontSize = 15.sp
            )

        }

    }

}