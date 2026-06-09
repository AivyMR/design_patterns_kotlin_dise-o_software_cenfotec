package patterns.structural

interface NodoPendiente {
    fun renderizar(nivel: Int = 0): String
}

class ArchivoPendiente(
    private val nombre: String
) : NodoPendiente {
    override fun renderizar(nivel: Int): String = "${"  ".repeat(nivel)}- $nombre"
}

class CarpetaPendiente(
    private val nombre: String
) : NodoPendiente {
    override fun renderizar(nivel: Int): String {
        // TODO: convierte esta carpeta en un Composite real con hijos y add(...).
        return "${"  ".repeat(nivel)}+ $nombre"
    }
}
