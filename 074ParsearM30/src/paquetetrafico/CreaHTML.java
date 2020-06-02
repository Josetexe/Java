package paquetetrafico;

import java.util.ArrayList;

public class CreaHTML {

	public static String crearTablaCamaras(ArrayList<Camara> lista_camaras) {
		// TODO Auto-generated method stub
		String tabla="<table><tr><th>Latitud</th><th>Longitud</th><th>Foto</th></tr>";
		for (Camara camara : lista_camaras) {
			tabla+=camara.crearFilaTabla();
		}
		tabla+="</table>";
		return tabla;
	}

}
