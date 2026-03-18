package ud4.matrizes2;

import java.io.IOException;
import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) throws IOException {
		Scanner leer = new Scanner(System.in);
		char menu;
		int matriz1[][] = new int[5][5];

		do {

			System.out.println("a.Generacion de matriz");
			System.out.println("b.Suma de filas");
			System.out.println("c.Suma de columnas");
			System.out.println("d.Diagonal principal");
			System.out.println("e.Suma total de la matriz");
			System.out.println("f.Remplazo de valores");
			System.out.println("g.Mostrar matriz resultante");
			System.out.println("h.Comprobacion de simetria");
			System.out.println("0.salir");

			menu = leer.next().charAt(0);

			switch (menu) {
			case 'a':
				for (int i = 0; i < matriz1.length; i++) {
					for (int j = 0; j < matriz1[i].length; j++) {
						matriz1[i][j] = (int) (Math.random() * 5 + 1);
					}
				}

				for (int i = 0; i < matriz1.length; i++) {
					for (int j = 0; j < matriz1[i].length; j++) {
						System.out.print(matriz1[i][j] + "\t");
					}
					System.out.println();
				}
				break;
			case 'b':
				for (int i = 0; i < matriz1.length; i++) {
					int sumaFila = 0;
					for (int j = 0; j < matriz1[i].length; j++) {
						sumaFila += matriz1[i][j];
					}
					System.out.println("La suma de la fila " + (i + 1) + " es de " + sumaFila);
				}

				break;
			case 'c':
				int sumaColumnas = 0;

				for (int i = 0; i < matriz1[0].length; i++) {
					for (int j = 0; j < matriz1.length; j++) {
						sumaColumnas += matriz1[j][i];
					}
					System.out.println("La suma de la columna" + (i + 1) + " es de " + sumaColumnas);
					sumaColumnas = 0;
				}
				break;
			case 'd':
				int sumaDiagonal = 0;
				for (int i = 0; i < matriz1.length; i++) {
					sumaDiagonal += matriz1[i][i];
				}
				System.out.println("La suma de la diagonal es de " + sumaDiagonal);
				break;
				
			case 'e':
				
				
				break;
				
			case 'f':
				for (int i = 0; i < matriz1.length; i++) {
					matriz1[i][matriz1.length - 1 - i] = (matriz1[i][matriz1.length - i - 1])*(matriz1[i][matriz1.length - i - 1]);
				}

				break;
			case 'g':
				for (int i = 0; i < matriz1.length; i++) {
					for (int j = 0; j < matriz1[i].length; j++) {
						System.out.print(matriz1[i][j] + "\t");
					}
					System.out.println();
				}

				break;
			
			case 'h':

				break;
			default:
				break;
			}
		} while (menu != 0);
		leer.close();
	}
}
