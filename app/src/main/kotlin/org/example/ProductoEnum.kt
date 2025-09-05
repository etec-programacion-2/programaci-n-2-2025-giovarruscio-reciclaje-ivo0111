package org.example

enum class ProductoEnum(val nombre: String, val material: MaterialReciclable) {
    BOTELLA("Botella", MaterialReciclable.Plastico()),
    CAJA("Caja", MaterialReciclable.Papel()),
    LATA("Lata", MaterialReciclable.Metal()),
    PERIÓDICO("Periódico", MaterialReciclable.Papel()),
    LATAPROTEGIDA("Lata Protegida", MaterialReciclable.Metal()),
    ENVASEPLASTICO("Envase Plástico", MaterialReciclable.Plastico()),
    VIDRIO("Vidrio", MaterialReciclable.Vidrio()),
    TARJETA("Tarjeta", MaterialReciclable.Plastico()),
    BATERIA("Batería", MaterialReciclable.Metal()),
    ORGANICO("Orgánico", MaterialReciclable.Organico());

    // Método para crear un Producto con el nombre y material
    fun toProducto(): Producto {
        return Producto(nombre, material)
    }
}