package paquetemedia;

import java.util.ArrayList;

public class CreaHTML {

	public static String crearTabla(ArrayList<Portatil> lista_portatiles) {
		String tabla="<table><tr><th>Imagen</th><th>Precio</th></tr>";
		for (Portatil portatil : lista_portatiles) {
			tabla+=portatil.crearFilaTabla();
		}
		tabla+="</table>";
		return tabla;
	}

}
