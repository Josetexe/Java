package paqueteembeddable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contacto {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String nombre,telefono;
	

	
	private Direccion direccion;

	
	public Contacto() {
	
	}
	
	
	public Contacto(String nombre,String telefono, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String gettelefono() {
		return telefono;
	}

	public void setEdad(int edad) {
		this.telefono = telefono;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}


	@Override
	public String toString() {
		return "Persona [La id es=" + id + ", nombre es=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + "]";
	}
	
	
}