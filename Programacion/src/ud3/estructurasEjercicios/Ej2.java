package ud3.estructurasEjercicios;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		/*
		 * Realiza un algoritmo que calcule la potencia de un número, para ello pide por
		 * teclado la base y el exponente. Debes tener en cuenta que pueden ocurrir tres
		 * cosas: • El exponente es positivo, sólo tienes que imprimir la potencia. • El
		 * exponente es 0, entonces el resultado es 1. • El exponente es negativo, el
		 * resultado es 1/potencia con el exponente positivo
		 */
		int numero;
		int potencia;
		int resultado = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		numero = sc.nextInt();
		System.out.println("A que numero quieres elevar el anterior?");
		potencia = sc.nextInt();

		if (potencia > 0) {
			resultado = numero ^ potencia;
		}
		if (potencia == 0) {
			resultado = 1;
		}
		if (potencia < 0) {
			resultado = 1 / (numero ^ potencia);
		}
		sc.close();
		System.out.println(resultado);
	}
}
