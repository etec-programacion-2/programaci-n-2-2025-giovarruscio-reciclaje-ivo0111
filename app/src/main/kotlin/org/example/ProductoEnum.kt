package org.example

enum class ProductoEnum(val nombre: String, val material: MaterialReciclable) {
    BOTELLA("Botella de agua", MaterialReciclable.Plastico()),
    CAJA("Caja", MaterialReciclable.Papel()),
    LATA("Lata", MaterialReciclable.Metal()),
    PERIÓDICO("Periódico", MaterialReciclable.Papel()),
    LATAPROTEGIDA("Lata Protegida", MaterialReciclable.Metal()),
    ENVASEPLASTICO("Envase Plástico", MaterialReciclable.Plastico()),
    VINO("Botella de vino", MaterialReciclable.Vidrio()),
    TARJETA("Tarjeta", MaterialReciclable.Plastico()),
    BATERIA("Batería", MaterialReciclable.Metal()),
    RESTOS("Restos de comida", MaterialReciclable.Organico());

    // Método para crear un Producto con el nombre y material
    fun toProducto(): Producto {
        return Producto(nombre, material)
    }
}