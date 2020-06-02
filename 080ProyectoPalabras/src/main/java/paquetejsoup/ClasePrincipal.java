package paquetejsoup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class ClasePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta_fichero= "C:\\Jose\\fichero.html"; 
		String url="https://www.elpais.com/sociedad/2020-05-12/ultimas-noticias-del-coronavirus-en-espana-y-el-mundo-en-directo.html";
		String html_tabla="";
		try {
			Document documento=Jsoup.connect(url).get();
			Elements lista_palabras=documento.getElementsByTag("p");
			String texto_total="";
			for (Element element : lista_palabras) {
				String texto=element.text();
				texto_total+=texto+" ";
				String texto_limpio=tratarTexto(texto_total);
				HashMap<String, Integer> palabras=rellenarMapa(texto_limpio);
				html_tabla=PintaHTML.crearTabla (palabras);
		       
		       
			}
			
			GrabarFichero.grabarLinea(html_tabla,ruta_fichero);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	private static HashMap<String, Integer> rellenarMapa(String texto_limpio) {
        HashMap<String, Integer> mapa_palabras=new HashMap();
        String[] lista_palabras=texto_limpio.split(" ");
        for (String p:lista_palabras)
        {
            if(mapa_palabras.containsKey(p))
            {
                Integer n =mapa_palabras.get(p);
                n++;
                mapa_palabras.replace(p, n);
            }
            else
            {
                mapa_palabras.put(p, 1);
            }
        }
        return mapa_palabras;
	}
	private static String tratarTexto(String texto) {
        char[] caracteres_eliminables={'"', '.', ',', ';', '?', '¿', '!','¡', ':','>','<','|','-','0','1','2','3','4','5','6','7','8','9','”','©','(',')','€','“','%','–'};
        for(char x: caracteres_eliminables)
        {
            texto=texto.replace(String.valueOf(x),"");
        }
        return texto.toLowerCase();
    }

}
