package com.asifj96.whatsappui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.asifj96.whatsappui.ui.screens.HomeScreen
import com.asifj96.whatsappui.ui.theme.WhatsappUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WhatsappUITheme {
                HomeScreen()
            }
        }
    }
}

@Preview
@Composable
fun WhatsappPreview() {
    WhatsappUITheme {
        HomeScreen()
    }
}