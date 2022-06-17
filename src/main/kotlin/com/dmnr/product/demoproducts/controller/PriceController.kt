package com.dmnr.product.demoproducts.controller

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

@RestController
class ProductController {
    @GetMapping("/products")
    fun index(): List<Product> = listOf(
        Product("1","phone"),
        Product("2","pc"),
        Product("3","mouse")
    )
}

data class Product(val id: String, val name: String)
