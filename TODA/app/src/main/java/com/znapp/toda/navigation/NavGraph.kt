package com.znapp.toda.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.znapp.toda.screens.WelcomeScreen

@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = Screen.Welcome.route
    ){
        composable(
            route = Screen.Welcome.route
        ){
            WelcomeScreen()
        }
    }
}