package com.es.primercomponente.controller

import com.es.primercomponente.model.Libro
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RestController

@RestController // Spring Boot anota esta clase como clase Controller
class LibroController {

    private val libros: MutableList<Libro> = mutableListOf(
        Libro(1, "Crepusculo", "Ficcion", "Nose"),
        Libro(2, "La Leyenda del hechicero", "Aventuras", "Taram Matharou"),
        Libro(3, "Ciudad de Cristal", "Policiaco", "Paul Auster")
    )
    // Vamos a hacer un CRUD de libros
    // Vamos a hacer un método que acepte C (Crear) -> POST
    // Vamos a hacer un método que acepte R (Leer) -> GET
    // Vamos a hacer un método que acepte U (Actualizar) -> PUT
    // Vamos a hacer un método que acepte D (Eliminar) -> DELETE

    @PostMapping("/libros")
    fun insert() {

    }

    @GetMapping("/libros/{id}")
    fun getById(
        @PathVariable id: String //Captura variables en la URL. Esto se utiliza para obtener identificadores específicos en la ruta.
    ) : Libro? {

        println(id)
        val idL: Long = id.toLong()

        return libros.find { l -> l.id == idL }

    }

    @PutMapping("/libros")
    fun update() {

    }

    @DeleteMapping("/libros")
    fun deleteById() {

    }




}