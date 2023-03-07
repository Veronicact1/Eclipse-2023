package com.animales.examen3;

public abstract class Animales implements SeresVivos {
		// Atribjuto
		public int velocidad;
		// Metodo
		public abstract void reactionar();
		//Constructor
		protected Animales(int velocidad) {
			this.velocidad = velocidad;
		}
		//getter and setter
		public int getVelocidad() {
			return velocidad;
		}

		public void setVelocidad(int velocidad) {
			this.velocidad = velocidad;
		}
		

}



//Crea un aplicativo en
//“MainExamen3.java” creando 3 objetos de cada clase que muestre, mediante los
//métodos de cada clase Colibri, Delfin y Leopardo, por pantalla sus atributos, es
//decir, cada método llame a un atributo y también otro método que pueda darle
//valor al otro atributo (recuerda el set y get). Haz la clase Animales abstracta.
