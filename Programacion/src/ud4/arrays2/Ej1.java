package ud4.arrays2;

import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
//		Crea un programa que pida diez números reales por teclado, los almacene en
//		un array, y luego muestre todos sus valores.
		int array1[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Introduce un numero");
			array1[i] = sc.nextInt();
		}
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		sc.close();
	}
}
