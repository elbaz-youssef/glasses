package com.example.glasses.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.glasses.ProductsViewModel
import com.example.glasses.common.BottomBar
import com.example.glasses.common.MainTitle
import com.example.glasses.common.ProductItem


@SuppressLint("ViewModelConstructorInComposable")
@Composable
fun Products(navController: NavController) {
    val products = ProductsViewModel().products
    Scaffold(

        bottomBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(1.dp, Color.LightGray)
            ) {
                BottomBar()
            }

        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            MainTitle("Products")
            Text(
                "Eyeglasses",
                modifier = Modifier.padding(bottom = 16.dp),
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp
            )

            // List Of Products
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                items(products) { product ->
                    ProductItem(
                        productImg = product.productImg,
                        altText = product.altText,
                        name = product.name,
                        price = product.price,
                        modifier = Modifier.fillMaxWidth(),
                        onClick = {
                            navController.navigate("products/${product.id}")
                        }
                    )
                }
            }

        }
    }
}