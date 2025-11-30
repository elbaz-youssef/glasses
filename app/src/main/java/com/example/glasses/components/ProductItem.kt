package com.example.glasses.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight

@Composable
fun ProductItem(productImg: Int, altText: String, name: String, price: String, modifier: Modifier = Modifier, onClick : () -> Unit) {

    Column(modifier = modifier.clickable {onClick()}) {
        Image(painter = painterResource(productImg), altText, modifier = Modifier.clip(RoundedCornerShape(8.dp)))
        VerticalSpace(16.dp)
        Text(name, fontWeight = FontWeight.Medium)
        Text(price, color = Color.Gray)
    }
}