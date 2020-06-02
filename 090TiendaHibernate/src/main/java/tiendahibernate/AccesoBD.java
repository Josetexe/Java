package tiendahibernate;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class AccesoBD {
	static StandardServiceRegistry s = null;
	static SessionFactory sf = null;

	public static void inicializarBD() {
		// TODO Auto-generated method stub
		s = new StandardServiceRegistryBuilder().configure().build();
		sf = new MetadataSources(s).buildMetadata().buildSessionFactory();
	}

	public static void insertarBD(ArrayList<Producto> lista_p) {
		// TODO Auto-generated method stub
		Session sesion = sf.openSession();
		Transaction t = sesion.beginTransaction();
		for (Producto producto : lista_p) {
			sesion.save(producto);
		}
		t.commit();
	}

}
