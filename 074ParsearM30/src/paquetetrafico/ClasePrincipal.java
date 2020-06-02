package paquetetrafico;

import java.util.ArrayList;

public class ClasePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Camara> lista_camaras=AccesoFichero.parsearCamaras();
		String html_tabla=CreaHTML.crearTablaCamaras(lista_camaras);
		AccesoFichero.grabarTabla(html_tabla);
	}

}
