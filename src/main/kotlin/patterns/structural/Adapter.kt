package patterns.structural

class ServicioPagoLegacy {
    fun procesarMontoEnCentavos(total: Int): String {
        return "Pago legacy por ${total} centavos"
    }
}

class ClienteCheckoutPendiente(
    private val servicioPagoLegacy: ServicioPagoLegacy
) {
    fun cobrar(totalEnPesos: Double): String {
        // TODO: el cliente no debería depender directamente de la API legacy.
        val centavos = (totalEnPesos * 100).toInt()
        return servicioPagoLegacy.procesarMontoEnCentavos(centavos)
    }
}
