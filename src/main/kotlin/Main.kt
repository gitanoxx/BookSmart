package org.example

import org.example.model.Recurso
import org.example.service.GestorBiblioteca

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val listaRecursos =mutableListOf<Recurso>()

    val listaRespuestas =mutableListOf<String>()

    val gestorBiblioteca = GestorBiblioteca();

    gestorBiblioteca.cargarCatalogo(listaRecursos)
    gestorBiblioteca.mostrarCatalogo(listaRecursos)
    gestorBiblioteca.seleccionarRecursos(listaRespuestas)
    gestorBiblioteca.crearPedido(listaRecursos,listaRespuestas)

    var subtotal = gestorBiblioteca.crearPedido(listaRecursos, listaRespuestas)
    val multa = gestorBiblioteca.calcularMulta();


}