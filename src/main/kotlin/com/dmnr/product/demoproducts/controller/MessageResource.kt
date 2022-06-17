package com.dmnr.product.demoproducts.controller

import com.dmnr.product.demoproducts.entity.Message
import com.dmnr.product.demoproducts.service.MessageService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageResource(val serviceMessage: MessageService) {

    @GetMapping
    fun index() = serviceMessage.getMessages()

    @PostMapping
    fun post(@RequestBody message: Message) {
        serviceMessage.post(message)
    }

}