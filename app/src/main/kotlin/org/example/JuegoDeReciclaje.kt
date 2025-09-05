package org.example

import kotlin.collections.listOf

class JuegoDeReciclaje(){
    /*
        La función main y el código de la CLI actúan como "cliente" de la clase JuegoDeReciclaje, porque no se implementan regalsas del reciclaje ni lógica del juego en la función main. Solo muestra mensajes y consume las API públicas de JuegoDeReciclaje. Esto permite que sea Intercambiable/testeable, ya que se podría reemplazar JuegoDeReciclaje por otra implementación sin tocar la CLI, ayudando a pruebas y mantenimiento.
        Esto demuestra separación de capas:
            Capa de dominio es JuegoDeReciclaje (sabe cómo clasificar, calcular puntaje, etc.)
            Capa de presentación/cliente es main (sabe cómo interactuar con el usuario).
    */

    val centroDeReciclaje = CentroDeReciclaje()
    val score = 0
    val productos = enumValues<ProductoEnum>().toMutableList()
    public fun siguienteProducto(): Producto? {
        if (productos.isEmpty()){
            return null
        }
        val producto = productos.random()
        productos.remove(producto)
        return producto.toProducto()
    }
    public fun intentarClasificar(producto: Producto, tipoDeMaterial: MaterialReciclable): Boolean{
        if (centroDeReciclaje.recibirProducto(producto, tipoDeMaterial)){
            println("Correcto! +1 punto")
            return true
        } else {
            println("Incorrecto! No se suma punto")
            return false
        }
    }
    public fun estadisticas():Int{
        return centroDeReciclaje.estadísticas()
    }
}

/*
    Esta clase actúa como una fachada que simplifica la interacción con los contenedores. El motor del juego solo necesita interactuar con esta clase para gestionar los productos reciclables, sin preocuparse por los detalles internos de cada tipo de contenedor o de cómo se maneja la interfaz de usuario.
*/