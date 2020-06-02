package paquete_tiendaonline;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

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

	public static void insertarDatos(Cliente c) {
		// TODO Auto-generated method stub
		Session sesion = sf.openSession();
		Transaction t = sesion.beginTransaction();
		sesion.save(c);
		t.commit();
	}

	public static ArrayList<Cliente> recuperarDatos() {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		Query q=s.createQuery("FROM Cliente");
		List lista_clientes= q.getResultList();
	    return (ArrayList)lista_clientes;
	}

}
