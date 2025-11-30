package com.example.glasses.models

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

data class SizeInfo(
    val text: String,
    val isSelected: MutableState<Boolean> = mutableStateOf(false)
)