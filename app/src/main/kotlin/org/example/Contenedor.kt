package org.example

/*
    Se eligió una clase regular para Contenedor porque esta clase maneja un estado interno mutable (la lista de productos) y no necesita las funcionalidades adicionales que proporcionan las data class. El enfoque principal aquí es encapsular la lógica de gestión de productos y mantener la integridad del estado interno, lo cual es más adecuado para una clase regular. El encapsulamiento protege los datos internos al evitar modificaciones directas desde fuera de la clase, asegurando que todas las interacciones con la lista de productos se realicen a través de métodos controlados.
*/
class Contenedor(val tipoDeMaterial: MaterialReciclable, val capacidadMaxima: Int){
    private val productos: MutableList<Producto> = mutableListOf()
    val estaLleno: Boolean
        get() = cantidadActual()>=capacidadMaxima
    // La propiedad 'estaLleno' es una propiedad computada porque su valor se calcula dinámicamente en base a las propiedades 'capacidadActual' y 'capacidadMaxima'. No es necesario almacenarla explícitamente, ya que siempre se puede calcular al momento de acceder a ella. En cambio, propiedades como 'capacidadActual' son almacenadas, y su valor puede modificarse directamente. estaLleno es un buen candidato porque su valor debe cambiar dinamicamente, pero siempre se debe usar el mismo procedimiento para obtener su valor.
    public fun cantidadActual():Int{
        return productos.size
    }

    public fun depositar(producto:Producto): Boolean{
        if (producto.material==tipoDeMaterial && !estaLleno){
            productos.add(producto)
            println("Producto depositado con éxito")
            return true
        }else{
            if (estaLleno){
                println("Capacidad máxima alcanzada")
                return false
            } else {
                println("Tipo de material incorrecto")
                return false
            }
        }
    }

    public fun vaciar(){
        productos.clear()
    }
}
/*
    Secuencia:
    * El jugador intenta depositar un Producto en un Contenedor, llamando al método depositar(producto: Producto) del contenedor.
    * Contenedor verifica si el material del Producto coincide con su tipoDeMaterial.
    * Si el material no coincide, el método depositar devuelve false (depósito fallido por tipo de material incorrecto).
    * Si el material es correcto, el Contenedor verifica si la capacidadActual es menor que la capacidadMaxima.
    * Si el contenedor está lleno (capacidadActual >= capacidadMaxima), el método devuelve false (depósito fallido por contenedor lleno).
    * Si el material es correcto y hay espacio en el contenedor, el Contenedor incrementa su capacidadActual con la cantidad del producto depositado y devuelve true (depósito exitoso).
*/
