package paqueteenlaces;

import java.util.ArrayList;

public class ClasePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="https://www.elmundo.es/";
		AccesoDatos.inicializarBD();
		ArrayList<Enlace> lista_enlaces=AccesoWeb.extraerEnlaces(url);
		AccesoDatos.guardarDatos(lista_enlaces);
		EntradaSalida.mostrarDatos(lista_enlaces);
	}

}
