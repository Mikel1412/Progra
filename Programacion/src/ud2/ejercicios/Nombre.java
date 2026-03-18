package ud2.ejercicios;

import java.util.Scanner;

public class Nombre {
	public static void main(String[] args) {
		String nombre;
		int edad;
		Scanner leer =new Scanner(System.in);
		System.out.println("Escribe tu nombre");
		nombre=leer.nextLine();
		System.out.println("Introduce tu edad");
		edad=leer.nextInt();
		System.out.println("Hola "+nombre+" felices "+edad);
		leer.close();
		}
}
