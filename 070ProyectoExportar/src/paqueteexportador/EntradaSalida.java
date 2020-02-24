package paqueteexportador;

import java.util.Scanner;

public class EntradaSalida {
	public static final int CSV2MYSQL=1;
	public static final int MYSQL2CSV=2;
	public static final int SALIR=3;
	public static int mostrarMenu() {
		System.out.println(CSV2MYSQL+" Pasar de CSV a MYSQL");
		System.out.println(MYSQL2CSV+" Pasar de MYSQL a CSV");
		System.out.println(SALIR+" Salir");
		int opcion=(new Scanner(System.in)).nextInt();
		return opcion;
	}
}
