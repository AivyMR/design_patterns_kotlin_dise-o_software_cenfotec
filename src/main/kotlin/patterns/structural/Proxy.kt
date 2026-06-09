package patterns.structural

class ServicioDocumentoReal {
    fun descargar(id: String): String = "Contenido del documento $id"
}

class ClienteDocumentosPendiente(
    private val servicioDocumentoReal: ServicioDocumentoReal
) {
    fun verDocumento(id: String): String {
        // TODO: inserta un proxy que controle el acceso.
        return servicioDocumentoReal.descargar(id)
    }
}
