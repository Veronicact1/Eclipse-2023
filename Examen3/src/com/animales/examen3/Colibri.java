package com.animales.examen3;

public abstract class Colibri extends Animales{
		//Atributos
		private int numeroDePatas;
		private String color;
		//Metodos
		public void volar() {} 
		public void cantar() {}
		
		protected Colibri(int velocidad) {
			super(velocidad);
				// TODO Auto-generated constructor stub
	}
	@Override
	public void reactionar() {
		// TODO Auto-generated method stub
	}
	//constructor
	protected Colibri(int velocidad, int numeroDePatas, String color) {
		super(velocidad);
		this.numeroDePatas = numeroDePatas;
		this.color = color;
	}
	//getter&setter
	public int getNumeroDePatas() {
		return numeroDePatas;
	}
	public void setNumeroDePatas(int numeroDePatas) {
		this.numeroDePatas = numeroDePatas;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
