package org.example

/*
    Descripción: Esta es la tarea final para hacer el juego jugable. Se creará la función main que iniciará el JuegoDeReciclaje y gestionará un bucle para la interacción con el usuario a través de la consola.
    Objetivo de Aprendizaje: Punto de entrada de una aplicación (main). Manejo de entrada/salida estándar (println, readln). Separación entre la lógica del juego y la presentación.
    Prerrequisitos: [F4-I7] completado.
    Criterios de Aceptación:
    Debe existir una función main en un archivo Main.kt.
    Al ejecutar la aplicación, se debe mostrar un mensaje de bienvenida.
    El juego debe presentar un producto al usuario y pedirle que elija un contenedor (ej: ingresando un número o color).
    El juego debe informar si la clasificación fue correcta o no y mostrar la puntuación actualizada.
    El bucle del juego debe continuar hasta que se cumpla la condición de fin de juego (ej: no hay más productos).
    Al finalizar, se debe mostrar la puntuación final.
    El estudiante debe explicar cómo la función main y el código de la CLI actúan como un "cliente" de la clase JuegoDeReciclaje, demostrando una clara separación de capas.
    Estimación de Esfuerios: 3 sesiones.
*/

fun main() {
    println("¡Bienvenido al Juego de Reciclaje!")
    val juego = JuegoDeReciclaje()
    val selecciones = listOf(
        "1. Plástico",
        "2. Vidrio",
        "3. Papel",
        "4. Metal",
        "5. Orgánico"
    )

    fun intToMaterialReciclable(input: Int): MaterialReciclable? {
        return when (input) {
            1 -> MaterialReciclable.Plastico()
            2 -> MaterialReciclable.Vidrio()
            3 -> MaterialReciclable.Papel()
            4 -> MaterialReciclable.Metal()
            5 -> MaterialReciclable.Organico()
            else -> null
        }
    }

    while (true) {
        val producto = juego.siguienteProducto() ?: break
        var material: MaterialReciclable? = null

        while (true) {
            println("El producto es: ${producto.nombre}. ¿En qué contenedor lo colocas?")
            println(selecciones.joinToString("\n"))
            val input = readlnOrNull() ?: break   // si no hay más entrada, salir del bucle
            val tipo = input.toIntOrNull() ?: continue
            material = intToMaterialReciclable(tipo)
            if (material == null) {
                println("Selección inválida. Intenta de nuevo.")
                continue
            }
            println("Tipo seleccionado: ${material}")
            break
        }

        if (material == null) break
        juego.intentarClasificar(producto, material)
    }

    println("¡Gracias por jugar! Tu puntuación final es: ${juego.estadisticas()}")
}
