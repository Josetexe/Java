package paquetemto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ordenador {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String procesador,grafica;
	
	public Ordenador(String procesador, String grafica) {
		super();
		this.procesador = procesador;
		this.grafica = grafica;
	}

	public Ordenador() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getGrafica() {
		return grafica;
	}

	public void setGrafica(String grafica) {
		this.grafica = grafica;
	}

	@Override
	public String toString() {
		return "Ordenador [id=" + id + ", procesador=" + procesador + ", grafica=" + grafica + "]";
	}
	
}
