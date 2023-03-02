
public class Bicicleta extends Vehiculo {
	
	
	protected Bicicleta(int cambios) {
		this.cambios = cambios;
	}

	protected Bicicleta() {
		this.cambios =15;
	}
	

	public int getCambios() {
		return cambios;
	}

	public void setCambios(int cambios) {
		this.cambios = cambios;
	}

	private int cambios;
	
	
}
