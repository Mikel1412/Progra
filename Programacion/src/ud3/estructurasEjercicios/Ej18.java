package ud3.estructurasEjercicios;

import java.util.Scanner;

public class Ej18 {
	public static void main(String[] args) {
//		Crear un programa que solicite y vaya sumando los números introducidos por
//		teclado hasta que se introduzca el valor 0. Al finalizar debe mostrar el total de
//		números introducidos y la suma.
		int n = 0, cont = 0, total = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduce numeros (0 para salir)");
			n = sc.nextInt();
			cont++;
			total = total + n;
		} while (n != 0);
		System.out.println("Total de valores introducidos " + (cont - 1));
		System.out.println("Suma total: " + total);
		sc.close();
	}
}
