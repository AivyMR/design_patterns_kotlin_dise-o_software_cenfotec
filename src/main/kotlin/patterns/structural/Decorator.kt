package patterns.structural

interface BebidaPendiente {
    fun descripcionBase(): String
    fun costoBase(): Int
}

class CafeSimplePendiente : BebidaPendiente {
    override fun descripcionBase(): String = "Café simple"
    override fun costoBase(): Int = 25
}

class MenuPendiente {
    fun pedidoDelDia(): String {
        // TODO: sustituye este enfoque por decoradores encadenables.
        val bebida = CafeSimplePendiente()
        return "${bebida.descripcionBase()} -> $${bebida.costoBase()}"
    }
}
