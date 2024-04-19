package com.example.mykafka

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component


@Component
class KafkaExampleService {
    @KafkaListener(topics = ["simple-message-topic"], groupId = "group_id")
    fun listen(message: String) {
        println("Received Message in group 'group_id': $message")
    }
}

