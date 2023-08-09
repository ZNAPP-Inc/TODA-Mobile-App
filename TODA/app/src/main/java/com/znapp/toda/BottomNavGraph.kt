package com.znapp.toda

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.znapp.toda.screens.main.MapScreen
import com.znapp.toda.screens.main.ProfileScreen
import com.znapp.toda.screens.main.TODARoutesScreen

@Composable
fun BottomNavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.TODA_Routes.route
    ) {
        composable(route = BottomBarScreen.TODA_Routes.route){
            TODARoutesScreen()
        }

        composable(route = BottomBarScreen.Map.route){
            MapScreen()
        }

        composable(route = BottomBarScreen.Profile.route){
            ProfileScreen(userData = null) {
                
            }
        }
    }
}