package com.dmnr.product.demoproducts.controller

import com.dmnr.product.demoproducts.entity.Product
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PriceController {

    @GetMapping("/prices")
    fun price(product: Product): String {
        if (product.id == "1") {
            return "20"
        }
        return "0"
    }
}