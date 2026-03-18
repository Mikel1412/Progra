package ud5.funciones.ejercicios.ficha2;

import java.util.Scanner;

public class Ej03 {
//	Escribe un método invertirCadena que tome una cadena como entrada y
//	devuelva la cadena invertida.

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String cadenaRecibida;
		System.out.println("Introduce una cadena para invertirla");
		cadenaRecibida = leer.nextLine();
		System.out.println("La cadena " + cadenaRecibida + " invertida es: " + invertirCadena(cadenaRecibida));
	}

	public static String invertirCadena(String cadenaRecibida) {
		String cadenaInvertida = "";

		for (int i = (cadenaRecibida.length() - 1); i >= 0; i--) {
			cadenaInvertida += cadenaRecibida.charAt(i);
		}

		return cadenaInvertida;
	}
}
