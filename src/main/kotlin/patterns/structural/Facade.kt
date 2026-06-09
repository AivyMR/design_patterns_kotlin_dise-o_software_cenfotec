package patterns.structural

class Inventario {
    fun reservar(sku: String): String = "Inventario reservado para $sku"
}

class Pagos {
    fun cobrar(total: Double): String = "Cobro realizado por $total"
}

class Envio {
    fun programar(direccion: String): String = "Envío programado a $direccion"
}

class CheckoutManualPendiente(
    private val inventario: Inventario,
    private val pagos: Pagos,
    private val envio: Envio
) {
    fun completarPedido(sku: String, total: Double, direccion: String): List<String> {
        // TODO: crea una fachada que simplifique esta orquestación.
        return listOf(
            inventario.reservar(sku),
            pagos.cobrar(total),
            envio.programar(direccion)
        )
    }
}
