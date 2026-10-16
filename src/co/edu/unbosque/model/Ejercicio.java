package co.edu.unbosque.model;

public class Ejercicio {

	/*
	 * En esta clase deben haber los metodos para resolver los ejercicios De modo
	 * que como está en el taller, deben ser estaticos,
	 * 
	 * 1ro. Voy a crear una clase para cada ejercicio, si hago las variables dentro
	 * de cada metodo de esta clase, se pueden perder los datos en MVC, y a mi
	 * manera de programar, es mejor así para mí
	 */

	/**
	 * a) Calcular factorial de un número usando ciclos.
	 */
	public static long calcularFactorial(NumeroFactorial numeroFactorial) {
		if (numeroFactorial == null)
			throw new IllegalArgumentException("Modelo NumeroFactorial nulo");
		int numero = numeroFactorial.getNumero();
		if (numero < 0)
			throw new IllegalArgumentException("El factorial no está definido para números negativos");
		long resultado = 1L;
		for (int i = 2; i <= numero; i++) {
			resultado *= i;
		}
		numeroFactorial.setResultado(resultado);
		return resultado;
	}

	/**
	 * b) Suma de los dígitos de un número entero usando ciclos.
	 */
	public static int sumarDigitos(int numero) {
		if (numero < 0)
			throw new IllegalArgumentException("El número debe ser no negativo");
		int suma = 0;
		int restante = numero;
		while (restante > 0) {
			suma += restante % 10;
			restante /= 10;
		}
		return suma;
	}

	/**
	 * c) Verifica si un número entero es primo.
	 */
	public static boolean esNumeroPrimo(int numero) {
		return esPrimo(numero);
	}

	/**
	 * d) Calcula la potencia de una base usando ciclos por multiplicación repetida.
	 */
	public static long calcularPotencia(int base, int exponente) {
		if (exponente < 0)
			throw new IllegalArgumentException("El exponente no puede ser negativo");
		long resultado = 1L;
		for (int i = 0; i < exponente; i++) {
			resultado *= base;
		}
		return resultado;
	}

	/**
	 * b) Contar número de caracteres en un DocumentoTexto.
	 */
	public static int contarCaracteres(DocumentoTexto documento) {
		if (documento == null)
			throw new IllegalArgumentException("DocumentoTexto nulo");
		String contenido = documento.getContenido();
		if (contenido == null)
			throw new IllegalArgumentException("Contenido del documento es nulo");
		return contenido.length();
	}

	/**
	 * c) Comparar dos textos respetando mayúsculas/minúsculas (case-sensitive).
	 */
	public static boolean sonIgualesCaseSensitive(CompararTextoCase comparadorCase) {
		if (comparadorCase == null)
			throw new IllegalArgumentException("CompararTextoCase nulo");
		String textoPrimario = comparadorCase.getTextoPrimario();
		String textoSecundario = comparadorCase.getTextoSecundario();
		if (textoPrimario == null || textoSecundario == null)
			throw new IllegalArgumentException("Alguna de las cadenas es nula");
		return textoPrimario.equals(textoSecundario);
	}

	/**
	 * d) Comparar dos textos ignorando mayúsculas/minúsculas (case-insensitive).
	 */
	public static boolean sonIgualesIgnoreCase(ComparadorTextoInsensible comparadorInsensible) {
		if (comparadorInsensible == null)
			throw new IllegalArgumentException("ComparadorTextoInsensible nulo");
		String textoPrimario = comparadorInsensible.getTextoPrimario();
		String textoSecundario = comparadorInsensible.getTextoSecundario();
		if (textoPrimario == null || textoSecundario == null)
			throw new IllegalArgumentException("Alguna de las cadenas es nula");
		return textoPrimario.equalsIgnoreCase(textoSecundario);
	}

	/**
	 * e) Determinar si textoSecundario está contenido en textoPrimario.
	 */
	public static boolean contieneSubCadena(BusquedaSubCadena busqueda) {
		if (busqueda == null)
			throw new IllegalArgumentException("BusquedaSubCadena nulo");
		String textoPrimario = busqueda.getTextoPrimario();
		String textoSecundario = busqueda.getTextoSecundario();
		if (textoPrimario == null || textoSecundario == null)
			throw new IllegalArgumentException("Alguna de las cadenas es nula");
		return textoPrimario.contains(textoSecundario);
	}

