package paquetetienda;

import java.util.ArrayList;

public class PintaHTML {

	public static String crearTabla(ArrayList<Producto> lista_p) {
		String html="<html><head></head><body><table border='1px' border-style='solid'><th>Nombre</th><th>Descripción</th><th>Precio</th></tr>";
        for (Producto p : lista_p)
        {

            html=html+"<tr><td>"+p.getNombre()+"</td><td>"+p.getDescripcion()+"</td><td>"+p.getPrecio()+"</td></tr>";
           
        }
        html=html+"</table></body></html>";
        return html;
	}

}
