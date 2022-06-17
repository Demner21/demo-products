package com.dmnr.product.demoproducts.service

import com.dmnr.product.demoproducts.entity.Message
import com.dmnr.product.demoproducts.repository.MessageRepository
import org.springframework.stereotype.Service

@Service
class MessageService(val dbMessage: MessageRepository) {
    fun getMessages() {
        dbMessage.findMessages()
    }

    fun post(message: Message) {
        dbMessage.save(message)
    }
}