package com.example.glasses.navigation

sealed class Screen(val route: String) {
    object Splash : Screen("splash")
    object Home : Screen("home")
    object Register : Screen("register")
    object Login : Screen("login")
    object Products : Screen("products")
    object ProductDetails : Screen("products/{productId}")
    object Cart : Screen("cart")
}