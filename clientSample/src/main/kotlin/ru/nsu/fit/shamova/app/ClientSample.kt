package ru.nsu.fit.shamova.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient


@SpringBootApplication
@EnableEurekaClient
class ClientSample

fun main(args: Array<String>) {
    runApplication<ClientSample>()
}