package patterns.creational

interface ProductoPendienteFactoryMethod {
    fun descripcion(): String
}

abstract class TallerPendiente {
    fun prepararPedido(): String {
        val producto = crearProductoPendiente()
        return "Pedido preparado para ${producto.descripcion()}"
    }

    // Método fábrica: cada subclase decide qué `ProductoPendienteFactoryMethod` crear
    protected abstract fun crearProductoPendiente(): ProductoPendienteFactoryMethod
}

class FactoryMethodDemo {
    fun ejecutar(): String {
        // La creación del producto queda encapsulada en el creador concreto
        val taller: TallerPendiente = TallerLocal()
        return taller.prepararPedido()
    }
}

// Producto concreto
class ProductoLocal : ProductoPendienteFactoryMethod {
    override fun descripcion(): String = "pendiente local"
}

// Creador concreto
class TallerLocal : TallerPendiente() {
    override fun crearProductoPendiente(): ProductoPendienteFactoryMethod = ProductoLocal()
}
