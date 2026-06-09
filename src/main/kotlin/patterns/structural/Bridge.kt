package patterns.structural

class ReportePendiente {
    fun exportarComoTexto(): String {
        // TODO: aquí debería existir una separación entre abstracción e implementación.
        return "Reporte temporal"
    }
}

class ReporteDetalladoPendiente {
    fun exportarDetallado(): String {
        return "Reporte detallado temporal"
    }
}