	/**
	 * f) Obtener el carácter en la posición indicada (0-based).
	 */
	public static char obtenerCaracterEnPosicion(ConsultaCaracter consulta) {
		if (consulta == null)
			throw new IllegalArgumentException("ConsultaCaracter nulo");
		String texto = consulta.getTexto();
		int indice = consulta.getIndice();
		if (texto == null)
			throw new IllegalArgumentException("Texto nulo");
		if (indice < 0 || indice >= texto.length())
			throw new IndexOutOfBoundsException("Índice fuera de rango");
		return texto.charAt(indice);
	}

	/**
	 * g) Obtener subcadena entre dos índices (inicio inclusive, fin exclusive).
	 */
	public static String obtenerSubcadena(RangoTexto rango) {
		if (rango == null)
			throw new IllegalArgumentException("RangoTexto nulo");
		String texto = rango.getTexto();
		int indiceInicio = rango.getIndiceInicio();
		int indiceFin = rango.getIndiceFin();
		if (texto == null)
			throw new IllegalArgumentException("Texto nulo");
		if (indiceInicio < 0 || indiceFin < 0 || indiceInicio > indiceFin || indiceFin > texto.length()) {
			throw new IndexOutOfBoundsException("Índices fuera de rango o inválidos");
		}
		return texto.substring(indiceInicio, indiceFin);
	}

	/**
	 * h) Promedio de un arreglo de enteros.
	 */
	public static double promedio(VectorEntero vector) {
		if (vector == null)
			throw new IllegalArgumentException("VectorEntero nulo");
		int[] elementos = vector.getElementos();
		if (elementos == null)
			throw new IllegalArgumentException("Elementos nulos");
		if (elementos.length == 0)
			throw new IllegalArgumentException("Vector vacío");
		long suma = 0L;
		for (int valor : elementos)
			suma += valor;
		return (double) suma / elementos.length;
	}

	/**
	 * i) Promedio de los números pares en un arreglo.
	 */
	public static double promedioPares(VectorEntero vector) {
		if (vector == null)
			throw new IllegalArgumentException("VectorEntero nulo");
		int[] elementos = vector.getElementos();
		if (elementos == null)
			throw new IllegalArgumentException("Elementos nulos");
		long sumaPares = 0L;
		int contadorPares = 0;
		for (int valor : elementos) {
			if (valor % 2 == 0) {
				sumaPares += valor;
				contadorPares++;
			}
		}
		if (contadorPares == 0)
			throw new IllegalArgumentException("No hay números pares en el vector");
		return (double) sumaPares / contadorPares;
	}

	/**
	 * j) Promedio de los números impares en un arreglo.
	 */
	public static double promedioImpares(VectorEntero vector) {
		if (vector == null)
			throw new IllegalArgumentException("VectorEntero nulo");
		int[] elementos = vector.getElementos();
		if (elementos == null)
			throw new IllegalArgumentException("Elementos nulos");
		long sumaImpares = 0L;
		int contadorImpares = 0;
		for (int valor : elementos) {
			if (valor % 2 != 0) {
				sumaImpares += valor;
				contadorImpares++;
			}
		}
		if (contadorImpares == 0)
			throw new IllegalArgumentException("No hay números impares en el vector");
		return (double) sumaImpares / contadorImpares;
	}

	/**
	 * k) Sumatoria de los elementos del vector.
	 */
	public static long sumatoria(VectorEntero vector) {
		if (vector == null)
			throw new IllegalArgumentException("VectorEntero nulo");
		int[] elementos = vector.getElementos();
		if (elementos == null)
			throw new IllegalArgumentException("Elementos nulos");
		long total = 0L;
		for (int valor : elementos)
			total += valor;
		return total;
	}

	/**
	 * l) Calcular n términos de la serie de Fibonacci usando ciclos.
	 */
	public static int[] generarFibonacci(SerieFibonacci solicitud) {
		if (solicitud == null)
			throw new IllegalArgumentException("SerieFibonacci nulo");
		int cantidad = solicitud.getCantidadTerminos();
		if (cantidad < 0)
			throw new IllegalArgumentException("La cantidad de términos debe ser >= 0");
		if (cantidad == 0)
			return new int[0];
		int[] serie = new int[cantidad];
		if (cantidad >= 1)
			serie[0] = 0;
		if (cantidad >= 2)
			serie[1] = 1;
		for (int i = 2; i < cantidad; i++) {
			serie[i] = serie[i - 1] + serie[i - 2];
		}
		return serie;
	}

