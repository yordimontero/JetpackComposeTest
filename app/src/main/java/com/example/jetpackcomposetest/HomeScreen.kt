package com.example.jetpackcomposetest

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposetest.components.CustomButton
import com.example.jetpackcomposetest.components.CustomEditText
import com.example.jetpackcomposetest.components.CustomSpacer
import com.example.jetpackcomposetest.navigation.Screen

@Composable
fun HomeScreen(
    navController: NavController
) {
    /*Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Home",
            color = MaterialTheme.colorScheme.primary,
            fontSize = MaterialTheme.typography.titleLarge.fontSize,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.clickable {
                //navController.navigate(route = Screen.Detail.route)
                //navController.navigate(route = Screen.Detail.passId(15))
                //navController.navigate(route = Screen.Detail.passNameAndId("Moma", 25))
                //navController.navigate(route = Screen.Detail.passId(6))
                navController.navigate(route = Screen.Detail.passNameAndId(id = 6, name = "La sexta es inevitable"))
            }
        )
    }*/

    var name by remember { mutableStateOf("") }
    var id by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        CustomEditText { name = it }
        CustomSpacer(width = 0.dp, height = 30.dp)
        CustomEditText { id = it }
        CustomSpacer(width = 0.dp, height = 30.dp)

        CustomButton(
            text = "Continue",
            loadingText = "",
            onClick = {
                navController.navigate(route = Screen.Detail.passNameAndId(id = id.toInt(), name = name))
            }
        )

    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(navController = rememberNavController())
}