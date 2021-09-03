package com.mashup.shopmenu.service

import com.mashup.shopmenu.common.exception.NotExistMenuException
import com.mashup.shopmenu.common.exception.NotExistShopException
import com.mashup.shopmenu.domain.repository.MenuRepository
import com.mashup.shopmenu.domain.repository.ShopRepository
import com.mashup.shopmenu.dto.request.ShopMenuRequestDTO
import org.springframework.stereotype.Service

@Service
class ShopMenuService(
    private val shopRepository: ShopRepository,
    private val menuRepository: MenuRepository
        ) {
    fun checkShopMenuVersion(shopMenuRequestDTO: ShopMenuRequestDTO): Boolean {
        val shopVersion = shopRepository.findVersionByShopID(shopMenuRequestDTO.shopID)?: { throw NotExistShopException() }
        val menuVersion = menuRepository.findVersionByMenuID(shopMenuRequestDTO.menuID)?: { throw NotExistMenuException() }
        return (shopVersion==shopMenuRequestDTO.shopVersion && menuVersion==shopMenuRequestDTO.menuVersion)
    }
}