package paquetemongo;

import java.util.ArrayList;
import java.util.Scanner;

public class EntradaSalida {
	
	final static int INSERTAR=1;
	final static int LISTAR=2;
	final static int BUSCAR=3;
	final static int SALIR=4;
	
	public static int pedirOpcion() {
		System.out.println(INSERTAR+"-Insertar alumno");
        System.out.println(LISTAR+"-Listar alumnos");
        System.out.println(BUSCAR+"-Buscar alumno por nombre");
        System.out.println(SALIR+"-Salir");
        Scanner sc=new Scanner(System.in);
        int opcion=sc.nextInt();
        return opcion;
	}

	public static Alumno pedirAlumno() {
		Scanner sc=new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre=sc.nextLine();
        System.out.println("Asignatura: ");
        String asignatura=sc.nextLine();
        System.out.println("nota:");
        int nota=sc.nextInt();
        Alumno a=new Alumno(nombre,asignatura,nota);
        return a;
	}

	public static void mostrarAlumnos(ArrayList<Alumno> lista_alumnos) {
		// TODO Auto-generated method stub
		for (Alumno alumno : lista_alumnos) {
            System.out.println(alumno);
        }
	}
	public static String pedirNombre() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nombre buscado: ");
        String nombre=sc.nextLine();
        return nombre;
    }

}
