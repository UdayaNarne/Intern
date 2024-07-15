package com.example.items.model

data class OrderUiState(

    val entree: menu.EntreeItem? = null,
    val itemTotalPrice: Double = 0.0,
    val orderTax: Double = 0.0,
    val orderTotalPrice: Double = 0.0
)
