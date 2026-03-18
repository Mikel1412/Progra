package ud3.estructurasEjercicios;

import java.util.Scanner;

public class Ej20 {
	public static void main(String[] args) {
//			Crea un programa que pinte una escalera de números, siendo cada línea un
//		número:
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la altura de la escalera");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((i + 1));
			}
			System.out.println((i + 1));
		}
		sc.close();
	}
}
