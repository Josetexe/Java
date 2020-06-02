package paquetebliblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class EntradaSalida {
	final static int INSERTAR=1;
	final static int LISTAR=2;
	final static int BUSCAR=3;
	final static int SALIR=4;
	static int pedirOpcion() {	        
		System.out.println(INSERTAR+"-Insertar libro");
		System.out.println(LISTAR+"-Listar Libros");
		System.out.println(BUSCAR+"-Buscar contacto por nombre");
		System.out.println(SALIR+"-Salir");
		Scanner sc=new Scanner(System.in);
		int opcion=sc.nextInt();
		return opcion;
	}

	static Libro pedirLibro() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nombre: ");
		String nombre=sc.nextLine();
		System.out.println("Titulo:");
		String telefono=sc.nextLine();
		System.out.println("Autor:");
		String autor=sc.nextLine();
		Libro c=new Libro(nombre, telefono,autor);       
		return c;        
	}
	static void mostrarLibros(ArrayList<Libro> lista_libros) {
		for (Libro libro : lista_libros) {
			System.out.println(libro);
		}
	}
	static String pedirNombre() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Nombre buscado: ");
		 String nombre=sc.nextLine();
		 return nombre;
	 }
}

