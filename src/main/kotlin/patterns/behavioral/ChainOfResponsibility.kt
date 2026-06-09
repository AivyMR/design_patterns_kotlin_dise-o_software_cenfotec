package patterns.behavioral

data class SolicitudSoporte(
    val nivel: Int,
    val mensaje: String
)

open class MesaAyudaPendiente {
    var siguientePendiente: MesaAyudaPendiente? = null

    fun enlazar(siguiente: MesaAyudaPendiente): MesaAyudaPendiente {
        siguientePendiente = siguiente
        return siguiente
    }

    open fun atenderPendiente(solicitud: SolicitudSoporte): String {
        return siguientePendiente?.atenderPendiente(solicitud)
            ?: "Sin responsable para: ${solicitud.mensaje}"
    }
}
