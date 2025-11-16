package com.example.glasses.common

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier

@Composable
fun HorizontalSpace(width: Dp) {
    Spacer(modifier = Modifier.width(10.dp))
}