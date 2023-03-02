
public class Coche extends Vehiculo{
	private float caballos;

	public float getCaballos() {
		return caballos;
	}

	public void setCaballos(float caballos) {
		this.caballos = caballos;
	}

	protected Coche(float caballos) {
		this.caballos = caballos;
	}
	public void parar() {
		System.out.println("Metodo parar coche");
	}
}
