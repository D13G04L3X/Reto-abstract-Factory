# Solución Reto - Abstract Factory

Contenido de la carpeta:

- `Main.java` - punto de entrada
- `src/` - código fuente organizado por paquetes
- `Informe.md` - breve informe solicitado
- `uml.mmd` - diagrama UML en formato Mermaid

Pasos para compilar y ejecutar (Windows PowerShell):

1) Abrir PowerShell en la raíz de la carpeta `Solucion_Reto`.

2) Compilar todos los `.java` y colocar las clases en `out`:

```powershell
Get-ChildItem -Recurse -Filter *.java | ForEach-Object { $_.FullName } | % { $_ }
javac -d out Main.java src\**\*.java
```

3) Ejecutar la clase `Main`:

```powershell
java -cp out src.Main
```

Verificación rápida: la salida debe mostrar:

```
Renderizando un botón estilo Windows.
Renderizando un checkbox estilo Windows.
```

Si tu sistema es Mac, la salida mostrará las versiones Mac.
