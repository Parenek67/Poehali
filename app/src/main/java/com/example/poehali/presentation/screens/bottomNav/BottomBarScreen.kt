package com.example.poehali.presentation.screens.bottomNav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Dicts : BottomBarScreen(
        route = "dicts",
        title = "Словари",
        icon = Icons.Default.Home
    )

    object Trainer : BottomBarScreen(
        route = "trainer",
        title = "Тренажер",
        icon = Icons.Default.Settings
    )

    object Profile : BottomBarScreen(
        route = "profile",
        title = "Профиль",
        icon = Icons.Default.Person
    )
}