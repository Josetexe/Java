package paquetetienda;

public class Producto {
	String nombre;
	String descripcion;
	String precio;
	public Producto() {
		
	}

	public Producto(String nombre, String descripcion, String precio) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}




	@Override
	public String toString() {
		return "Producto : Nombre=" + nombre +", Descripcion=" + descripcion + ", Precio=" + precio + "]";
	}
}
