
public class Estudiante  extends Persona {
	
	
	protected Estudiante(int id, int edad, int telefono) {
		super(id, edad, telefono);
		// TODO Auto-generated constructor stub
	}
	
	private int numeroNotas;
	private int sumaNotas;
	private float notaMedia=sumaNotas/numeroNotas;
	
	public void mostrarInfo() {}
	public void agregarNuevaNota() {
		this.numeroNotas++;
		this.sumaNotas += notaMedia;	
	}
	public void agregarNuevaNota(float nuevaNota) {
		this.numeroNotas++;
		this.sumaNotas += nuevaNota;
	}
	public void agregarNuevaNota(boolean reinicio) {
		if(reinicio) {
			this.numeroNotas=0;	
			this.sumaNotas=0;	
			this.notaMedia=0.0f;
		}
		else agregarNuevaNota();
	}
	public static Estudiante crearEstudiante() {
		return new Estudiante();
	}
	
	
	//Setters y getters
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
	public int getNumeroNotas() {
		return numeroNotas;
	}
	public void setNumeroNotas(int numeroNotas) {
		this.numeroNotas = numeroNotas;
	}
	public float getSumaNotas() {
		return sumaNotas;
	}
	public void setSumaNotas(int sumaNotas) {
		this.sumaNotas = sumaNotas;
	}
	public float getNotaMedia() {
		return notaMedia;
	}
	public void setNotaMedia(float notaMedia) {
		this.notaMedia = notaMedia;
	}
	@Override
	public int mostrarID() {
		// TODO Auto-generated method stub
		return 0;
	}
}