package patterns.creational

class RegistroConfiguracionPendiente {
    private var entorno: String = "dev"

    fun leerEntorno(): String = entorno

    fun cambiarEntorno(nuevoEntorno: String) {
        entorno = nuevoEntorno
    }
}

fun crearDosConfiguracionesTemporales(): Pair<RegistroConfiguracionPendiente, RegistroConfiguracionPendiente> {
    // TODO: reemplaza estas dos instancias por un singleton real.
    return RegistroConfiguracionPendiente() to RegistroConfiguracionPendiente()
}
