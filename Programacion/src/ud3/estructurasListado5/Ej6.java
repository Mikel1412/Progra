package ud3.estructurasListado5;

import java.util.Scanner;

public class Ej6 {
	public static void main(String[] args) {
//		Realiza un programa que pida dos números enteros A y B, siendo B mayor que A.
//		Luego visualiza los números desde A hasta B e indicar cuantos hay que sean pares. 

		int n = 0, m = 0, cont = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero");
		n = sc.nextInt();
		System.out.println("Introduce un numero mayor que el anterior");
		m = sc.nextInt();
		while (m < n) {
			System.out.println("Incorrecto");
			System.out.println("Dime un numero");
			n = sc.nextInt();
			System.out.println("Introduce un numero mayor que el anterior");
			m = sc.nextInt();
		}
		sc.close();
		for (int i = n; i <= m; i++) {
			System.out.print(i+" ");
			cont += 1;
		}
		System.out.println("");
		
		System.out.println("La cantidad de pares son: " + cont);
	}
}
