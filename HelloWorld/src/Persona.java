
public abstract class Persona {
	protected int id;
	protected int edad;
	protected int telefono;
	
	public void mostrarInfo() {}
	public abstract int mostrarID();
//get and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	//constructors
	protected Persona(int id, int edad, int telefono) {
		this.id = id;
		this.edad = edad;
		this.telefono = telefono;
	}
	
	
}