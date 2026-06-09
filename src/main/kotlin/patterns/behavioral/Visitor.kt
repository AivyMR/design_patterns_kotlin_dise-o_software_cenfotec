package patterns.behavioral

interface FiguraPendiente {
    fun descripcion(): String
}

data class CirculoPendiente(val radio: Double) : FiguraPendiente {
    override fun descripcion(): String = "Círculo de radio $radio"
}

data class RectanguloPendiente(val ancho: Double, val alto: Double) : FiguraPendiente {
    override fun descripcion(): String = "Rectángulo ${ancho}x$alto"
}

fun imprimirFiguras(figuras: List<FiguraPendiente>): String {
    // TODO: reemplaza este recorrido ad-hoc por un visitante.
    return figuras.joinToString(separator = "\n") { it.descripcion() }
}
