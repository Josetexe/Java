package paquetecovid;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EntradaSalida {

	final static int INSERTAR=1;
	final static int LISTAR=2;
	final static int SALIR=3;

	    static int pedirOpcion() {
	        
	        System.out.println(INSERTAR+"-Insertar datos de la persona.");
	        System.out.println(LISTAR+"-Listar datos.");
	        System.out.println(SALIR+"-Salir.");
	        Scanner sc=new Scanner(System.in);
	        int opcion=sc.nextInt();
	        return opcion;
	    }

		public static Infectado pedirDatos() {
			// TODO Auto-generated method stub
			List<Persona> personas=new ArrayList();
	    	Infectado infectado=new Infectado();
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Fecha de infeccion: ");
	        String f_contagio=sc.nextLine();
	        System.out.println("Fecha de positivo: ");
	        String f_positivo=sc.nextLine();
	        System.out.println("Inserte datos de tus contantos: ");
	        int n_contactos=sc.nextInt();
	        sc.nextLine();
	        for (int i = 0; i < n_contactos; i++) {
				System.out.println("Cual es su nombre");
		        String nombre=sc.nextLine();
		        System.out.println("Cual es su telefono:");
		        String telefono=sc.nextLine();
		        Persona persona=new Persona(nombre,telefono,infectado);
		        personas.add(persona);
			}
	        infectado.setF_contagio(f_contagio);
	        infectado.setF_positivo(f_positivo);
	        infectado.setPersonas(personas);
	        return infectado;
		}

		public static void mostrarDatos(ArrayList<Infectado> lista_inf) {
			// TODO Auto-generated method stub
			for (Infectado infectado : lista_inf) {
				System.out.println(infectado);
			}
		}

}
