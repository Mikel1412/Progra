package ud3.estructurasListado5;

import java.util.Scanner;

public class Ej7 {
	public static void main(String[] args) {
//		Realiza un programa que pida un número y construya por pantalla su pirámide. 
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la altura de la piramide");
		n = sc.nextInt();
		sc.close();
		for (int i = 0; i <= n; i++) {
			for (int z = n; z >= i; z--) {
				System.out.print(" ");
			}
			if (i >= 2) {
				for (int k = 1; k < i; k++) {
					System.out.print("*");
				}
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}