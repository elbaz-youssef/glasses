package com.example.glasses.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.glasses.ProductsViewModel
import com.example.glasses.common.MainTitle
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import com.example.glasses.common.HorizontalSpace
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.Modifier
import com.example.glasses.common.BottomBar
import com.example.glasses.common.PrimaryButton
import com.example.glasses.common.VerticalSpace


@SuppressLint("ViewModelConstructorInComposable")
@Composable
fun Cart(navController: NavController) {
    val products = ProductsViewModel().products
    Scaffold(
        bottomBar = {
            BottomBar()
        }
    ) {
        paddingValues ->
        Column(modifier = Modifier.fillMaxSize().padding(paddingValues).padding(16.dp).verticalScroll(rememberScrollState())) {
            MainTitle("Cart")
            for(i in 0..2) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(painter = painterResource(products[i].productImg), products[i].altText, modifier = Modifier.size(70.dp))
                    HorizontalSpace(16.dp)
                    Column {
                        Text(products[i].name)
                        Text(products[i].price, color = Color.Gray)
                    }
                }
                VerticalSpace(16.dp)
            }
            Text("Summary", fontWeight = FontWeight.Medium, modifier = Modifier.padding(top = 20.dp, bottom = 16.dp))
            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp), horizontalArrangement = Arrangement.SpaceBetween) {
                Text("Subtotal", color = Color.Gray)
                Text("$360", color = Color.Gray)
            }
            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp), horizontalArrangement = Arrangement.SpaceBetween) {
                Text("Shipping", color = Color.Gray)
                Text("Free", color = Color.Gray)
            }
            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp), horizontalArrangement = Arrangement.SpaceBetween) {
                Text("Tax", color = Color.Gray)
                Text("$36", color = Color.Gray)
            }
            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp), horizontalArrangement = Arrangement.SpaceBetween) {
                Text("Total", color = Color.Gray)
                Text("$396", color = Color.Gray)
            }
            VerticalSpace(40.dp)
            PrimaryButton(onClick = {/*Go to Check Page*/},"Proceed to Purchase")
        }
    }

}