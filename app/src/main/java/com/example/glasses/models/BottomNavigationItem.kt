package com.example.glasses.models

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavigationItem(
    val icon: ImageVector,
    val contentDescription: String? = null,
    val title: String,
    val route: String,
    val isSelected: Boolean,
    val onClick: () -> Unit
)
