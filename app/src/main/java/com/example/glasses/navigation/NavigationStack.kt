package com.example.glasses.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.tooling.preview.Preview
import com.example.glasses.screens.*
import kotlinx.coroutines.delay

@Composable
fun NavigationStack() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Splash.route) {

        // Splash screen
        composable(Screen.Splash.route) {
            Splash() // Preload UI

            // Navigate to Home after a delay
            LaunchedEffect(Unit) {
                delay(2000) // 2 seconds splash
                navController.navigate(Screen.Home.route) {
                    popUpTo(Screen.Splash.route) { inclusive = true } // Remove splash from back stack
                }
            }
        }

        // Home screen
        composable(Screen.Home.route) {
            Home(navController = navController)
        }

        // Login screen
        composable(Screen.Login.route) {
            Login(navController = navController)
        }

        // Register screen
        composable(Screen.Register.route) {
            Register(navController = navController)
        }

        // Products screen
        composable(Screen.Products.route) {
            Products(navController = navController)
        }

        // Product Details screen (with ID argument)
        composable(Screen.ProductDetails.route) { backStackEntry ->
            val productId = backStackEntry.arguments?.getString("productId")?.toInt() ?: 0
            ProductDetails(navController = navController, id = productId)
        }

        // Cart screen
        composable(Screen.Cart.route) {
            Cart(navController = navController)
        }
    }
}
