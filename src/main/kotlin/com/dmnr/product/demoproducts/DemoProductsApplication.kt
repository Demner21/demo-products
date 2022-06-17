package com.dmnr.product.demoproducts

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@SpringBootApplication
class DemoProductsApplication

@Configuration
@ComponentScan("com.dmnr.product.demoproducts")
class DemoConfiguration
fun main(args: Array<String>) {
    runApplication<DemoProductsApplication>(*args)
}
