package com.es.primercomponente.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HolaMundoController {

    @GetMapping("/holamundo")
    fun getHolaMundo(): String {
        return "Hola Mundo"
    }


}