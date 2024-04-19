package com.example.mykafka

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component;

@Component
class MyProducer {
    @Autowired
    lateinit var kafkaTemplate: KafkaTemplate<String, String>

    fun sendMessage(message: String) {
        kafkaTemplate.send("simple-message-topic", message)
    }
}

