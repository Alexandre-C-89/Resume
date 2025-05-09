package com.example.resume

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.resume.designsystem.AppScaffold
import com.example.resume.designsystem.Spacer
import com.example.resume.designsystem.bar.TopBar

@Composable
fun HomeRoute(
    onClick:() -> Unit
){
    HomeScreen(
        onClick = onClick
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onClick:() -> Unit
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
           Spacer.Vertical.Medium()
           Card(
               modifier = Modifier.fillMaxWidth().height(200.dp),
               onClick = onClick
           ) {
               Text(
                   text = "Qobuz (alternance) 2023-2024",
                   fontSize = 16.sp,
                   fontWeight = FontWeight.Bold
               )
               Text(
                   text = "Android Developper"
               )
           }
       }
   }
}

@Preview
@Composable
fun HomeRoutePreview(){
    HomeScreen(
        onClick = {}
    )
}