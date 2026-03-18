package ud5.funciones.ejercicios.ficha2;

import java.util.Scanner;

public class Ej05 {
//	Escribe un método esPerfecto que determine si un número es perfecto (es
//			decir, la suma de sus divisores propios es igual al número).
	public static boolean esPerfecto(int numeroIntroducido) {
		int sumaDivisores = 0;
		boolean nPerfecto = false;

		for (int i = 1; i < numeroIntroducido; i++) {
			if (numeroIntroducido % i == 0) {
				sumaDivisores += i;
			}
		}
		if (sumaDivisores == numeroIntroducido) {
			nPerfecto = true;
		}
		return nPerfecto;
	}

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		int numeroIntroducido;

		System.out.println("Introduce un numero para saber si es perfecto");
		numeroIntroducido = leer.nextInt();

		if (esPerfecto(numeroIntroducido)) {
			System.out.println("El numero introducido es perfecto");
		} else {
			System.out.println("El numero no es perfecto");
		}

	}
}
