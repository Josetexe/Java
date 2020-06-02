package paquete_tiendaonline;

import java.util.ArrayList;

public class ClasePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccesoBD.inicializarBD();
		
		
		ArrayList<Cliente> lista_clientes=new ArrayList<Cliente>();
		ArrayList<Producto> lista_productos_1=new ArrayList<Producto>();
		ArrayList<Producto> lista_productos_2=new ArrayList<Producto>();
		Cliente c1=new Cliente("Jose", "12345678L", lista_productos_1);
		Cliente c2=new Cliente("Luismi", "12345678Q", lista_productos_2);
		lista_clientes.add(c1);
		lista_clientes.add(c2);
		Producto p1=new Producto("Ordenador", 699.55);
		Producto p2=new Producto("Monitor", 199.90);
		Producto p3=new Producto("Impresora", 50.90);
		Producto p4=new Producto("Raton", 22.50);
		Producto p5=new Producto("Teclado", 30.50);
		Producto p6=new Producto("Auriculares", 52.00);
		lista_productos_1.add(p1);
		lista_productos_1.add(p2);
		lista_productos_1.add(p3);
		lista_productos_2.add(p4);
		lista_productos_2.add(p5);
		lista_productos_2.add(p6);
		
		for (Cliente cliente : lista_clientes) {
			AccesoBD.insertarDatos(cliente);
		}
        ArrayList<Cliente> lista_clientes_2=AccesoBD.recuperarDatos();
        EntradaSalida.mostrarDatos(lista_clientes_2);
		
	}

}
