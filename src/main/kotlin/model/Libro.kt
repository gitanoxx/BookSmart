package org.example.model



//la clase libro hereda Recurso() con los 2 puntos

class Libro: Recurso() {



    var esNuevo: Boolean = false;

    override fun mostrarInfo() {
        if (esNuevo){
            println("Libro: $titulo, Precio: $precio, Nuevo")

        }else{
            println("Libro: $titulo, Precio: $precio, Usado")
        }




    }




}