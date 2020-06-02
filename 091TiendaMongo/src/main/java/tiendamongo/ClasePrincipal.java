package tiendamongo;

import java.util.ArrayList;

public class ClasePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Producto> lista_productos=new ArrayList<Producto>();
		AccesoFichero.leerDatos(lista_productos);
		AccesoBD.insertarDatos(lista_productos);
	}

}
