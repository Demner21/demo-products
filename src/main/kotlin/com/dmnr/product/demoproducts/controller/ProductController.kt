package com.dmnr.product.demoproducts.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController {
    @GetMapping("/products")
    fun index(): List<Product> = listOf(
        Product("1", "phone"),
        Product("2", "pc"),
        Product("3", "mouse")
    )
}