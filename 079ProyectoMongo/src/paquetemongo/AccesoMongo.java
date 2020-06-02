package paquetemongo;

import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;


public class AccesoMongo {
	
	static MongoClient m=new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
	static MongoDatabase bd=m.getDatabase("local");
	static MongoCollection coleccion=bd.getCollection("curso");
	
	public static void insertarAlumno(Alumno a) {
		// TODO Auto-generated method stub
		Document doc=new Document();
		doc.put("nombre", a.getNombre());
		doc.put("asignatura", a.getAsignatura());
		doc.put("nota", a.getNota());
		coleccion.insertOne(doc);
	}

	public static ArrayList recuperarAlumnos() {
		// TODO Auto-generated method stub
		ArrayList<Alumno> alumnos=new ArrayList();
		FindIterable curso=coleccion.find();
		MongoCursor c=curso.iterator();
		
		while(c.hasNext())
		{
			Document d=(Document)c.next();
			String nombre=d.getString("nombre");
			String asignatura=d.getString("asignatura");
			int nota=d.getInteger("nota");
			Alumno alumno=new Alumno(nombre, asignatura, nota);
			alumnos.add(alumno);
		}
		
		return alumnos;
	}

	public static ArrayList<Alumno> buscarAlumno(String nombre) {
		// TODO Auto-generated method stub
		ArrayList<Alumno> lista_alumnos = new ArrayList();
	    BasicDBObject query = new BasicDBObject();
	    FindIterable cursor = coleccion.find(Filters.eq("nombre", nombre));
	    MongoCursor c=cursor.iterator();
	    while(c.hasNext())
	    {
	        Document d=(Document)c.next();
	        String asignatura=d.getString("asignatura");
	        int nota=d.getInteger("nota");
	        Alumno alumno=new Alumno(nombre,asignatura,nota);
	        lista_alumnos.add(alumno);
	    }

	    return lista_alumnos;
	}

}
