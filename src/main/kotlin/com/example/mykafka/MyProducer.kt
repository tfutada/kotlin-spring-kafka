package com.example.mykafka

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component;

@Component
class MyProducer {
    @Autowired
    lateinit var kafkaTemplate: KafkaTemplate<String, String>

    suspend fun sendMessage(message: String) {
        withContext(Dispatchers.IO) {
            kafkaTemplate.send("simple-message-topic", message)
        }
    }
}

