package co.edu.unbosque.model;

public class BusquedaSubCadena {
	// Clase que representa el ejercicio E
	private String textoPrimario;
	private String textoSecundario;

	public void ComparadorTextoInsensible(String textoPrimario, String textoSecundario) {
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
