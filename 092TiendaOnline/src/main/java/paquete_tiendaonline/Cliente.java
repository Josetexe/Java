package paquete_tiendaonline;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.Fetch;

@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nombre;
	private String dni;
	@OneToMany( cascade = CascadeType.ALL, orphanRemoval = true)
	@Fetch(value=FetchMode.JOIN)
	private List<Producto> lista_productos=new ArrayList<Producto>();
	
	public Cliente(String nombre, String dni, List<Producto> lista_productos) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.lista_productos = lista_productos;
	}

	public Cliente() {
		
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public List<Producto> getLista_productos() {
		return lista_productos;
	}

	public void setLista_productos(List<Producto> lista_productos) {
		this.lista_productos = lista_productos;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", dni=" + dni + ", lista_productos=" + lista_productos
				+ "]";
	}
	
	
	
}
