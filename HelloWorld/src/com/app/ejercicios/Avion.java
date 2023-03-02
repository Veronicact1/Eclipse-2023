package com.app.ejercicios;

public class Avion implements Vehiculo{
	private boolean trenAterrizaje;
	public void volar() {}
	public void aterrizaje() {}
	public boolean isTrenAterrizaje() {
		return trenAterrizaje;
	}
	public void setTrenAterrizaje(boolean trenAterrizaje) {
		this.trenAterrizaje = trenAterrizaje;
	}
	protected Avion() {}
	protected Avion(boolean trenAterrizaje) {
		this.trenAterrizaje = trenAterrizaje;
	}
	public void parar() {
		System.out.println("Metodo parar avion");
	}
	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void desacelerar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void girarIzquierda() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void girarDerecha() {
		// TODO Auto-generated method stub
		
	}
}