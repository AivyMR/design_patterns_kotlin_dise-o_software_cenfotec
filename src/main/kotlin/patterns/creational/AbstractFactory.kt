package patterns.creational

interface MotorPendiente {
    fun tipo(): String
}

interface PanelPendiente {
    fun tema(): String
}

class CatalogoPendiente {
    fun describirConfiguracion(): String {
        // TODO: aquí debería usarse una fábrica abstracta real.
        val motor = object : MotorPendiente {
            override fun tipo(): String = "motor temporal"
        }
        val panel = object : PanelPendiente {
            override fun tema(): String = "tema temporal"
        }
        return "Configuración: ${motor.tipo()} + ${panel.tema()}"
    }
}
