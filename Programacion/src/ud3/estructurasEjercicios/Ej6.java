package ud3.estructurasEjercicios;

import java.util.Scanner;

public class Ej6 {
	public static void main(String[] args) {
//		Crea un programa que determine el menor valor de 5 números introducidos por
//		teclado. Considera que el menor valor puede repetirse.
//		Por ejemplo: Si los números introducidos fueran. 14, 19, 14, 16 y 15. El menor valor
//		introducido es 14.
		int V;
		int menor;
		Scanner sc =new Scanner(System.in);
		System.out.println("Escribe un Numero para determinar cual es el menor");
		V=sc.nextInt();
		menor=V;
		for (int i=0;i<=4;i++) {
			System.out.println("Escribe un Numero para determinar cual es el menor");
			V=sc.nextInt();
			if (V<menor) {
				menor=V;
			}
		}
		sc.close();
		System.out.println("El numero menor es "+menor);
	}
}
