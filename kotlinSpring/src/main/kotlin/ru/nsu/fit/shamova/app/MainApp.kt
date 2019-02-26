package ru.nsu.fit.shamova.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class MainApp

fun main(args: Array<String>) {
    println("Hello, world!")
    runApplication<MainApp>(*args)
}