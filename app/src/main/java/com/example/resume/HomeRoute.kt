package com.example.resume

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
       Column(
           modifier = Modifier
               .fillMaxSize()
               .padding(8.dp)
       ) {
           Text(text = "Welcome")
       }
   }
}

@Preview
@Composable
fun HomeRoutePreview(){
    HomeScreen()
}