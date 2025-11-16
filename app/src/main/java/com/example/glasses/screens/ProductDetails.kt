package com.example.glasses.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.glasses.ProductsViewModel
import com.example.glasses.SizeInfo
import com.example.glasses.common.ColorBox
import com.example.glasses.common.HorizontalSpace
import com.example.glasses.common.PrimaryButton
import com.example.glasses.common.SizeBox
import com.example.glasses.common.VerticalSpace

@SuppressLint("ViewModelConstructorInComposable")
@Composable

fun ProductDetails(navController: NavController, id: Int) {
    val products = ProductsViewModel().products
    val product = products.find { it.id == id }
    val sizes = remember {
        mutableStateListOf(
            SizeInfo("Small"),
            SizeInfo("Medium"),
            SizeInfo("Large")
        )
    }
    if (product != null) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .verticalScroll(rememberScrollState())
        ) {

            // ---------- HEADER ----------
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp)
            ) {

                // Back Arrow - positioned at start
                IconButton(
                    onClick = { navController.navigateUp() },
                    modifier = Modifier.align(Alignment.CenterStart)
                ) {
                    Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                }

                // Title - perfectly centered in the Box
                Text(
                    "Product Details",
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.Center),
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center
                )
            }

            Image(
                painter = painterResource(product.productImg),
                contentDescription = product.altText,
                modifier = Modifier.clip(
                    RoundedCornerShape(8.dp)
                )
            )
            Text(
                product.name,
                modifier = Modifier.padding(top = 10.dp, bottom = 10.dp),
                fontWeight = FontWeight.Medium
            )
            Text(product.description, color = Color.Gray)
            VerticalSpace(16.dp)

            Text(
                "Color",
                modifier = Modifier.padding(top = 10.dp, bottom = 10.dp),
                fontWeight = FontWeight.Medium
            )
            Row {
                ColorBox(Color.Black)
                HorizontalSpace(16.dp)
                ColorBox(Color.DarkGray)
                HorizontalSpace(16.dp)
                ColorBox(Color.LightGray)
            }

            VerticalSpace(16.dp)

            Text(
                "Size",
                modifier = Modifier.padding(top = 10.dp, bottom = 10.dp),
                fontWeight = FontWeight.Medium
            )
            Row {
                for (i in 0..2) {
                    SizeBox(sizes[i].text, sizes[i].isSelected.value, onClick = {
                        removeSelectionFromSizes(sizes)
                        sizes[i].isSelected.value = true
                    })
                    if (i < 2)
                        HorizontalSpace(16.dp)
                }
            }

            VerticalSpace(24.dp)
            PrimaryButton(onClick = {navController.navigate("cart")}, text = "Add to Cart")
        }
    }

}

fun removeSelectionFromSizes(sizes: SnapshotStateList<SizeInfo>) {
    for(size in sizes) {
        size.isSelected.value = false
    }
}