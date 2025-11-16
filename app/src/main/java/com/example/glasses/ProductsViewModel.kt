package com.example.glasses

import androidx.lifecycle.ViewModel
import kotlin.collections.listOf

class ProductsViewModel : ViewModel() {
    val products = listOf(
        Product(1, R.drawable.product1, "Product 1", "The Aviator", description = "These Timeless aviator sunglasses feature a lightweight metal frame and polarized lenses for superior clarity and protection.", "$120"),
        Product(2, R.drawable.product2, "Product 2", "The Round", description = "These Timeless aviator sunglasses feature a lightweight metal frame and polarized lenses for superior clarity and protection.", "$110"),
        Product(3, R.drawable.product3, "Product 3", "The Square", description = "These Timeless aviator sunglasses feature a lightweight metal frame and polarized lenses for superior clarity and protection.", "$130"),
        Product(4, R.drawable.product4, "Product 4", "The Cat Eye", description = "These Timeless aviator sunglasses feature a lightweight metal frame and polarized lenses for superior clarity and protection.", "$140"),
        Product(5, R.drawable.product5, "Product 5", "The Browline", description = "These Timeless aviator sunglasses feature a lightweight metal frame and polarized lenses for superior clarity and protection.", "$150"),
        Product(6, R.drawable.product6, "Product 6", "The Rectangle", description = "These Timeless aviator sunglasses feature a lightweight metal frame and polarized lenses for superior clarity and protection.", "$100")
    )
}