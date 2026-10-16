package co.edu.unbosque.model;

public class RangoTexto {
	// Clase que representa el ejercicio G
	private String texto;
	private int indiceInicio; // inclusive, 0-based
	private int indiceFin; // exclusive, 0-based

	public RangoTexto(String texto, int indiceInicio, int indiceFin) {
		this.texto = texto;
		this.indiceInicio = indiceInicio;
		this.indiceFin = indiceFin;
	}

	public String getTexto() {
		return texto;
	}

	public int getIndiceInicio() {
		return indiceInicio;
	}

	public int getIndiceFin() {
		return indiceFin;
	}
}
