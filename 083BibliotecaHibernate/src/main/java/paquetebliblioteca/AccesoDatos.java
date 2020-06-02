package paquetebliblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class AccesoDatos {
	static StandardServiceRegistry s=null;
	static SessionFactory sf=null;
	public static void inicializarBD(){
		s=new StandardServiceRegistryBuilder().configure().build();
		sf=new MetadataSources(s).buildMetadata().buildSessionFactory();  
	}
    public static void insertarLibro(Libro l) {
    	 Session sesion=sf.openSession();
    	 Transaction t=sesion.beginTransaction();
    	 sesion.save(l);
    	 t.commit();
    }
    public static ArrayList<Libro> recuperarLibro(String nombre_buscado) {
       
    	Session s=sf.openSession();
    	Query q=s.createQuery("FROM Libro");
    	List lista_libros= q.getResultList();
    	
        return (ArrayList)lista_libros;
    }
    public static String pedirNombre() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nombre buscado: ");
        String nombre=sc.nextLine();
        return nombre;
    }
}
