package ud3.estructurasEjercicios;

import java.util.Scanner;

public class Ej19 {
	public static void main(String[] args) {
//		Crea un programa que solicite la altura de una escalera N por teclado y muestre
//		una escalera de asteriscos de este tipo
		int n = 0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Introduce la altura de la escalera");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		sc.close();
	}
}
