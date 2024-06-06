package com.example.jetpackcomposetest.ui.composableviews.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetest.data.cache.FinanceData
import com.example.jetpackcomposetest.ui.composableviews.home.finance.FinanceItem

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun FinanceSection() {
    Column {

        Text(
            text = "Finance",
            fontSize = 24.sp,
            color = MaterialTheme.colorScheme.onBackground,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp)
        )

        LazyRow {
            items(FinanceData().data.size) { index ->
                FinanceItem(index = index, financeData = FinanceData().data)
            }
        }

    }
}