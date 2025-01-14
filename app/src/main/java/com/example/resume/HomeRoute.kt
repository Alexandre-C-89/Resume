package com.example.resume

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.resume.designsystem.AppScaffold
import com.example.resume.designsystem.bar.TopBar

@Composable
fun HomeRoute(

){
    HomeScreen(

    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(

){
   AppScaffold(
    topBar = {
        TopBar(text = "Alexandre")
    }
   ) {
       Text(text = "Welcome")
   }
}

@Preview
@Composable
fun HomeRoutePreview(){
    HomeScreen()
}