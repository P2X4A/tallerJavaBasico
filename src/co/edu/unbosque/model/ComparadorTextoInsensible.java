package co.edu.unbosque.model;

public class ComparadorTextoInsensible {
	// Clase que representa el ejercicio D
	private String textoPrimario;
	private String textoSecundario;

	public ComparadorTextoInsensible(String textoPrimario, String textoSecundario) {
		this.textoPrimario = textoPrimario;
		this.textoSecundario = textoSecundario;
	}

	public String getTextoPrimario() {
		return textoPrimario;
	}

	public String getTextoSecundario() {
		return textoSecundario;
	}
}
