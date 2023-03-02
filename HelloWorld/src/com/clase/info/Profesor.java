package com.clase.info;

public class Profesor extends Persona {
	protected int numeroDeEdadesEstudiantes;
	protected int sumaDeEdadesEstudiantes;
	protected int estudiantesEdadMedia;
	
	public void agregarEdadEstudiante() {}
	public void mostrarInfo() {}
//getter and setter
	public int getNumeroDeEdadesEstudiantes() {
		return numeroDeEdadesEstudiantes;
	}
	public void setNumeroDeEdadesEstudiantes(int numeroDeEdadesEstudiantes) {
		this.numeroDeEdadesEstudiantes = numeroDeEdadesEstudiantes;
	}
	public int getSumaDeEdadesEstudiantes() {
		return sumaDeEdadesEstudiantes;
	}
	public void setSumaDeEdadesEstudiantes(int sumaDeEdadesEstudiantes) {
		this.sumaDeEdadesEstudiantes = sumaDeEdadesEstudiantes;
	}
	public int getEstudiantesEdadMedia() {
		return estudiantesEdadMedia;
	}
	public void setEstudiantesEdadMedia(int estudiantesEdadMedia) {
		this.estudiantesEdadMedia = estudiantesEdadMedia;
	}
//constructor
	protected Profesor(int id, int edad, int telefono, int numeroDeEdadesEstudiantes, int sumaDeEdadesEstudiantes,
			int estudiantesEdadMedia) {
		super(id, edad, telefono);
		this.numeroDeEdadesEstudiantes = numeroDeEdadesEstudiantes;
		this.sumaDeEdadesEstudiantes = sumaDeEdadesEstudiantes;
		this.estudiantesEdadMedia = estudiantesEdadMedia;
	}
	@Override
	public int mostrarID() {
		// TODO Auto-generated method stub
		return 0;
	}	
}
