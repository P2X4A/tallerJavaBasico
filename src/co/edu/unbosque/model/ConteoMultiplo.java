package co.edu.unbosque.model;

public class ConteoMultiplo {
	// Clase que representa el ejercicio O
	private int[] elementos;
	private int divisor;

	public ConteoMultiplo(int[] elementos, int divisor) {
		this.elementos = elementos;
		this.divisor = divisor;
	}

	public int[] getElementos() {
		return elementos;
	}

	public void setElementos(int[] elementos) {
		this.elementos = elementos;
	}

	public int getDivisor() {
		return divisor;
	}

	public void setDivisor(int divisor) {
		this.divisor = divisor;
	}
}
