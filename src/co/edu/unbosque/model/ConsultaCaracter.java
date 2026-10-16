package co.edu.unbosque.model;

public class ConsultaCaracter {
	// Clase que representa el ejercicio F
	private String texto;
	private int indice; // índice basado en 0

	public ConsultaCaracter(String texto, int indice) {
		this.texto = texto;
		this.indice = indice;
	}

	public String getTexto() {
		return texto;
	}

	public int getIndice() {
		return indice;
	}
}
