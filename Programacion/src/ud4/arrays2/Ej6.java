package ud4.arrays2;

import java.util.Scanner;

public class Ej6 {
	public static void main(String[] args) {
//		Crea un programa que pida dos valores enteros N y M, luego cree un array de
//		tamaño N, escriba M en todas sus posiciones y lo muestre por pantalla.
		int M, N;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tamaño del array");
		N = sc.nextInt();
		System.out.println("Introduce el valor a introducir en el array");
		M = sc.nextInt();
		int array1[] = new int[N];
		for (int i = 0; i < array1.length; i++) {
			array1[i]=M;
			System.out.println(array1[i]);
		}
		sc.close();
	}
}
