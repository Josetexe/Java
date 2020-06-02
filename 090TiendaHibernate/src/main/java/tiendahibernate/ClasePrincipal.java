package tiendahibernate;

import java.util.ArrayList;

public class ClasePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Producto> lista_p = new ArrayList<Producto>();
		AccesoBD.inicializarBD();
		AccesoFichero.leerDatos(lista_p);
		AccesoBD.insertarBD(lista_p);
	}

}
