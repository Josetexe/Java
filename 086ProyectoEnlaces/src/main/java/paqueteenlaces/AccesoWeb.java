package paqueteenlaces;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class AccesoWeb {

	public static ArrayList<Enlace> extraerEnlaces(String url) {
		// TODO Auto-generated method stub
		ArrayList<Enlace> lista_enlaces=new ArrayList<Enlace>();
		try {
			Document documento = Jsoup.connect(url).get();
			Elements enlaces = documento.getElementsByTag("a");
			for (Element element : enlaces) {
				String enlaces_limpios= element.absUrl("href");
					Enlace e=new Enlace(enlaces_limpios);
					lista_enlaces.add(e);
				}
				
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista_enlaces;
	}

}
