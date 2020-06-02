package paqueteenlaces;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Enlace {

	private String enlace;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	public Enlace(String enlace) {
		super();
		this.enlace = enlace;
	}

	public Enlace() {

	}

	public String getEnlace() {
		return enlace;
	}

	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Enlace " + id + " : " + enlace;
	}
}
