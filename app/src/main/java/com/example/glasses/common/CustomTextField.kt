package com.example.glasses.common

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomTextField(value: String, onValueChange: (String) -> Unit, placeholderText: String, isPassword: Boolean = false) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        placeholder = { Text(placeholderText, style = TextStyle(fontSize = 14.sp)) },
        singleLine = true,
        shape = RoundedCornerShape(50.dp),
        visualTransformation = if (isPassword) PasswordVisualTransformation() else VisualTransformation.None,
        colors = TextFieldDefaults.colors(
            unfocusedContainerColor = Color(240, 240, 240, 255),
            focusedContainerColor = Color(240, 240, 240, 255),
            unfocusedIndicatorColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            errorIndicatorColor = Color.Transparent,
            unfocusedPlaceholderColor = Color.Gray,
            focusedPlaceholderColor = Color.Gray
        ),
        modifier = Modifier
            .fillMaxWidth()
    )
}