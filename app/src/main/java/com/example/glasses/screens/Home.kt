package com.example.glasses.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.glasses.R
import com.example.glasses.common.Feature
import com.example.glasses.common.PrimaryButton


@Composable
fun Home(navController: NavController) {
    Scaffold(
        topBar = {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp, 24.dp)) {
                Text(text = "LensCrafters", fontWeight = FontWeight.Bold)
            }
        },
        bottomBar = {
            Box(modifier = Modifier.padding(16.dp)) {
                PrimaryButton(onClick = {navController.navigate("login")}, text = "Get Started")
            }
        }
    ) { paddingValues ->
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
            .verticalScroll(rememberScrollState())
        ) {
            Image(
                painter = painterResource(R.drawable.hero_glasses_store),
                contentDescription = "Hero"
            )
            Text(
                modifier = Modifier.padding(40.dp, 20.dp),
                textAlign = TextAlign.Center,
                text = "Discover handcrafted glasses that combine elegance, comfort, and perfect clarity."
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Feature(R.drawable.free_shipping, "Free Shipping", "Free Shipping")
                Spacer(modifier = Modifier.width(16.dp))
                Spacer(
                    modifier = Modifier
                        .height(50.dp)
                        .width(1.dp)
                        .background(Color.LightGray)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Feature(R.drawable.secure_payment, "Secure Payment", "Secure Payment")
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Feature(R.drawable.weekly_support, "Support", "24/7 Support")
            }
        }
    }
}