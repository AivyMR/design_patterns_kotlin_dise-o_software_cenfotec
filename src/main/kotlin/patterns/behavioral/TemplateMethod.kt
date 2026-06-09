package patterns.behavioral

class ExportadorCsvPendiente {
    fun exportar(datos: List<String>): String {
        val limpio = datos.joinToString(separator = "\n")
        return "CSV:\n$limpio"
    }
}

// TODO: generaliza este flujo con una clase abstracta y un método plantilla.
