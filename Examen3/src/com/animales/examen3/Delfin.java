package com.animales.examen3;

public abstract class Delfin extends Animales {



	public static void main(String[] args) {}
		//Atributos
		protected int dientes;
		protected int alas;
		//Metodos
		public abstract void nadar();
		public abstract void emitirSonidos();
		
		protected Delfin(int velocidad) {
		super(velocidad);
		// TODO Auto-generated constructor stub
	}
		
	@Override
	public void reactionar() {
		// TODO Auto-generated method stub
		
	}
	//constructor
	protected Delfin(int velocidad, int dientes, int alas) {
		super(velocidad);
		this.dientes = dientes;
		this.alas = alas;
	}
	//getter&setter
	public int getDientes() {
		return dientes;
	}
	public void setDientes(int dientes) {
		this.dientes = dientes;
	}
	public int getAlas() {
		return alas;
	}
	public void setAlas(int alas) {
		this.alas = alas;
	}
	
}
