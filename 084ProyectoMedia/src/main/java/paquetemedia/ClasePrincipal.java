package paquetemedia;

import java.util.ArrayList;

public class ClasePrincipal {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		ArrayList<Portatil> lista_portatiles=AccesoWeb.peticionWeb();
		String html_tabla=CreaHTML.crearTabla(lista_portatiles);
		AccesoFichero.grabarTablaHTML(html_tabla);
	}
	
}