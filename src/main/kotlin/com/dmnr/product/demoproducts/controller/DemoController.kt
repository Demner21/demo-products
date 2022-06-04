package com.dmnr.product.demoproducts.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class DemoController {

    @GetMapping("/demo")
    fun demo(model: Model): String {
        model["title"]="TEST"
        return "blog"
    }
}