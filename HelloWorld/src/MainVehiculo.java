
public class MainVehiculo {

	public static void main(String[] args) {
		Bicicleta bh  = new Bicicleta();
		Coche lexus  = new Coche();
		Avion boeing  = new Avion();
		Main.invocarParar(bh);
		Main.invocarParar(lexus);
		Main.invocarParar(boeing);
	}

}
