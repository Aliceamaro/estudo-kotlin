package com.estudo_kotlin

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController //permite definir um controller com características REST;
class GreetingController {

    val counter: AtomicLong=AtomicLong()// criei uma variável counter(contador)- Criei um objeto chamado AtomicLong  do tipo atomicLong, que  é usado em aplicações como números de sequência incrementados atomicamente

    @RequestMapping("/greeting")//caminho URI
    fun greeting(@RequestParam(value ="name", defaultValue = "word") name: String?): Greeting { // criou um metodo, que vai retornar o que está declado dentro da class Greenting
        return Greeting(counter.incrementAndGet(), content = "Hello, $name!")
        //passa um parametro simulando um id(incrementar um id) metodo de incremento atômico
    }
}