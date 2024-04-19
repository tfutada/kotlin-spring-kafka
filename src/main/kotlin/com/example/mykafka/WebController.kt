package com.example.mykafka


import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController(private val messageProducer: MyProducer) {

    @GetMapping("/send")
    suspend fun sendMessage(
        @RequestParam("msg") message: String
    ): ResponseEntity<String> {
        messageProducer.sendMessage(message)
        return ResponseEntity.ok("Message sent to topic $message")
    }
}
