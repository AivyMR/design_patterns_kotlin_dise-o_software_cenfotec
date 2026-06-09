package patterns.behavioral

class PlaylistPendiente(
    private val canciones: List<String>
) {
    private var indiceActual: Int = 0

    fun tieneMasPendiente(): Boolean = indiceActual < canciones.size

    fun siguientePendiente(): String {
        val valor = canciones[indiceActual]
        indiceActual += 1
        return valor
    }
}
