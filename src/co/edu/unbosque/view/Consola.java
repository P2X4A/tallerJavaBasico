package co.edu.unbosque.view;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Consola {

    public Scanner consola;

    public Consola() {
        consola = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("\n=== SISTEMA DE EJERCICIOS MATEMÁTICOS ===");
        System.out.println("1. Calcular Factorial de un número");
        System.out.println("2. Calcular Suma de dígitos");
        System.out.println("3. Verificar si un número es primo");
        System.out.println("4. Calcular Serie Fibonacci");
        System.out.println("5. Calcular Potencia de un número");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
        int opcion = -1;
        try {
            opcion = consola.nextInt();
            consola.nextLine(); // limpiar buffer
        } catch (InputMismatchException e) {
            consola.nextLine(); // limpiar buffer incorrecto
            opcion = -1;
        }
        return opcion;
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    // --- Métodos para pedir datos de cada ejercicio ---

    public int pedirNumeroFactorial() {
        while (true) {
            try {
                System.out.print("\nIngrese un número entero no negativo para calcular su factorial: ");
                int numero = consola.nextInt();
                consola.nextLine();
                if (numero >= 0) {
                    return numero;
                } else {
                    System.out.println("Error: El número no puede ser negativo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero válido.");
                consola.nextLine();
            }
        }
    }

    public int pedirNumeroSumaDigitos() {
        while (true) {
            try {
                System.out.print("\nIngrese un número entero para calcular la suma de sus dígitos: ");
                int numero = consola.nextInt();
                consola.nextLine();
                return numero;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero válido.");
                consola.nextLine();
            }
        }
    }

    public int pedirNumeroPrimo() {
        while (true) {
            try {
                System.out.print("\nIngrese un número entero para verificar si es primo: ");
                int numero = consola.nextInt();
                consola.nextLine();
                if (numero >= 2) {
                    return numero;
                } else {
                    System.out.println("Error: El número debe ser mayor o igual a 2.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero válido.");
                consola.nextLine();
            }
        }
    }

    public int pedirLimiteFibonacci() {
        while (true) {
            try {
                System.out.print("\nIngrese el límite para la serie Fibonacci: ");
                int limite = consola.nextInt();
                consola.nextLine();
                if (limite >= 0) {
                    return limite;
                } else {
                    System.out.println("Error: El límite no puede ser negativo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero válido.");
                consola.nextLine();
            }
        }
    }

    public int pedirBasePotencia() {
        while (true) {
            try {
                System.out.print("\nIngrese la base para calcular la potencia: ");
                int base = consola.nextInt();
                consola.nextLine();
                return base;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero válido.");
                consola.nextLine();
            }
        }
    }

    public int pedirExponentePotencia() {
        while (true) {
            try {
                System.out.print("Ingrese el exponente para calcular la potencia: ");
                int exponente = consola.nextInt();
                consola.nextLine();
                return exponente;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero válido.");
                consola.nextLine();
            }
        }
    }

    public boolean pedirConfirmacion(String mensaje) {
        System.out.print(mensaje + " (s/n): ");
        String respuesta = consola.nextLine().toLowerCase();
        return respuesta.equals("s") || respuesta.equals("si");
    }

    public void mostrarResultado(String ejercicio, String resultado) {
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Ejercicio: " + ejercicio);
        System.out.println("Resultado: " + resultado);
        System.out.println("=================");
    }

    public void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}