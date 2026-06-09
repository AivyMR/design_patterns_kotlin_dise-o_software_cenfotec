package patterns.behavioral

class EstacionClimaPendiente {
    private val suscriptores = mutableListOf<(Int) -> Unit>()
    private var temperaturaActual: Int = 0

    fun suscribirse(observer: (Int) -> Unit) {
        suscriptores += observer
    }

    fun cambiarTemperatura(nuevaTemperatura: Int) {
        temperaturaActual = nuevaTemperatura
        suscriptores.forEach { it(temperaturaActual) }
    }
}

// TODO: reemplaza las lambdas por una implementación explícita del patrón Observer.
