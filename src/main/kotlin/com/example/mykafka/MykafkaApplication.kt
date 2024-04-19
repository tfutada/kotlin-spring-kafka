package com.example.mykafka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MykafkaApplication

fun main(args: Array<String>) {
	runApplication<MykafkaApplication>(*args)
}
