package paquetecovid;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Infectado {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String f_positivo, f_contagio;
	@OneToMany(mappedBy = "infectado", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Persona> personas = new ArrayList();

	public Infectado(String f_positivo, String f_contagio, List<Persona> personas) {
		super();
		this.f_positivo = f_positivo;
		this.f_contagio = f_contagio;
		this.personas = personas;
	}

	public Infectado() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getF_positivo() {
		return f_positivo;
	}

	public void setF_positivo(String f_positivo) {
		this.f_positivo = f_positivo;
	}

	public String getF_contagio() {
		return f_contagio;
	}

	public void setF_contagio(String f_contagio) {
		this.f_contagio = f_contagio;
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	@Override
	public String toString() {
		return "Infectado [id=" + id + ", fecha de positivo=" + f_positivo + ", fecha de contagio=" + f_contagio
				+ ", personas=" + personas + "]";
	}

}