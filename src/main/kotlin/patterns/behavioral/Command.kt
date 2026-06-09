package patterns.behavioral

class Luz {
    fun encender(): String = "Luz encendida"
    fun apagar(): String = "Luz apagada"
}

class BotonComandoPendiente(
    private val accion: () -> String
) {
    fun presionar(): String = accion()
}

fun demoTemporal(): String {
    val luz = Luz()
    // TODO: reemplaza esta lambda por objetos comando.
    val boton = BotonComandoPendiente { luz.encender() }
    return boton.presionar()
}
