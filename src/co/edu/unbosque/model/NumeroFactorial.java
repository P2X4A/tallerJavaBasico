package co.edu.unbosque.model;

public class NumeroFactorial {
	// Clase que representa el ejercicio A
	private int numero; // número entero >= 0
	private long resultado; // resultado del cálculo, lo almacena el modelo

	public NumeroFactorial(int numero) {
		this.numero = numero;
		this.resultado = 0L;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public long getResultado() {
		return resultado;
	}

	public void setResultado(long resultado) {
		this.resultado = resultado;
	}

	@Override
	public String toString() {
		return "NumeroFactorial{numero=" + numero + ", resultado=" + resultado + "}";
	}
}