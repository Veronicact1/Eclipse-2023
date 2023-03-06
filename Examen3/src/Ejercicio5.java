
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primero=12;
		int segundo=8;
		int tercero=4;
		int cuarto=10;
		
		if ((primero>segundo)&&(primero>tercero)&&(primero>cuarto)) {
			System.out.printf("El numero mayor es:%d",primero);
		} else if ((segundo>primero)&&(segundo>tercero)&&(segundo>cuarto)) {
			System.out.printf("El numero mayor es:%d", segundo);
		} else if ((tercero>primero)&&(tercero>segundo)&&(tercero>cuarto)) {
			System.out.printf("El numero mayor es:%d", tercero);
		}else {
		System.out.printf("El numero mayor es:%d", cuarto);
		}
		
	}

}
