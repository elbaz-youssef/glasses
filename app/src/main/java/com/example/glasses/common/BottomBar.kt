package com.example.glasses.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier

@Composable
fun BottomBar() {
    Row(modifier = Modifier.padding(16.dp), horizontalArrangement = Arrangement.SpaceAround) {
        Column {
            Text("Products")
        }
        Spacer(modifier = Modifier.weight(1f))
        Column {
            Text("Cart")
        }
        Spacer(modifier = Modifier.weight(1f))
        Column {
            Text("Account")
        }
    }
}