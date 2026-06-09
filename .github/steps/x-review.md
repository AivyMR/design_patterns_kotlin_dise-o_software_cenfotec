# 🎉 ¡Ejercicio completado!

¡Felicitaciones! Has completado el recorrido de **22 patrones de diseño GoF en Kotlin**. No solo implementaste cada patrón; también practicaste cuándo conviene usarlo y qué problema intenta resolver.

## Resumen de lo aprendido

### Patrones creacionales
- **Método fábrica**: delegaste la creación de productos a creadores concretos.
- **Fábrica abstracta**: construiste familias de objetos compatibles.
- **Constructor**: armaste objetos complejos paso a paso.
- **Prototipo**: clonaste configuraciones existentes.
- **Instancia única**: centralizaste una única instancia compartida.

### Patrones estructurales
- **Adaptador**: conectaste interfaces incompatibles.
- **Puente**: separaste abstracción e implementación.
- **Objeto compuesto**: trataste hojas y compuestos de forma uniforme.
- **Decorador**: agregaste comportamiento dinámicamente.
- **Fachada**: simplificaste subsistemas complejos.
- **Peso mosca**: compartiste estado intrínseco para ahorrar memoria.
- **Proxy**: controlaste el acceso a un objeto real.

### Patrones de comportamiento
- **Cadena de responsabilidad**: delegaste solicitudes entre manejadores.
- **Comando**: encapsulaste acciones como objetos.
- **Iterador**: recorriste colecciones sin exponer detalles internos.
- **Mediador**: centralizaste la colaboración entre colegas.
- **Recuerdo**: guardaste y restauraste instantáneas del estado.
- **Observador**: propagaste cambios a múltiples suscriptores.
- **Estado**: modelaste cambios de comportamiento según el contexto.
- **Estrategia**: intercambiaste algoritmos en tiempo de ejecución.
- **Método plantilla**: reutilizaste un flujo general con pasos variables.
- **Visitante**: aplicaste doble despacho para añadir operaciones externas.

## Qué desarrollaste realmente

```text
Crear objetos   → Factory Method, Abstract Factory, Builder, Prototype, Singleton
Estructurar     → Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy
Coordinar lógica→ Chain, Command, Iterator, Mediator, Memento, Observer, State,
          Strategy, Template Method, Visitor
```

## Próximos pasos sugeridos

- Refactoriza uno de tus ejemplos usando nombres de dominio reales.
- Compara pares de patrones parecidos: Strategy vs State, Adapter vs Facade, Factory Method vs Abstract Factory.
- Escribe pruebas unitarias pequeñas para cada implementación.
- Intenta reconocer estos patrones en frameworks o librerías que ya uses.

---

_Ejercicio creado para aprender diseño de software con Kotlin y GitHub Skills._
