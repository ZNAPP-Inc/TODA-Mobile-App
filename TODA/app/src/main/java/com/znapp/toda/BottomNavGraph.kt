package com.znapp.toda

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.znapp.toda.screens.MapScreen
import com.znapp.toda.screens.ProfileScreen
import com.znapp.toda.screens.TODARoutesScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.TODARoutes.route
    ) {
        composable(route = BottomBarScreen.TODARoutes.route){
            TODARoutesScreen()
        }
        composable(route = BottomBarScreen.Map.route){
            MapScreen()
        }
        composable(route = BottomBarScreen.Profile.route){
            ProfileScreen()
        }
    }
}