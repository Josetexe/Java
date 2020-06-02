package paquetemto;

import java.util.ArrayList;

public class ClasePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccesoDatos.inicializarBD();
		int opcion=EntradaSalida.pedirOpcion();
		while(opcion!=EntradaSalida.SALIR)
        {
            switch(opcion)
            {
                case EntradaSalida.INSERTAR:
                    Persona p=EntradaSalida.pedirPersona();
                    AccesoDatos.insertarPersona(p);
                    break;
                case EntradaSalida.LISTAR:
                    ArrayList<Persona> lista_personas=AccesoDatos.recuperarPersonas();
                    EntradaSalida.mostrarPersonas(lista_personas);
                    break;
               
            }
            opcion=EntradaSalida.pedirOpcion();
        }
	}

}
