package com.example.resume.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.resume.HomeRoute
import com.example.resume.utils.Screen

@Composable
fun AppNavHost(){

    val navController = rememberNavController()

    NavHost(
        startDestination = Screen.Home.route,
        navController = navController
    ){
        composable(Screen.Home.route){
            HomeRoute()
        }
    }

}