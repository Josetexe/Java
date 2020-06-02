package paqueterae;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ClasePrincipal {

	public static void main(String[] args) {
		HashMap<String, String> mapa_palabras = new HashMap<String, String>();
		String url_pais = "https://www.elpais.com/sociedad/2020-05-12/ultimas-noticias-del-coronavirus-en-espana-y-el-mundo-en-directo.html";
		try {
			Document documento = Jsoup.connect(url_pais).get();
			Elements lista_palabras = documento.getElementsByTag("p");
			String texto_total = "";
			for (Element element : lista_palabras) {
				String texto = element.text();
				texto_total += texto + " ";
				String texto_limpio = tratarTexto(texto_total);
				ArrayList<String> palabras = rellenarArray(texto_limpio);
				for (String x : palabras) {
					String url_rae = "https://dle.rae.es/" + x;
					Document documento2 = Jsoup.connect(url_rae).get();
					Elements lista_definicion = documento2.getElementsByClass("j");
					ArrayList<String> palabras2 = new ArrayList<String>();
					for (Element element3 : lista_definicion) {
						String texto2 = element3.text();
						palabras2.add(texto2);
					}
					if (palabras2.size() > 0) {
						mapa_palabras.put(x, palabras2.get(0));
					} else {
						String definicion2 = "No tiene definicion";
						mapa_palabras.put(x, definicion2);
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Iterator it = mapa_palabras.keySet().iterator();
		while (it.hasNext()) {
			String palabra = (String) it.next();
			String definicion = mapa_palabras.get(palabra);
			System.out.println(palabra + "----" + definicion);
		}
	}

	private static ArrayList<String> rellenarArray(String texto_limpio) {
		String[] lista_palabras = texto_limpio.split(" ");
		ArrayList<String> lista = new ArrayList<String>();
		for (String string : lista_palabras) {
			lista.add(string);
		}
		return lista;
	}

	private static String tratarTexto(String texto) {
		char[] caracteres_eliminables = { '"', '.', ',', ';', '?', '¿', '!', '¡', ':', '>', '<', '|', '-', '0', '1',
				'2', '3', '4', '5', '6', '7', '8', '9', '”', '©', '(', ')', '€', '“', '%' };
		for (char x : caracteres_eliminables) {
			texto = texto.replace(String.valueOf(x), "");
		}
		return texto.toLowerCase();
	}

}
