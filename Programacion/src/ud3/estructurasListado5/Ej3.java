package ud3.estructurasListado5;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
//		 Realiza un programa que lea y acepte únicamente aquellos que sean mayores que
//		 el último dado. La introducción de números finaliza con la introducción de un 0. Al
//		 final se mostrará:

		int n;
		int m = 0;
		int suma = 0;
		int cont = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero inicial");
		n = sc.nextInt();
		while (n != 0) {
			if (m > n) {
				cont++;
				System.out.println("Fallo, es menor");
			}
			m = n;
			System.out.println("Introduce un numero mayor que el anterior");
			n = sc.nextInt();
			suma++;
		}
		sc.close();
		System.out.println("Total de numeros introducidos " + suma);
		System.out.println("Numeros fallados " + cont);
	}
}
