package com.app.ejercicios;

public class Ex_string {

	public static void main(String[] args) {
//		String primer="Buenos dias";
//		String segundo="Buenas tardes";
//		
//		if (primer.charAt(0) == segundo.charAt (0)); {
//			System.out.println("Si que tienen las mismas letras iniciales");
//			System.out.println("No tienen las mismas letras iniciales");
//		String principio="Big Shop";
//		String ultimo="Small Shop";
//		int longprincipio=principio.length();
//		int longultimo=ultimo.length();
//		
//		
//		if (principio.charAt(principio.lenght()-2))==((longprincipio),longultimo);
//		//con lenth -1{
//		System.out.println("Si que tienen las mismas letras iniciales y finales");
//		System.out.println("No tienen las mismas letras iniciales y finales");
//	}
//		//ex.3 de string
//		String container=("Loa ninios empiazan a cantar abc, abc");
//		if(container.endsWith("abc"))return;
//		if(container.startsWith("abc"))return;
//		if(container.contains("abc")) {
//		System.out.println("abc se encuentra dentro del string");
//		}
//		
//		//ex.4 de string inainte si dupa;
//		String palabrar=("Sunshine my sister");
//		int indice=13;
//		char anterior=palabrar.charAt(indice-1);
//		char siguente=palabrar.charAt(indice+1);
//		if (anterior==siguente)
//			System.out.println("Son iguales");
//		else
//			System.out.println("No son iguales");
//	
//		//ex.5 pag 413
//		String a="Comensamos el curso";
//		int b=a.indexOf("a");
//		if (b<a, b++);
		
		//ex.6 palindromo
		String palindromo="sometemos";
		String inverso = "";

		System.out.println(palindromo.charAt(palindromo.length()-1));
		System.out.println(palindromo.length()-1);

		for (int i = palindromo.length()-1; i >=0; i--) {
		    inverso += palindromo.charAt(i);
		}
		System.out.println(inverso);

		if (palindromo.equals(inverso)) {
			System.out.println("La variable palindromo: " + palindromo + " es un palindromo");
		} else {
			System.out.println("La variable palindromo: " + palindromo + " NO es un palindromo");
		}
	}
}
