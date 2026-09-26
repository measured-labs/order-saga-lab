package com.jun.labs.ordersaga

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OrderSagaApplication

fun main(args: Array<String>) {
    runApplication<OrderSagaApplication>(*args)
}
