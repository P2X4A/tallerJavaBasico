package co.edu.unbosque.model;

public class ClasificacionViaje {
	// Clase para representar el ejercicio Q
	private double presupuestoUSD;
	private int duracionDias;
	private boolean esTemporadaAlta;

	public ClasificacionViaje(double presupuestoUSD, int duracionDias, boolean esTemporadaAlta) {
		this.presupuestoUSD = presupuestoUSD;
		this.duracionDias = duracionDias;
		this.esTemporadaAlta = esTemporadaAlta;
	}

	public double getPresupuestoUSD() {
		return presupuestoUSD;
	}

	public int getDuracionDias() {
		return duracionDias;
	}

	public boolean isEsTemporadaAlta() {
		return esTemporadaAlta;
	}

}
