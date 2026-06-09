package patterns.behavioral

data class EditorPendiente(
    var titulo: String,
    var contenido: String
)

class HistorialBasico {
    private val snapshots = mutableListOf<Pair<String, String>>()

    fun registrar(editor: EditorPendiente) {
        snapshots += editor.titulo to editor.contenido
    }

    fun ultimo(): Pair<String, String>? = snapshots.lastOrNull()
}

// TODO: transforma esta solución en una implementación formal del patrón Memento.
