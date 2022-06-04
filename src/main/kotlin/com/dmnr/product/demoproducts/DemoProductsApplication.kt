package com.dmnr.product.demoproducts

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoProductsApplication

fun main(args: Array<String>) {
    runApplication<DemoProductsApplication>(*args){
        setBannerMode(Banner.Mode.OFF)
    }
}
