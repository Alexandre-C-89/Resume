package com.example.resume.utils

sealed class Screen(val route: String) {
    object Home : Screen("Home")
    object Details : Screen("Details")
    object SeriesDetails : Screen("Tv")
    object Search : Screen("Search")
    object Actor : Screen("Actor")
}