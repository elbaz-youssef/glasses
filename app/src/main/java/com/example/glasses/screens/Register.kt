package com.example.glasses.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.glasses.common.CustomTextField
import com.example.glasses.common.MainTitle
import com.example.glasses.common.PrimaryButton
import com.example.glasses.common.VerticalSpace

@Composable
fun Register(navController: NavController) {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        MainTitle("Create Account")
        VerticalSpace(16.dp)

        CustomTextField(value = name, onValueChange = { name = it }, placeholderText = "Full Name")
        VerticalSpace(16.dp)

        CustomTextField(value = email, onValueChange = { email = it }, placeholderText = "Email")
        VerticalSpace(16.dp)

        CustomTextField(
            value = password,
            onValueChange = { password = it },
            placeholderText = "Password",
            isPassword = true
        )
        VerticalSpace(16.dp)

        PrimaryButton(onClick = {navController.navigate("login")}, text = "Create Account")

        Button(
            onClick = {navController.navigate("login")},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,
                contentColor = Color.Gray
            )
        ) {
            Text("Already have an account? Login")
        }

    }
}