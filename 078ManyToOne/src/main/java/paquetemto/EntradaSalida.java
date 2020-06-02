package paquetemto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EntradaSalida {
	final static int INSERTAR=1;
	final static int LISTAR=2;
	final static int SALIR=3;
	
	public static int pedirOpcion() {
		
		System.out.println(INSERTAR+"-Insertar");
        System.out.println(LISTAR+"-Listar");
        System.out.println(SALIR+"-Salir");
        Scanner sc=new Scanner(System.in);
        int opcion=sc.nextInt();
        return opcion;
	}

	public static Persona pedirPersona() {
		List<Ordenador> ordenadores=new ArrayList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Iserte nombre: ");
        String nombre=sc.nextLine();
        System.out.println("Nº de ordenadores: ");
        int n_ordenadores=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n_ordenadores; i++) {
			System.out.println("Procesador: ");
	        String procesador=sc.nextLine();
	        System.out.println("Tarjeta grafica: ");
	        String grafica=sc.nextLine();
	        Ordenador ordenador=new Ordenador(procesador, grafica);
	        ordenadores.add(ordenador);
		}
        System.out.println("Empresa: ");
        String empresa=sc.nextLine();
        System.out.println("Telefono: ");
        String telefono=sc.nextLine();
        Persona persona=new Persona(nombre, empresa, telefono, ordenadores);
        return persona;
	}

	public static void mostrarPersonas(ArrayList<Persona> lista_personas) {
		// TODO Auto-generated method stub
		for (Persona persona: lista_personas) {
            System.out.println(persona);
        }
	}

}
