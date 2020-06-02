package paquetejsoup;

import java.util.HashMap;
import java.util.Iterator;

public class PintaHTML {
	public static String crearTabla(HashMap<String, Integer> palabras) {
		String html="<html><head></head><body><table border=1><tr><th>Palabras</th><th>Numero de Veces</th></tr>";
		Iterator it=palabras.keySet().iterator();
	    while(it.hasNext())
	    {
	        String palabra=(String)it.next();
	        int n_veces=palabras.get(palabra);
            html=html+"<tr><td>"+palabra+"</td><td>"+n_veces+"</td></tr>";
        }
        html=html+"</table></body></html>";
        return html;
    }
}