package com.mashup.shopmenu.dto.request

data class ShopMenuRequestDTO(
    val shopID: Long = 0L,
    val shopVersion: Int = 0,
    val menuID: Long = 0L,
    val menuVersion: Int = 0
)