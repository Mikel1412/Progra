package ud5.funciones.ejercicios.ficha1;

import java.util.Scanner;

public class Ejercicio2 {
	// escribe un metodo al que se le pasen dos enteros y muestre todos los numeros
	// comprendidos entre ellos
	public static int[] ejercicio1(int a, int b) {
		int resultado[] = new int[b - a+1];
		for (int i = 0; i < resultado.length; i++) {
			resultado[i] = a + i;
		}

		return resultado;
	}

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int a, b;

		System.out.println("Introduce dos numeros");
		a = leer.nextInt();
		b = leer.nextInt();

		for (int i = 0; i < b-a+1; i++) {
			System.out.println(ejercicio1(a, b)[i]);
		}
	}
}
