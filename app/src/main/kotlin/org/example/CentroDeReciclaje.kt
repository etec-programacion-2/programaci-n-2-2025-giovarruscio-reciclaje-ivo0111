package org.example
class CentroDeReciclaje(){
    var productosDepositados = 0
    val contenedores: List<Contenedor> = listOf(
        Contenedor(MaterialReciclable.Plastico(), 70),
        Contenedor(MaterialReciclable.Vidrio(), 80),
        Contenedor(MaterialReciclable.Papel(), 60),
        Contenedor(MaterialReciclable.Metal(), 50),
        Contenedor(MaterialReciclable.Organico(), 40)
    )
    public fun recibirProducto(producto: Producto): Boolean {
        for (contenedor in contenedores){
            if (contenedor.tipoDeMaterial == producto.material){
                val estado = contenedor.depositar(producto)
                if (estado){productosDepositados++}
                return estado
            }
        }
        return false
    }
    public fun estadísticas():Int{
        return productosDepositados
    }
}
/*
    La clase CentroDeReciclaje actúa como una fachada (Facade) que simplifica la interacción con los contenedores. 
    El motor del juego solo necesita interactuar con esta clase para gestionar los productos reciclables, sin preocuparse por los detalles internos de cada tipo de contenedor. 

    **Ventajas:**
    - Encapsula la lógica de los contenedores, ocultando la complejidad de verificar tipos de materiales y la capacidad.
    - Facilita la obtención de estadísticas (productos reciclados) de manera centralizada.
    - Permite modificar o añadir nuevos tipos de materiales en los contenedores sin afectar al motor del juego.
    - Hace que el código del juego sea más limpio y fácil de mantener.
*/
