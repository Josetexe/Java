package paquetecovid;

import java.util.ArrayList;

public class ClasePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccesoBD.inicializarBD();
		int opcion=EntradaSalida.pedirOpcion();
		while(opcion!=EntradaSalida.SALIR)
        {
            switch(opcion)
            {
                case EntradaSalida.INSERTAR:
                    Infectado c=EntradaSalida.pedirDatos();
                    AccesoBD.insertarDatos(c);
                    break;
                case EntradaSalida.LISTAR:
                    ArrayList<Infectado> lista_inf=AccesoBD.recuperarDatos();
                    EntradaSalida.mostrarDatos(lista_inf);
                    break;
               
            }
            opcion=EntradaSalida.pedirOpcion();
        }
	}

}
