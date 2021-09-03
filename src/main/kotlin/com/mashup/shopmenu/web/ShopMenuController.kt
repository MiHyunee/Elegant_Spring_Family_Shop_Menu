package com.mashup.shopmenu.web

import com.mashup.shopmenu.common.response.ShopMenuResponse
import com.mashup.shopmenu.dto.request.ShopMenuRequestDTO
import com.mashup.shopmenu.service.ShopMenuService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("v1/shop-menu")
@RestController
class ShopMenuController(
    private val shopMenuservice: ShopMenuService
) {
    @PostMapping
    fun checkShopMenuVersion(@RequestBody shopMenuRequestDTO: ShopMenuRequestDTO): ResponseEntity<Any> {
        return ShopMenuResponse.successOf(shopMenuservice.checkShopMenuVersion(shopMenuRequestDTO))
    }
}