package paquetemedia;

import java.io.FileWriter;
import java.io.IOException;

public class AccesoFichero {

	public static void grabarTablaHTML(String html_tabla) {
		// TODO Auto-generated method stub
		String ruta="C:\\Jose\\fichero_media.html";
		String cabecera="<html><head></head><body>";
		String pie="</body></html>";
		try {
			FileWriter escritor=new FileWriter(ruta);
			escritor.write(cabecera+html_tabla+pie);
			escritor.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
