package paquetemto;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class AccesoDatos {
	static StandardServiceRegistry s=null;
	static SessionFactory sf=null;
	public static void inicializarBD() {
		// TODO Auto-generated method stub
		s=new StandardServiceRegistryBuilder().configure().build();
		sf=new MetadataSources(s).buildMetadata().buildSessionFactory();
	}
	public static void insertarPersona(Persona p) {
		// TODO Auto-generated method stub
		Session sesion=sf.openSession();
		Transaction t=sesion.beginTransaction();
		sesion.save(p);
		t.commit();
	}
	public static ArrayList<Persona> recuperarPersonas() {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		Query q=s.createQuery("FROM Cliente");
		List lista_personas= q.getResultList();
		
	    return (ArrayList)lista_personas;
	}

}
