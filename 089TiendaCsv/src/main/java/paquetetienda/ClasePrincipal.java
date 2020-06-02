package paquetetienda;

import java.util.ArrayList;

public class ClasePrincipal {
	public static void main(String[] args) {
		String ruta = "C:\\Jose\\tienda.html";
		ArrayList<Producto> lista_p = new ArrayList();
		AccesoFichero.leerDatos(lista_p);
		String html_tabla = PintaHTML.crearTabla(lista_p);
		AccesoFichero.grabarDatos(html_tabla, ruta);
	}
}
