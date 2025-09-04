package org.example.model

abstract class Recurso {
    var titulo: String = ""
    var autor: String = ""
    var precio: Int = 0
    var categoria: String = ""
    var anioPublicacion: Int = 0

    //Funcion netamente para que las clases hijas
    //Deban implementarla
    abstract fun mostrarInfo();

}