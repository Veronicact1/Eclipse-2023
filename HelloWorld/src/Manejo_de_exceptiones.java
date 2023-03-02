
public class Manejo_de_exceptiones {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		/* se generación una excepción porque en la sexta iteración del bucle se realiza la 
//		operación matemática 5/0 (infinito) y ese valor no puede ser almacenado en una 
//		variable de tipo int. Se arroja una excepción de tipo ArithmeticException y el programa 
//		se detiene en ese punto*/
//		for(int i = -5; i < 5; i++) { 
//		int c = 5 / i; 
//		System.out.println(c);
//		}
//		/*
//		Exception in thread "main" java.lang.ArithmeticException: / by zero 
//		at Main.main(Main.java:9)
//		*/
//	}
		try {
			for (int i = -5; i < 5; i++) {
				int c = 5 / i;
				System.out.println(c);
			}
		}
//captura la excepción de tipo ArithmeticException 
		catch (ArithmeticException e) {
			System.out.println("Excepción arimética");
		}
//captura cualquier otra excepción que pueda producirse 
		catch (Exception e) {
			System.out.println("Otro error desconocido");
		}
		System.out.println("Programa finalizado");
	}
}
//trata de ejecutar el código que se encuentra entre las llaves 
