# Informe - Solución del Reto: Abstract Factory

Breve descripción:

Se implementa el patrón Abstract Factory para permitir que la aplicación `Application` use familias de productos (`Button` y `Checkbox`) sin depender de sus implementaciones concretas.

Clases clave:

- `UIFactory` (interfaz): declara `createButton()` y `createCheckbox()`.
- `WinFactory`, `MacFactory`: fábricas concretas que devuelven productos de su familia.
- `Button`, `Checkbox` (interfaces): contratos para productos.
- `WinButton`, `WinCheckbox`, `MacButton`, `MacCheckbox`: implementaciones concretas.
- `Application`: cliente que recibe una `UIFactory` y usa sus productos.
- `Main`: punto de entrada que decide la fábrica según el SO.

Evidencia de ejecución:

Ejecutando `Main` en Windows produce:

```
Renderizando un botón estilo Windows.
Renderizando un checkbox estilo Windows.
```

Observaciones:

- Se corrigió el nombre de la carpeta de productos a `products` en la copia de la solución para evitar inconsistencias con los paquetes `src.products`.
