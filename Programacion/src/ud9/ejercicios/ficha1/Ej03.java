package ud9.ejercicios.ficha1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej03 {
//	 Implementa un programa que cree un vector tipo double de tamaño 5 y luego,
//	 utilizando un bucle, pida cinco valores por teclado y los introduzca en el vector.
//	 Tendrás que manejar la/las posibles excepciones y seguir pidiendo valores
//	 hasta rellenar completamente el vector

	public static void main(String[] args) {

		double vector[] = new double[5];
		Scanner leer= new Scanner(System.in);
		
		try {
		for(int i = 0; i<5;i++) {
			System.out.println("Introduce un valor ");
			vector[i]=leer.nextDouble();
		}
		}catch(InputMismatchException e) {
			System.out.println("Valor introducido incorrecto-");
		}
	}
}
