package com.app.genral;
public  class Circulo extends Figura implements Dibujable{
	private float radio;
	

	public float getRadio() {
		return radio;
	}
	public void setRadio(float radio) {
		this.radio = radio;
	}
	protected Circulo(float radio) {
		this.radio = radio;
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Dibujando el circulo");
	}
	@Override
	public double dibujar() {
		// TODO Auto-generated method stub
		return pi*Math.pow(radio,2);
	}

}

