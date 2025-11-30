package com.example.glasses.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.glasses.models.BottomNavigationItem

@Composable
fun BottomNavigationBar(navController: NavController) {
    var selectedIndex by remember { mutableIntStateOf(0) }

    val bottomNavigationItems = listOf(
        BottomNavigationItem(
            icon = Icons.Filled.Home,
            title = "Home",
            route = "home",
            isSelected = selectedIndex == 0,
            onClick = {
                selectedIndex = 0
                navController.navigate("home")
            }
        ),
        BottomNavigationItem(
            icon = Icons.Filled.Search,
            title = "Products",
            route = "products",
            isSelected = selectedIndex == 1,
            onClick = {
                selectedIndex = 1
                navController.navigate("products")
            }
        ),
        BottomNavigationItem(
            icon = Icons.Outlined.ShoppingCart,
            title = "Cart",
            route = "cart",
            isSelected = selectedIndex == 2,
            onClick = {
                selectedIndex = 2
                navController.navigate("cart")
            }
        )
    )

    NavigationBar(
        modifier = Modifier.padding(16.dp),
        containerColor = Color.White
    ) {
        bottomNavigationItems.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = index == selectedIndex,
                onClick = item.onClick,
                icon = { Icon(item.icon, contentDescription = "") },
                label = { Text(item.title) }
            )
        }

    }
}


