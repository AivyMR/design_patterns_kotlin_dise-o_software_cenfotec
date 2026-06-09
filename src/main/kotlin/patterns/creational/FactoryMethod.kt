package patterns.creational

interface ProductoPendienteFactoryMethod {
    fun descripcion(): String
}

abstract class TallerPendiente {
    fun prepararPedido(): String {
        val producto = crearProductoPendiente()
        return "Pedido preparado para ${producto.descripcion()}"
    }

    protected open fun crearProductoPendiente(): ProductoPendienteFactoryMethod {
        // TODO: reemplaza este método por un verdadero método fábrica abstracto.
        return object : ProductoPendienteFactoryMethod {
            override fun descripcion(): String = "producto temporal"
        }
    }
}

class FactoryMethodDemo {
    fun ejecutar(): String {
        // TODO: crea un creador concreto y úsalo desde aquí.
        return TallerLocal().prepararPedido()
    }
}

class TallerLocal : TallerPendiente()
