package co.edu.unbosque.controller;

import co.edu.unbosque.view.Consola;
import co.edu.unbosque.model.Ejercicio;
import co.edu.unbosque.model.NumeroFactorial;
import co.edu.unbosque.model.SerieFibonacci;

public class Controlador {
    private Consola vista;

    public Controlador() {
        vista = new Consola();
    }

    public void ejecutar() {
        int opcion;
        do {
            vista.limpiarPantalla();
            opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1:
                    ejecutarFactorial();
                    break;
                case 2:
                    ejecutarSumaDigitos();
                    break;
                case 3:
                    ejecutarNumeroPrimo();
                    break;
                case 4:
                    ejecutarFibonacci();
                    break;
                case 5:
                    ejecutarPotencia();
                    break;
                case 0:
                    vista.mostrarMensaje("¡Gracias por usar el sistema!");
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida. Intente nuevamente.");
            }

            if (opcion != 0) {
                vista.mostrarMensaje("\nPresione Enter para continuar...");
                vista.consola.nextLine();
            }

        } while (opcion != 0);
    }

    /**
     * Ejercicio A: calcula el factorial del numero ingresado.
     */
    private void ejecutarFactorial() {
        try {
            int numero = vista.pedirNumeroFactorial();
            NumeroFactorial numFact = new NumeroFactorial(numero);
            Ejercicio.calcularFactorial(numFact);
            vista.mostrarResultado("Factorial de " + numero,
                                 String.valueOf(numFact.getResultado()));
        } catch (Exception e) {
            vista.mostrarMensaje("Error: " + e.getMessage());
        }
    }

    /**
     * Ejercicio B: suma los digitos del numero ingresado.
     */
    private void ejecutarSumaDigitos() {
        try {
            int numero = vista.pedirNumeroSumaDigitos();
            int suma = Ejercicio.sumarDigitos(numero);
            vista.mostrarResultado("Suma de digitos de " + numero, String.valueOf(suma));
        } catch (Exception e) {
            vista.mostrarMensaje("Error: " + e.getMessage());
        }
    }

    /**
     * Ejercicio C: determina si el numero ingresado es primo.
     */
    private void ejecutarNumeroPrimo() {
        try {
            int numero = vista.pedirNumeroPrimo();
            boolean esPrimo = Ejercicio.esNumeroPrimo(numero);
            vista.mostrarResultado("Numero primo: " + numero,
                    esPrimo ? "Si es primo" : "No es primo");
        } catch (Exception e) {
            vista.mostrarMensaje("Error: " + e.getMessage());
        }
    }

    /**
     * Ejercicio L: genera la serie de Fibonacci con la cantidad de terminos indicada.
     */
    private void ejecutarFibonacci() {
        try {
            int limite = vista.pedirLimiteFibonacci();
            int[] serie = Ejercicio.generarFibonacci(new SerieFibonacci(limite));
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < serie.length; i++) {
                sb.append(serie[i]);
                if (i < serie.length - 1) {
                    sb.append(", ");
                }
            }
            vista.mostrarResultado("Serie Fibonacci (" + limite + " terminos)",
                    serie.length == 0 ? "(sin terminos)" : sb.toString());
        } catch (Exception e) {
            vista.mostrarMensaje("Error: " + e.getMessage());
        }
    }

    /**
     * Ejercicio: calcula la potencia de una base elevada a un exponente.
     */
    private void ejecutarPotencia() {
        try {
            int base = vista.pedirBasePotencia();
            int exponente = vista.pedirExponentePotencia();
            long resultado = Ejercicio.calcularPotencia(base, exponente);
            vista.mostrarResultado(base + " elevado a " + exponente, String.valueOf(resultado));
        } catch (Exception e) {
            vista.mostrarMensaje("Error: " + e.getMessage());
        }
    }
}