package com.example.resume

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.resume.utils.Screen

@Composable
fun HomeRoute(

){
    HomeScreen(

    )
}

@Composable
fun HomeScreen(

){
    Text(text = "Welcome")
}

@Preview
@Composable
fun HomeRoutePreview(){
    HomeScreen()
}