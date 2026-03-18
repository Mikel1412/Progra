package ud6_7.ficha3.ejercicio1;

import java.util.Scanner;

public class mainLibro {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		String titulo, autor;
		int numeroEjemplares, numeroEjemplaresPrestados = 0;
		System.out.println("Introduce el titulo del libro");
		titulo = leer.nextLine();
		System.out.println("Introduce el autor del libro");
		autor = leer.nextLine();
		System.out.println("Introduce el numero de ejemplares del libro");
		numeroEjemplares = leer.nextInt();
		System.out.println("Introduce el numero de ejemplares prestados del libro");
		numeroEjemplaresPrestados = leer.nextInt();
		
		Libro libro1 = new Libro(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados);
		
		Libro libro2 = new Libro();
		
		libro1.prestamo();
		System.out.println(libro1.getNumeroEjemplaresPrestados());
		
		libro1.devolucion();
		System.out.println(libro1.getNumeroEjemplaresPrestados());
		
		System.out.println(libro1);
		System.out.println(libro2);
		
		leer.close();
	}

}
