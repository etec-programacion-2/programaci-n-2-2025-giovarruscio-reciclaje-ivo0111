package org.example

enum class colorContenedor {NARANJA, AMARILLO, VERDE, AZUL, GRIS}

sealed class MaterialReciclable(val colorContenedor: colorContenedor) {
    data class Plastico(val color: colorContenedor = colorContenedor.NARANJA): MaterialReciclable(color)
    data class Vidrio(val color: colorContenedor = colorContenedor.VERDE): MaterialReciclable(color)
    data class Papel(val color: colorContenedor = colorContenedor.AZUL): MaterialReciclable(color)
    data class Metal(val color: colorContenedor = colorContenedor.AMARILLO): MaterialReciclable(color)
    data class Organico(val color: colorContenedor = colorContenedor.GRIS): MaterialReciclable(color)
}

/*
    En este caso es mejor usar una sealed class en lugar de una enum porque esto permite crear múltiples instancias con estado propio.
    Además, esto permite agregar propiedades y métodos individuales o compartidos.
    Los casos donde sería mejor usar una enum son con tipos finitos y simples.
 */

data class Producto(val nombre: String, val material: MaterialReciclable)

/*
    Se eligió una data class para Producto porque estas clases están diseñadas para almacenar datos y proporcionan automáticamente métodos útiles como equals(), hashCode() y toString(). Esto facilita la comparación de instancias y representación de estas. Además, las data class fomentan la inmutabilidad, util para mantener la integridad de los datos.
*/

class Contenedor(val tipoDeMaterial: MaterialReciclable, val capacidadMaxima: Int){
    private val productos: MutableList<Producto> = mutableListOf()

    public fun cantidadActual():Int{
        return productos.size
    }
}

/*
    Se eligió una clase regular para Contenedor porque esta clase maneja un estado interno mutable (la lista de productos) y no necesita las funcionalidades adicionales que proporcionan las data class. El enfoque principal aquí es encapsular la lógica de gestión de productos y mantener la integridad del estado interno, lo cual es más adecuado para una clase regular. El encapsulamiento protege los datos internos al evitar modificaciones directas desde fuera de la clase, asegurando que todas las interacciones con la lista de productos se realicen a través de métodos controlados.
*/