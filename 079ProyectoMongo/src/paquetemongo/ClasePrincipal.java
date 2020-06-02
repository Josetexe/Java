package paquetemongo;

import java.util.ArrayList;

public class ClasePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion=EntradaSalida.pedirOpcion();

		while(opcion!=EntradaSalida.SALIR)
		{
			switch(opcion)
			{
			case EntradaSalida.INSERTAR:
				Alumno a=EntradaSalida.pedirAlumno();
				AccesoMongo.insertarAlumno(a);
				break;
			case EntradaSalida.LISTAR:
				ArrayList alumnos=AccesoMongo.recuperarAlumnos();
				EntradaSalida.mostrarAlumnos(alumnos);
				break;
			case EntradaSalida.BUSCAR:
				String nombre=EntradaSalida.pedirNombre();
				ArrayList<Alumno> lista_alumnos=AccesoMongo.buscarAlumno(nombre);
				EntradaSalida.mostrarAlumnos(lista_alumnos);
				break;
			}
			opcion=EntradaSalida.pedirOpcion();
		}
	}

}
