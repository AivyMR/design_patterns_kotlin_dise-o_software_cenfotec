package patterns.structural

data class ArbolLigeroPendiente(
    val textura: String,
    val color: String
)

data class ArbolEnMapa(
    val x: Int,
    val y: Int,
    val modelo: ArbolLigeroPendiente
)

class BosquePendiente {
    private val arboles = mutableListOf<ArbolEnMapa>()

    fun plantar(x: Int, y: Int, textura: String, color: String) {
        // TODO: evita crear un nuevo modelo idéntico cada vez.
        arboles += ArbolEnMapa(x, y, ArbolLigeroPendiente(textura, color))
    }
}
