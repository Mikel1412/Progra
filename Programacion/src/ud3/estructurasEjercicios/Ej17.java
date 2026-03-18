package ud3.estructurasEjercicios;

import java.util.Scanner;

public class Ej17 {
	public static void main(String[] args) {
//		Introducir un número entero por teclado. El programa debe calcular y mostrar por
//		pantalla todos los números pares entre el 1 y el número introducido por teclado.
//		Debe comprobar que el número introducido es mayor que 1, en caso contrario debe
//		solicitar el nº indefinidamente.

		int n;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		n = sc.nextInt();

		while (n <= 1) {
			System.out.println("El numero debe de ser mayor de '1'");
			n = sc.nextInt();
		}
		System.out.println("Los numeros pares entre 1 y " + n + " son:");
		for (int i = 1; i <= n; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
