package com.mashup.shopmenu.common.exception

class NotExistMenuException(
    message: String = "존재하지 않는 메뉴입니다."
): Throwable(message = message) {
}