package com.animales.examen3;

public abstract class Leopardo extends Animales{
		//Atributos
		protected boolean cola;
		protected String print;
		//Metodos
		public abstract void volar();
		public abstract void cantar();
		
	protected Leopardo(int velocidad) {
		super(velocidad);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void reactionar() {
		// TODO Auto-generated method stub
		
	}
	//constructor
	protected Leopardo(int velocidad, boolean cola, String print) {
		super(velocidad);
		this.cola = cola;
		this.print = print;
	}
	//getter&setter
	public boolean isCola() {
		return cola;
	}
	public void setCola(boolean cola) {
		this.cola = cola;
	}
	public String getPrint() {
		return print;
	}
	public void setPrint(String print) {
		this.print = print;
	}
	

}
