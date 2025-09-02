package org.example

fun main() {
    val contenedorPlastico = Contenedor(MaterialReciclable.Plastico(), 2)
    val botella = Producto("Botella", MaterialReciclable.Plastico())
    val lata = Producto("Lata", MaterialReciclable.Metal())
    contenedorPlastico.depositar(botella)
    contenedorPlastico.depositar(lata)
    contenedorPlastico.depositar(botella)
    contenedorPlastico.depositar(botella)
}