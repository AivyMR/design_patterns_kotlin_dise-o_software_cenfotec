package patterns.creational

data class DocumentoBase(
    val titulo: String,
    val cuerpo: String,
    val etiquetas: List<String>
)

interface BorradorPendiente {
    fun duplicarBorrador(): DocumentoBase
}

class PrototipoDocumentoPendiente(
    private val base: DocumentoBase
) : BorradorPendiente {
    override fun duplicarBorrador(): DocumentoBase {
        // TODO: reemplaza esta solución temporal por una interfaz Prototype real.
        return base.copy()
    }
}
