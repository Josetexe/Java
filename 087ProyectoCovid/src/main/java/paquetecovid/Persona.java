package paquetecovid;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nombre;
	private String telefono;
	@ManyToOne
	private Infectado infectado;

	public Persona(String nombre, String telefono, Infectado infectado) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.infectado = infectado;
	}

	public Persona() {

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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Infectado getInfectado() {
		return infectado;
	}

	public void setInfectado(Infectado infectado) {
		this.infectado = infectado;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + "]";
	}

}