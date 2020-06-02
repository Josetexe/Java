package paqueteenlaces;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class AccesoDatos {

	static StandardServiceRegistry s = null;
	static SessionFactory sf = null;

	public static void inicializarBD() {
		// TODO Auto-generated method stub
		s = new StandardServiceRegistryBuilder().configure().build();
		sf = new MetadataSources(s).buildMetadata().buildSessionFactory();
	}

	public static void guardarDatos(ArrayList<Enlace> lista_enlaces) {
		// TODO Auto-generated method stub
		Session sesion = sf.openSession();
		Transaction t = sesion.beginTransaction();
		for (Enlace enlace : lista_enlaces) {
			sesion.save(enlace);
		}
		t.commit();

	}

}
