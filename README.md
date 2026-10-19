# Basic Java Workshop - tallerJavaBasico

## Description

Complete basic Java workshop: string exercises (substring search, ranges, case-insensitive comparison), character and number queries, counts of multiples, even numbers and primes, Fibonacci series, factorials, integer vectors and more, each resolved as a small class behind a menu-driven console interface.

Academic project developed for the **Java programming** courses - Systems Engineering, Universidad El Bosque.

## Author

- Sergio Alejandro Parra Rivera

## Technologies

- Java 21 (compiled with `maven-compiler-plugin`)
- Maven 3.8+ with `exec-maven-plugin` to run the application
- **MVC** architecture (`controller`, `model`, `view`)
- One model class per exercise

## Requirements

| Requirement | Version | How to check |
| --- | --- | --- |
| JDK | 21 or higher | `javac -version` |
| Maven | 3.8 or higher | `mvn -v` |
| Git | Any recent version | `git --version` |

## Installation

Follow these steps exactly so the application runs on the first try.

### 1. Clone the repository

```bash
git clone https://github.com/P2X4A/tallerJavaBasico.git
```

### 2. Enter the project folder

```bash
cd tallerJavaBasico
```

> On Windows, if your path contains spaces, always quote it, for example: `cd "C:\Users\Example\Documents\tallerJavaBasico"`.

### 3. Verify your environment

```bash
javac -version
mvn -v
```

Expected: JDK 21 (or higher) and Maven 3.8 (or higher). If any command fails, install or update that tool before continuing.

### 4. Compile the project

```bash
mvn clean compile
```

What success looks like:

- The console ends with `BUILD SUCCESS`.
- A `target/classes/` folder is created with the compiled classes.

## Running the application

```bash
mvn exec:java
```

The exercise menu is displayed in the terminal; select an option to run each exercise with its own input.

Troubleshooting:

- `ClassNotFoundException` or missing main class: compile first with `mvn clean compile`.
- `UnsupportedClassVersionError`: your JDK is older than 21; install JDK 21 or higher and check it with `javac -version`.

## Main features

- **Text exercises:** substring search (`BusquedaSubCadena`), text ranges (`RangoTexto`), character queries (`ConsultaCaracter`) and case handling (`CompararTextoCase`, `ComparadorTextoInsensible`).
- **Number exercises:** even counts (`ConteoPar`), prime counts (`ConteoPrimo`), multiples (`ConteoMultiplo`), Fibonacci (`SerieFibonacci`) and factorials (`NumeroFactorial`).
- **Data structures:** `VectorEntero` for integer vector operations.
- **Documents:** `DocumentoTexto` to process a body of text.
- **Classification:** `ClasificacionViaje` and `Estudiante` as small domain exercises.
- **Menu driven:** `Ejercicio` defines the exercises and `Consola` renders the menu to pick one.

## Project structure

```text
tallerJavaBasico/
├── pom.xml
├── README.md
├── LICENSE
└── src/
    └── co/edu/unbosque/
        ├── controller/
        │   ├── AplMain.java               # Entry point (main class)
        │   └── Controlador.java           # Routes the selected exercise
        ├── model/                         # One class per exercise
        │   ├── Ejercicio.java             # Exercise definitions
        │   ├── BusquedaSubCadena.java
        │   ├── RangoTexto.java
        │   ├── ConsultaCaracter.java
        │   ├── CompararTextoCase.java
        │   ├── ComparadorTextoInsensible.java
        │   ├── ConteoPar.java
        │   ├── ConteoPrimo.java
        │   ├── ConteoMultiplo.java
        │   ├── SerieFibonacci.java
        │   ├── NumeroFactorial.java
        │   ├── VectorEntero.java
        │   ├── DocumentoTexto.java
        │   ├── ClasificacionViaje.java
        │   └── Estudiante.java
        └── view/
            └── Consola.java               # Exercise menu
```
