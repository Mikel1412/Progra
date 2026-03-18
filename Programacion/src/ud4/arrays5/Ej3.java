package ud4.arrays5;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
//		Crea un programa que pida 10 números enteros y los almacene en un array.
//		De los valores pasados ninguno puede ser 0, si se recibe un 0 se pedirá de
//		nuevo el valor hasta que sea válido.
//		Una vez relleno, pedirá un valor por teclado y lo buscará en el array, si no
//		está mostrará un mensaje “Valor no encontrado”; si, por el contrario, se
//		encuentra almacenado en el array, lo sustituirá por un 0 en esa posición.

		Scanner leer = new Scanner(System.in);
		int array1[] = new int[10];
		int valorPreguntar;
		for (int i = 0; i < array1.length; i++) {
			do {
				array1[i] = leer.nextInt();
				if (array1[i] == 0) {
					System.out.println("Valor incorrecto");
				}
			} while (array1[i] == 0);
		}

		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}

		System.out.println("Introduce un valor para buscar en el array");
		valorPreguntar = leer.nextInt();

		for (int i = 0; i < array1.length; i++) {
			if (valorPreguntar == array1[i]) {
				array1[i] = 0;
			} else {
				System.out.println("Valor no encontrado");
			}
		}
		
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		leer.close();
	}
}
