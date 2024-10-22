package com.estudo_kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication // diz que é uma aplicação springboot
class Startup

fun main(args: Array<String>) {
	runApplication<Startup>(*args)
}
