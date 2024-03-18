package com.asifj96.whatsappui.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.asifj96.whatsappui.ui.components.AppbarComponent

@Composable
fun HomeScreen() {
    Column {
        AppbarComponent()
    }
}

@Preview
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
}
