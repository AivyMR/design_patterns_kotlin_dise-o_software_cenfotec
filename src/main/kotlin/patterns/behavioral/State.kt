package patterns.behavioral

class SemaforoPendiente {
    private var modo: String = "ROJO"

    fun avanzar(): String {
        modo = when (modo) {
            "ROJO" -> "VERDE"
            "VERDE" -> "AMARILLO"
            else -> "ROJO"
        }
        return modo
    }
}

// TODO: reemplaza el when por estados concretos.
