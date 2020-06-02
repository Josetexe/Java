package paquetemongo;

import com.mongodb.BasicDBObject;

public class Alumno {
	private String nombre;
	private String asignatura;
	private int nota;
	
	public Alumno(String nombre, String asignatura, int nota) {
		super();
		this.nombre = nombre;
		this.asignatura = asignatura;
		this.nota = nota;
	}

	public Alumno(BasicDBObject next) {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", asignatura=" + asignatura + ", nota=" + nota + "]";
	}
	
}
