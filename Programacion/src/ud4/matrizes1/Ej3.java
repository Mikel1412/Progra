package ud4.matrizes1;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
//		Crea un programa que cree una matriz de tamaño NxM (tamaño introducido
//		por teclado) e introduzca en ella NxM valores (también introducidos por
//		teclado). Luego deberá recorrer la matriz y al final mostrar por pantalla
//		cuántos valores son mayores que cero, cuántos son menores que cero y
//		cuántos son igual a cero.
		int tamaño1, tamaño2, mayores0 = 0, menores0 = 0, iguales0 = 0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce la primera longitud de la matriz");
		tamaño1 = leer.nextInt();
		System.out.println("Introduce la segunda longitud de la matriz");
		tamaño2 = leer.nextInt();

		int matriz1[][] = new int[tamaño1][tamaño2];
		System.out.println("Introduce valores para la matriz");
		for (int i = 0; i < matriz1.length; i++) {
			System.out.println("Fila nº:" + (i + 1));
			for (int j = 0; j < matriz1[i].length; j++) {
				matriz1[i][j] = leer.nextInt();
				if (matriz1[i][j] < 0) {
					menores0++;
				} else if (matriz1[i][j] > 0) {
					mayores0++;
				} else if (matriz1[i][j] == 0) {
					iguales0++;
				}
			}
		}
		leer.close();
		System.out.println("Numeros iguales a 0:" + iguales0);
		System.out.println("Numeros menores que 0:" + menores0);
		System.out.println("Numeros mayores que 0:" + mayores0);

	}
}
