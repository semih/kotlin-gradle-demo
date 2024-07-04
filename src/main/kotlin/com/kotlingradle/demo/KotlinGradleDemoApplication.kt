package com.kotlingradle.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinGradleDemoApplication

fun main(args: Array<String>) {
    runApplication<KotlinGradleDemoApplication>(*args)
    println("test - gradle - kotlin - docker")
}
