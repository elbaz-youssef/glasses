package com.example.glasses.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun HorizontalDivider(width: Dp = 1.dp, height: Dp, bg: Color = Color.LightGray) {
    Spacer(
        modifier = Modifier
            .width(width)
            .height(height)
            .background(bg)
    )
}