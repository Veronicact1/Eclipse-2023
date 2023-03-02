package com.app.f2;

import com.app.ejercicios.Vehiculo;

public class Bicicleta implements Vehiculo {
	
	
	protected Bicicleta(int cambios) {
		this.cambios = cambios;
	}

	public Bicicleta() {
		this.cambios =15;
	}
	

	public int getCambios() {
		return cambios;
	}

	public void setCambios(int cambios) {
		this.cambios = cambios;
	}

	private int cambios;

	@Override
	public void parar() {
		// TODO Auto-generated method stub
		
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
