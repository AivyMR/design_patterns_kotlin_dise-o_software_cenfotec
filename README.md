<h1 align="center">Aprende Patrones de Diseño en Kotlin</h1>
<h3 align="center">22 patrones GoF · Kotlin · Gradle JVM</h3>

<p align="center">
  <a href="https://github.com/new?template_owner=kevinah95&template_name=learn-design-patterns-kotlin&owner=%40me&name=learn-design-patterns-kotlin&description=Mi+ejercicio+de+patrones+de+diseño&visibility=public">
    <img src="https://img.shields.io/badge/Copiar%20ejercicio-%232ea44f?style=for-the-badge&logo=github&logoColor=white" alt="Copiar ejercicio"/>
  </a>
</p>

---

## Bienvenido 👋

En este ejercicio aprenderás los **22 patrones GoF** aplicados a Kotlin mediante un recorrido guiado y progresivo. Cada paso te dejará un archivo esqueleto incompleto para que implementes el patrón correspondiente y hagas `push` a `main`.

> **¿Para quién es este ejercicio?**
> Estudiantes con bases de Kotlin que quieren practicar diseño orientado a objetos con ejemplos pequeños, concretos y revisables.

---

## Lo que aprenderás

### Creacional

| # | Patrón | Lo que practicarás |
|---|---|---|
| 1 | Método fábrica | Delegar la creación de productos a creadores concretos |
| 2 | Fábrica abstracta | Construir familias de objetos compatibles |
| 3 | Constructor | Armar objetos complejos paso a paso |
| 4 | Prototipo | Clonar objetos configurados previamente |
| 5 | Instancia única | Garantizar una sola instancia compartida |

### Estructural

| # | Patrón | Lo que practicarás |
|---|---|---|
| 6 | Adaptador | Integrar APIs incompatibles sin reescribirlas |
| 7 | Puente | Separar abstracción e implementación |
| 8 | Objeto compuesto | Tratar hojas y árboles de manera uniforme |
| 9 | Decorador | Agregar comportamiento sin modificar clases |
| 10 | Fachada | Simplificar subsistemas complejos |
| 11 | Peso mosca | Compartir estado intrínseco para ahorrar memoria |
| 12 | Proxy | Controlar el acceso a un objeto real |

### Comportamiento

| # | Patrón | Lo que practicarás |
|---|---|---|
| 13 | Cadena de responsabilidad | Encadenar manejadores y delegar solicitudes |
| 14 | Comando | Encapsular acciones como objetos |
| 15 | Iterador | Recorrer colecciones sin exponer su estructura |
| 16 | Mediador | Centralizar la comunicación entre colegas |
| 17 | Recuerdo | Guardar y restaurar instantáneas de estado |
| 18 | Observador | Notificar cambios a múltiples suscriptores |
| 19 | Estado | Cambiar comportamiento según el estado interno |
| 20 | Estrategia | Intercambiar algoritmos de forma transparente |
| 21 | Método plantilla | Definir un algoritmo base con pasos variables |
| 22 | Visitante | Añadir operaciones externas con doble despacho |

---

## Prerrequisitos

Antes de comenzar necesitas:

- [ ] Conocimiento básico de Kotlin y POO
- [ ] Git y una cuenta de GitHub
- [ ] JDK 17 instalado
- [ ] Un editor o IDE con soporte para Gradle Kotlin DSL

---

## Cómo empezar

1. Haz clic en **"Copiar ejercicio"** para crear tu propio repositorio desde esta plantilla.
2. Espera a que GitHub Actions abra el **issue del ejercicio** automáticamente.
3. Sigue las instrucciones del issue y resuelve un patrón por paso.
4. Cada `push` a `main` validará tu avance y publicará el siguiente paso.

---

## Estructura del proyecto

```
learn-design-patterns-kotlin/
├── src/
│   └── main/
│       └── kotlin/
│           └── patterns/
│               ├── creational/
│               │   ├── FactoryMethod.kt
│               │   ├── AbstractFactory.kt
│               │   ├── Builder.kt
│               │   ├── Prototype.kt
│               │   └── Singleton.kt
│               ├── structural/
│               │   ├── Adapter.kt
│               │   ├── Bridge.kt
│               │   ├── Composite.kt
│               │   ├── Decorator.kt
│               │   ├── Facade.kt
│               │   ├── Flyweight.kt
│               │   └── Proxy.kt
│               └── behavioral/
│                   ├── ChainOfResponsibility.kt
│                   ├── Command.kt
│                   ├── Iterator.kt
│                   ├── Mediator.kt
│                   ├── Memento.kt
│                   ├── Observer.kt
│                   ├── State.kt
│                   ├── Strategy.kt
│                   ├── TemplateMethod.kt
│                   └── Visitor.kt
└── .github/
    ├── steps/
    └── workflows/
```

---

## ¿Tienes dudas?

Abre un issue en este repositorio o consulta documentación de referencia sobre patrones GoF y Kotlin. Lo importante es que expliques cada decisión de diseño con nombres claros y ejemplos pequeños.
