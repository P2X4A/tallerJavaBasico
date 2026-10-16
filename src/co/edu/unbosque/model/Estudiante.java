package co.edu.unbosque.model;

public class Estudiante {
	//Clase para representar el ejercicio P
	private String nombre;
	private double gpa; // promedio de calificaciones
	private int nivelSocioeconomico; // 1..10 (1 más bajo, 10 más alto)
	private boolean deportistaDestacado;

	public Estudiante(String nombre, double gpa, int nivelSocioeconomico, boolean deportistaDestacado) {
		this.nombre = nombre;
		this.gpa = gpa;
		this.nivelSocioeconomico = nivelSocioeconomico;
		this.deportistaDestacado = deportistaDestacado;
	}

	public String getNombre() {
		return nombre;
	}

	public double getGpa() {
		return gpa;
	}

	public int getNivelSocioeconomico() {
		return nivelSocioeconomico;
	}

	public boolean isDeportistaDestacado() {
		return deportistaDestacado;
	}
}
