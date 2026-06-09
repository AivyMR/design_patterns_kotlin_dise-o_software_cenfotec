package patterns.behavioral

class CalculadoraEnvioPendiente {
    fun calcular(tipo: String, peso: Double): Double {
        return when (tipo) {
            "normal" -> peso * 5
            "express" -> peso * 8
            else -> peso * 12
        }
    }
}

// TODO: extrae este comportamiento a estrategias intercambiables.
