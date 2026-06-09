package patterns.creational

data class Computadora(
    val cpu: String,
    val memoriaGb: Int,
    val almacenamientoGb: Int,
    val gpu: String?
)

class ConfiguracionPendiente {
    var cpu: String = "pendiente"
    var memoriaGb: Int = 0
    var almacenamientoGb: Int = 0
    var gpu: String? = null

    // TODO: reemplaza esta clase por un Builder real con métodos encadenables.
    fun crearTemporal(): Computadora {
        return Computadora(cpu, memoriaGb, almacenamientoGb, gpu)
    }
}
