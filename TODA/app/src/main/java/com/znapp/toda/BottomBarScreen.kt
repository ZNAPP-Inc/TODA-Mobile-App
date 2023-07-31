package com.znapp.toda

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Route
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object TODARoutes : BottomBarScreen(
        route = "toda_routes",
        title = "TODA Routes",
        icon = Icons.Default.Route
    )

    object Map : BottomBarScreen(
        route = "map",
        title = "Map",
        icon = Icons.Default.Place
    )

    object Profile : BottomBarScreen(
        route = "profile",
        title = "Profile",
        icon = Icons.Default.AccountCircle
    )
}
