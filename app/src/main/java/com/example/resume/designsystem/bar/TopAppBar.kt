package com.example.resume.designsystem.bar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.resume.designsystem.icon.BackIconButton
import com.example.resume.designsystem.icon.MenuIconButton
import com.example.resume.designsystem.icon.SearchIconButton

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    scrollBehavior: TopAppBarScrollBehavior? = null,
    onNavigationClick: (() -> Unit)? = null,
    onSearchClick: (() -> Unit)? = null,
    onBackClick: (() -> Unit)? = null,
    text: String? = null
) {
    Column{
        TopAppBar(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
            title = {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    if (text != null) {
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = text,
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Medium,
                                textAlign = TextAlign.Start,
                                color = White
                            )
                        )
                    }
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Black,
                titleContentColor = White,
                actionIconContentColor = White,
                navigationIconContentColor = White
            ),
            navigationIcon = {
                Box(modifier = Modifier.fillMaxHeight(), contentAlignment = Alignment.Center) {
                    onNavigationClick?.let {
                        MenuIconButton { onNavigationClick() }
                    }
                }
                Box(modifier = Modifier.fillMaxHeight(), contentAlignment = Alignment.Center) {
                    onBackClick?.let {
                        BackIconButton { onBackClick() }
                    }
                }
            },
            actions = {
                Box(modifier = Modifier.fillMaxHeight(), contentAlignment = Alignment.Center) {
                    onSearchClick?.let {
                        SearchIconButton { onSearchClick() }
                    }
                }
            },
            scrollBehavior = scrollBehavior
        )
    }
}