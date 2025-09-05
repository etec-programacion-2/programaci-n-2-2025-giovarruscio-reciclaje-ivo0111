package org.example

class JuegoDeReciclaje(){
    val centroDeReciclaje = CentroDeReciclaje()
    val score = 0
    private fun siguienteProducto(): Producto {
        val productoAleatorio = ProductoEnum.values().random()
        return productoAleatorio.toProducto()
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
}

/*
    Esta clase actúa como una fachada que simplifica la interacción con los contenedores. El motor del juego solo necesita interactuar con esta clase para gestionar los productos reciclables, sin preocuparse por los detalles internos de cada tipo de contenedor o de cómo se maneja la interfaz de usuario.
*/