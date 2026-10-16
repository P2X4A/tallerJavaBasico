# Taller de Java Basico

Cumpleto taller de Java con ejercicios de cadenas, arreglos, recursion y vectores.

## Detalle

| | |
|---|---|
| Tipo | Consola (MVC) |
| Archivos Java | 18 |
| Version de Java | 21 |
| Patron | 18 clases de modelo, una por ejercicio, con menu interactivo |

## Funcionalidades

- Factorial, suma de digitos, primos, Fibonacci y potencia
- Promedios de arreglos y de pares e impares
- Conteo de primos, pares y multiplos
- Busqueda y manipulacion de cadenas
- Comparacion con y sin distincion de mayusculas

## Estructura del proyecto

```
tallerJavaBasico/
|-- pom.xml       configuracion de Maven, importable desde cualquier IDE
|-- src/          codigo fuente
`-- README.md
```

## Como ejecutarlo

### Con Maven

```bash
mvn clean compile
mvn exec:java
```

### Con javac directamente

```bash
# Linux / macOS
javac -d bin $(find src -name "*.java")

# Windows (PowerShell)
javac -d bin (Get-ChildItem -Recurse -Filter *.java src).FullName
```

```bash
java -cp bin co.edu.unbosque.controller.AplMain
```

### Desde un IDE

Cualquier IDE con soporte de Java (Eclipse, IntelliJ IDEA, VS Code o NetBeans)
puede importar el proyecto directamente como **proyecto Maven**. Basta con abrir
o importar la carpeta: el IDE detecta el `pom.xml`, resuelve las dependencias y
compila sin configuracion adicional.

## Autor

Desarrollado por [Sergio Parra](https://github.com/P2X4A) como parte de su
formacion en Java.

## Licencia

Ver el archivo [LICENSE](LICENSE).