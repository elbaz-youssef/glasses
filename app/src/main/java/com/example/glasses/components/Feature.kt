package com.example.glasses.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.sp

@Composable
fun Feature(iconUrl: Int ,altText: String, description: String, padding: Dp = 10.dp, iconWidth: Dp = 40.dp, textColor: Color = Color.Gray) {
    Column(
        modifier = Modifier.padding(padding),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            painter = painterResource(iconUrl),
            contentDescription = altText,
            modifier = Modifier.width(iconWidth)
        )
        Text(text = description, color = textColor, fontWeight = FontWeight.Light, fontSize = 14.sp)
    }
}