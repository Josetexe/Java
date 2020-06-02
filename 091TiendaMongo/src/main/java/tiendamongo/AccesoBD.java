package tiendamongo;

import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class AccesoBD {

	static MongoClient m = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
	static MongoDatabase bd = m.getDatabase("local");
	static MongoCollection coleccion = bd.getCollection("tienda");

	public static void insertarDatos(ArrayList<Producto> lista_productos) {
		// TODO Auto-generated method stub
		for (Producto producto : lista_productos) {
			Document doc = new Document();
			doc.put("nombre", producto.getNombre());
			doc.put("descripcion", producto.getDescripcion());
			doc.put("precio", producto.getPrecio());
			coleccion.insertOne(doc);
		}
	}

}
