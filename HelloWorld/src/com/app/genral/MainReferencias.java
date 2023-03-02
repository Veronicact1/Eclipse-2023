package com.app.genral;

public class MainReferencias {

	public static void main(String[] args) {
		int valor1=5;
		MainReferencias.cambiarValor(valor1);
		System.out.println(valor1);

	}
	public static void cambiarValor(int valor1) {
		valor1=6;
		System.out.println(valor1);
	}
}