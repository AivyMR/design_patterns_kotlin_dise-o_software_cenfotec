package patterns.behavioral

class CampoTextoPendiente(var valor: String = "")

class BotonPendiente(var habilitado: Boolean = false)

class FormularioRegistroPendiente {
    val nombre = CampoTextoPendiente()
    val correo = CampoTextoPendiente()
    val enviar = BotonPendiente()

    fun recalcularEstado() {
        // TODO: extrae esta coordinación a un mediador.
        enviar.habilitado = nombre.valor.isNotBlank() && correo.valor.contains("@")
    }
}
