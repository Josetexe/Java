package paquetemedia;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class AccesoWeb {
	
	public static ArrayList<Portatil> peticionWeb() {
		// TODO Auto-generated method stub
		String url="https://www.mediamarkt.es/es/category/_port%C3%A1tiles-701175.html";
	    String imagen="";
	    String precio="";
	    ArrayList<Portatil> lista_portatiles=new ArrayList<Portatil>();
		try {
	    	Document documento = Jsoup.connect(url).get();
	        Elements productos=documento.getElementsByClass("product-wrapper");
	        for (Element producto : productos) {
	        	Elements lista_p= producto.getElementsByClass("photo-wrapper");
	            for (Element element : lista_p) {
	                Elements lista_imagenes = element.getElementsByTag("img");
	                for (Element element2 : lista_imagenes) {
	                        imagen= element2.attr("data-original");
	                    }
	            }
	           
	               Elements lista_precios2=producto.getElementsByClass("price small");
	               for (Element element4 : lista_precios2) {
						precio=element4.text();
					}
	               Portatil e=new Portatil(imagen, precio);
	               lista_portatiles.add(e);
	        }
			
	           
	    }catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
		return lista_portatiles;
	}
}
