package com.example.jetpackcomposetest.ui.composableviews.home.finance

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposetest.data.cache.FinanceData

@Composable
fun FinanceItem(index: Int) {

    val financeData = FinanceData().data
    val financeItem = financeData[index]

    var lastPaddingEnd = 0.dp
    if (index == financeData.size - 1) lastPaddingEnd = 16.dp

    // ...

}