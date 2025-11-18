package org.example

data class Producto(val nombre: String, val material: MaterialReciclable)

/*
    Se eligió una data class para Producto porque estas clases están diseñadas para almacenar datos y proporcionan automáticamente métodos útiles como equals(), hashCode() y toString(). Esto facilita la comparación de instancias y representación de estas. Además, las data class fomentan la inmutabilidad, util para mantener la integridad de los datos.
*/
