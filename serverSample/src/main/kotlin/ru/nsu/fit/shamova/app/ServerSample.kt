package ru.nsu.fit.shamova.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class ServerSample

fun main(args: Array<String>) {
    runApplication<ServerSample>(*args)
}