	/**
	 * m) Cantidad de números primos en un arreglo.
	 */
	public static int contarPrimos(ConteoPrimo conteo) {
		if (conteo == null)
			throw new IllegalArgumentException("ConteoPrimo nulo");
		int[] elementos = conteo.getElementos();
		if (elementos == null)
			throw new IllegalArgumentException("Elementos nulos");
		int contadorPrimos = 0;
		for (int valor : elementos) {
			if (esPrimo(valor))
				contadorPrimos++;
		}
		return contadorPrimos;
	}

	/**
	 * n) Cantidad de números pares en un arreglo.
	 */
	public static int contarPares(ConteoPar conteo) {
		if (conteo == null)
			throw new IllegalArgumentException("ConteoPar nulo");
		int[] elementos = conteo.getElementos();
		if (elementos == null)
			throw new IllegalArgumentException("Elementos nulos");
		int contador = 0;
		for (int valor : elementos)
			if (valor % 2 == 0)
				contador++;
		return contador;
	}

	/**
	 * o) Cantidad de múltiplos de un número dado en un arreglo.
	 */
	public static int contarMultiplos(ConteoMultiplo conteo) {
		if (conteo == null)
			throw new IllegalArgumentException("ConteoMultiplo nulo");
		int[] elementos = conteo.getElementos();
		if (elementos == null)
			throw new IllegalArgumentException("Elementos nulos");
		int divisor = conteo.getDivisor();
		if (divisor == 0)
			throw new IllegalArgumentException("Divisor no puede ser cero");
		int contador = 0;
		for (int valor : elementos) {
			if (valor % divisor == 0)
				contador++;
		}
		return contador;
	}

	/**
	 * p) Determina si un estudiante es elegible para recibir una beca. Criterios: -
	 * GPA >= 4.0 Y nivelSocioeconomico <= 4 - O, si es deportista destacado y GPA
	 * >= 3.5 (sin importar NSE)
	 */
	public static boolean esElegibleBeca(Estudiante estudiante) {
		if (estudiante == null)
			throw new IllegalArgumentException("Estudiante nulo");
		double gpa = estudiante.getGpa();
		int nivelSocioeconomico = estudiante.getNivelSocioeconomico();
		boolean deportistaDestacado = estudiante.isDeportistaDestacado();

		if (gpa >= 4.0 && nivelSocioeconomico <= 4)
			return true;
		if (deportistaDestacado && gpa >= 3.5)
			return true;
		return false;
	}

	/**
	 * q) Determina el tipo de viaje según presupuesto, duración y temporada.
	 */
	public static String clasificarViaje(ClasificacionViaje solicitud) {
		if (solicitud == null)
			throw new IllegalArgumentException("ClasificacionViaje nulo");
		double presupuestoUSD = solicitud.getPresupuestoUSD();
		int duracionDias = solicitud.getDuracionDias();
		boolean esTemporadaAlta = solicitud.isEsTemporadaAlta();

		if (presupuestoUSD < 500.0 || duracionDias < 2) {
			return "Presupuesto o duración insuficiente.";
		}

		if (presupuestoUSD >= 3000.0 && duracionDias > 10) {
			if (esTemporadaAlta)
				return "Viaje de Lujo pero con el recargo de la temporada alta";
			return "Viaje de Lujo (todo incluido).";
		}

		if (presupuestoUSD >= 1500.0 && duracionDias >= 5 && duracionDias <= 10) {
			return "Viaje Estándar (Destino local).";
		}

		return "Viaje Económico (Mochilero).";
	}

    //Metodo auxiliar

	/**
	 * Verifica si un entero es primo (> 1).
	 */
	private static boolean esPrimo(int valor) {
		if (valor <= 1)
			return false;
		if (valor == 2)
			return true;
		if (valor % 2 == 0)
			return false;
		int limite = (int) Math.sqrt(valor);
		for (int i = 3; i <= limite; i += 2) {
			if (valor % i == 0)
				return false;
		}
		return true;
	}
}
