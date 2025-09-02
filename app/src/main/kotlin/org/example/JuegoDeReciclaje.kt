package org.example

/*
    Descripción: Esta clase será el cerebro del juego. Se encargará de la puntuación, de generar nuevos productos para reciclar, de gestionar los turnos y de determinar cuándo termina el juego.
    Objetivo de Aprendizaje: Separación de responsabilidades (SoC). Gestión del estado de la aplicación (puntuación, productos pendientes, etc.).
    Prerrequisitos: [F3-I6] completado.
    Criterios de Aceptación:
        Debe existir una clase JuegoDeReciclaje que contenga una instancia de CentroDeReciclaje.
        Debe gestionar una puntuación (score) que aumenta con cada reciclaje correcto.
        Debe tener un método siguienteProducto(): Producto? que genere y devuelva un nuevo producto aleatorio para que el jugador lo clasifique. El juego termina si no se pueden generar más productos.
        Debe tener un método intentarClasificar(producto: Producto, tipoDeMaterial: MaterialReciclable): Boolean que use el CentroDeReciclaje y actualice el score.
        El estudiante debe poder explicar cómo esta clase separa la lógica de las reglas del juego de la lógica de la interfaz de usuario.
    Estimación de Esfuerzo: 3 sesiones.
*/
class JuegoDeReciclaje(){
    val centroDeReciclaje = CentroDeReciclaje()
    val score = 0
    private fun siguienteProducto(): Producto {
        val productoAleatorio = ProductoEnum.values().random()
        return productoAleatorio.toProducto()
    }
    public fun intentarClasificar(producto: Producto, tipoDeMaterial: MaterialReciclable): Boolean{
        if (centroDeReciclaje.recibirProducto(producto))
    }
}