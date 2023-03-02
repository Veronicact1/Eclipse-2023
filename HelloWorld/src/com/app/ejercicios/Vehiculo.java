package com.app.ejercicios;

public interface Vehiculo {
	public static final float g=9.8f;
	//public static final float velocidad=0;
	//public static final int asientos=0;
	//public static final int orientacionRuedas=0;
	
	public abstract void parar();
	public abstract void acelerar();
	public abstract void desacelerar();
	public abstract void girarIzquierda();
	public abstract void girarDerecha();
}
