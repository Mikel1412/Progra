package ud3.estructurasListado5;

import java.util.Scanner;

public class Ej7_2 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int alturaPiramide = 0;
		System.out.println("Introduce la altura de la piramide");
		alturaPiramide = leer.nextInt();
//		for (int i = 0; i < alturaPiramide; i++) {
//			for (int j = 0; j < alturaPiramide-i-1; j++) {
//				System.out.print(" ");
//			}
//
//			for (int j = 0; j < i+1; j++) {
//				System.out.print("*");
//
//			}
//			if (i > 0) {
//				for (int j = 0; j < i; j++) {
//					System.out.print("*");
//				}
//			}
//			System.out.println();

		for (int j = 0; j < alturaPiramide; j++) {
			for(int i=0; i < alturaPiramide-j-1;i++) {
				System.out.print(" ");
			}
			if (j > 0) {
				for (int i = 0; i < j; i++) {
					System.out.print(j-1);
				}

			}
			for (int i = 0; i < j + 1; i++) {
				System.out.print(j);
			}
			System.out.println();
		}
		leer.close();
	}
}
