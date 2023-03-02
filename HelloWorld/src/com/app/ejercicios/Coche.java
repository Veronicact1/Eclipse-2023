package com.app.ejercicios;

public class Coche implements Vehiculo {
	private float caballos;

	protected Coche() {
	}

	protected Coche(float caballos) {
		this.caballos = caballos;
	}

	public float getCaballos() {
		return caballos;
	}

	public void setCaballos(float caballos) {
		this.caballos = caballos;
	}

	public void parar() {
		System.out.println("Metodo parar coche");
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
