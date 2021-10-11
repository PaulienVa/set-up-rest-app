package com.openvalue.setuprestapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class SetUpRestAppApplication

fun main(args: Array<String>) {
    runApplication<SetUpRestAppApplication>(*args)
}
