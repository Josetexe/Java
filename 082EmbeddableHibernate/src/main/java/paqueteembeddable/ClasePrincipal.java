package paqueteembeddable;

import java.util.List;
import java.util.logging.Level;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ClasePrincipal {
	public static void main(String[] args) {
		java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
		Direccion d=new Direccion("Oriente","1","Don Benito");
		Direccion d2=new Direccion("Av del Perú","13","Badajoz");
		Direccion d3=new Direccion("Pavillas Altas","12","Madrid");
		Contacto p=new Contacto("Jose","123456789",d);
		Contacto p2=new Contacto("Ana","213123121",d2);
		Contacto p3=new Contacto("Aurelio","931991133",d3);
		
		 StandardServiceRegistry s=new StandardServiceRegistryBuilder().configure().build();
		 SessionFactory sf=new MetadataSources(s).buildMetadata().buildSessionFactory();
		 Session sesion=sf.openSession();
		 org.hibernate.Transaction t=sesion.beginTransaction();
		 sesion.save(p);
		 sesion.save(p2);
		 sesion.save(p3);
		 t.commit();
		 Query q=sesion.createQuery("From Contacto");
		 List<Contacto> contactos=q.getResultList();
		 for (Contacto contacto : contactos) {
			 System.out.println(contacto);
		 }
	}
}
