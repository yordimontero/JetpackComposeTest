package com.example.jetpackcomposetest.navigation

const val DETAIL_ARGUMENT_KEY: String = "id"
const val DETAIL_ARGUMENT_KEY2: String = "name"

sealed class Screen(val route: String) {
    object Home: Screen(route = "home_screen")
    /*object Detail: Screen(route = "detail_screen/{$DETAIL_ARGUMENT_KEY}/{$DETAIL_ARGUMENT_KEY2}") {
        fun passId(id: Int): String = route.replace(oldValue = "{$DETAIL_ARGUMENT_KEY}", newValue = id.toString())

        fun passNameAndId(
            name: String, id: Int
        ): String = route.replace(
            oldValue = "{$DETAIL_ARGUMENT_KEY}", newValue = id.toString()
        ).replace(
            oldValue = "{$DETAIL_ARGUMENT_KEY2}", newValue = name
        )

    }*/

    object Detail: Screen(route = "detail_screen?id={$DETAIL_ARGUMENT_KEY}&name={$DETAIL_ARGUMENT_KEY2}") {
        fun passId(id: Int = 0): String = "detail_screen?id=$id"

        fun passNameAndId(id: Int = 0, name: String = ""): String = "detail_screen?id=$id&name=$name"

    }

}
