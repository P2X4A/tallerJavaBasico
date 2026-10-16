package co.edu.unbosque.model;

public class CompararTextoCase {
	// Clase que representa el ejercicio C
	private String textoPrimario;
	private String textoSecundario;

	public void ComparadorTextoCase(String textoPrimario, String textoSecundario) {
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
