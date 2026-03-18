package ud4.arrays2;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
//		Crea un programa que pida diez números reales por teclado, los almacene en
//		un array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por
//		pantalla.
		int array1[] = new int[10];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Introduce un valor");
			array1[i] = sc.nextInt();
		}
		sc.close();
		int maximo = array1[0];
		int minimo = array1[0];
		for (int i = 0; i < array1.length; i++) {
			if (maximo < array1[i]) {
				maximo = array1[i];
			}
			if (minimo > array1[i]) {
				minimo = array1[i];
			}
		}
		System.out.println("El valor minimo es " + minimo + " y el valor maximo es " + maximo);
	}
}
