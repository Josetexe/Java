package paquetebliblioteca;

import java.util.ArrayList;

import paquetebliblioteca.AccesoDatos;
import paquetebliblioteca.EntradaSalida;
import paquetebliblioteca.Libro;

public class ClasePrincipal {
    public static void main(String[] args) {
        int opcion=EntradaSalida.pedirOpcion();
        AccesoDatos.inicializarBD();
        while(opcion!=EntradaSalida.SALIR)
        {
            switch(opcion)
            {
                case EntradaSalida.INSERTAR:
                    Libro l=EntradaSalida.pedirLibro();
                    AccesoDatos.insertarLibro(l);
                    break;
                case EntradaSalida.LISTAR:
                    ArrayList<Libro> lista_libros=AccesoDatos.recuperarLibro("");
                    EntradaSalida.mostrarLibros(lista_libros);
                    break;
                case EntradaSalida.BUSCAR:
                    String nombre_buscado=EntradaSalida.pedirNombre();
                    ArrayList<Libro> lista_libro_buscados=AccesoDatos.recuperarLibro(nombre_buscado);
                    EntradaSalida.mostrarLibros(lista_libro_buscados);
                    break;
             
            }
            opcion=EntradaSalida.pedirOpcion();
        }
    }
}
