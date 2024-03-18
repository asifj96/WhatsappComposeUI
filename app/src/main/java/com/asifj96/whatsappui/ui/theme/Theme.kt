package com.asifj96.whatsappui.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.platform.LocalView
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val DarkColorScheme = darkColorScheme(
    primary = Gray,
    secondary = LightGray,
    background = LightGray,
    tertiary = White
)

private val LightColorScheme = lightColorScheme(
    primary = Green,
    secondary = LightGreen,
    background = White,
    tertiary = White
)

@Composable
fun WhatsappUITheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }


    val view = LocalView.current
    if (!view.isInEditMode) {
        val systemUiController = rememberSystemUiController()
        val statusBarColor = if (isSystemInDarkTheme()) {
            Gray
        } else {
            Green
        }
        val navigationBarColor = if (isSystemInDarkTheme()) {
            LightGray
        } else {
            White
        }

        SideEffect {
            systemUiController.setStatusBarColor(statusBarColor)
            systemUiController.setNavigationBarColor(navigationBarColor)
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}