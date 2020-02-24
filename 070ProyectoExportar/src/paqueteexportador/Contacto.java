package paqueteexportador;

public class Contacto implements Constantes{
	private String nombre;
	private String email;
	private String telefono;
	
	public Contacto(String nombre, String email, String telefono) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefono() {
		return telefono;
	}
	
	public String pasarCSV() {
		String aux=nombre+separador+email+separador+telefono+"/n";
		return aux;
	}
}
