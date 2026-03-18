package ud4.arrays2;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
//		Crea un programa que pida diez números reales por teclado, los almacene en
//		un array, y luego muestre la suma de todos los valores.
		int array1[] = new int[10];
		Scanner sc = new Scanner(System.in);
		int suma = 0;
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Introduce un numero");
			array1[i] = sc.nextInt();
		}
		for (int i = 0; i < array1.length; i++) {
			suma += array1[i];
		}
		System.out.println("La suma total es de " + suma);
		sc.close();
	}
}
