package paquetemedia;

public class Portatil {
	String imagen;
	String precio;
	
	public Portatil(String imagen, String precio) {
		super();
		this.imagen = imagen;
		this.precio = precio;
	}
	
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Portatil [imagen=" + imagen + ", precio=" + precio + "]\n";
	}
	
	public String crearFilaTabla()
	{
		String fila="<tr><td><img src='http://"+imagen+"'></td><td>"+precio+"</td></tr>";
		return fila;
	}
}
