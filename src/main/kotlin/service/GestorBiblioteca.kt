package org.example.service
import org.example.model.Libro
import org.example.model.Recurso
import org.example.model.Revista

class GestorBiblioteca {

    fun cargarCatalogo(listaRecurso: MutableList<Recurso>){
        val l1 = Libro();

        l1.titulo = "El principito"
        l1.autor = "Antoine"
        l1.precio = 4990
        l1.categoria = "Literatura infantil"
        l1.anioPublicacion = 1943
        l1.esNuevo = false;



        val l2 = Libro();

        l2.titulo = "Cien anios de soledad"
        l2.autor = "Gabriel Garcia Marquez"
        l2.precio = 9990
        l2.categoria = "Novela"
        l2.anioPublicacion = 1967
        l2.esNuevo = true;

        val r1 = Revista()

        r1.titulo = "National Geografic"
        r1.precio = 2490
        r1.estadoPrestamo = "Mensual"



        val r2 = Revista()

        r2.titulo = "Muy interesante"
        r2.precio = 1490
        r2.estadoPrestamo = "Semanal"




        listaRecurso.add(l1)
        listaRecurso.add(l2)

        listaRecurso.add(r1)
        listaRecurso.add(r2)












    }

    fun mostrarCatalogo(listaRecursos: MutableList<Recurso>){
        var contador : Int = 1

        println("------------------")
        println("Nuestro Catalogo!")
        println("--------------------")

        listaRecursos.forEach { x ->
            print("$contador.-")
            x.mostrarInfo()
            contador++
        }
        print("---------------------")
    }

    fun seleccionarRecursos(listaRespuestas: MutableList<String>){
        println()
        println("Seleccione Recursos")
        var respuestas = readln()

        var arreglo =respuestas.split(",")

        arreglo.forEach { x ->
            listaRespuestas.add(x)



    }
}

    fun crearPedido(listaRecursos: MutableList<Recurso>,
                    listaRespuestas: MutableList<String>){

        var subtotal = 0;

        println()
        listaRespuestas.forEach { x ->
            listaRecursos[x.toInt() - 1].mostrarInfo();
            subtotal += listaRecursos[x.toInt() -1].precio;



        }
        println("Subtotal: $subtotal")
    }
    fun calcularMulta(): Int{
        println("Ingrese dias de atraso: ")
        val dias = readln();

        val multa = dias.toInt() * 500;
        println("Su multa es $multa")
        return multa;

    }

}