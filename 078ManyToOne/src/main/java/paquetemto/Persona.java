package paquetemto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Persona {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nombre, empresa, telefono;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Ordenador> ordenadores=new ArrayList();
	public Persona(String nombre, String empresa, String telefono, List<Ordenador> ordenadores) {
		super();
		this.nombre = nombre;
		this.empresa = empresa;
		this.telefono = telefono;
		this.ordenadores = ordenadores;
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
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public List<Ordenador> getOrdenadores() {
		return ordenadores;
	}
	public void setOrdenadores(List<Ordenador> ordenadores) {
		this.ordenadores = ordenadores;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", empresa=" + empresa + ", telefono=" + telefono
				+ ", ordenadores=" + ordenadores + "]";
	}
	
}
