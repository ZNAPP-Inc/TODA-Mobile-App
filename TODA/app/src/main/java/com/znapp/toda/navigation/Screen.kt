package com.znapp.toda.navigation

sealed class Screen(val route: String) {
    object Welcome: Screen(route = "welcome_screen")
}
