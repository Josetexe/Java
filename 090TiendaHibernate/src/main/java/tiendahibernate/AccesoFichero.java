package tiendahibernate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AccesoFichero {

	public static void leerDatos(ArrayList<Producto> lista_p) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("C:\\Jose\\tienda.csv");
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			while (linea != null) {
				String[] datos = linea.split(";");
				Producto p = new Producto(datos[0], datos[1], datos[2]);
				lista_p.add(p);
				linea = br.readLine();
			}
		} catch (IOException ex) {
			Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
		}

	}
}
