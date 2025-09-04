package org.example.model

class Revista: Recurso() {


    var estadoPrestamo: String = ""





    override fun mostrarInfo() {
        println("Revista: $titulo, Precio $precio, $estadoPrestamo")
    }
}