package com.app.genral;

public class Rectangulo extends Figura implements Dibujable {

	private int base;
	private int altura;
	
	protected Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public int getBase() {
		return base;
	}


	public void setBase(int base) {
		this.base = base;
	}


	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}


	@Override
	public void area() {
		System.out.println();
		
	}

	@Override
	public double dibujar() {
		return altura;
		// TODO Auto-generated method stub
		
	}
}

