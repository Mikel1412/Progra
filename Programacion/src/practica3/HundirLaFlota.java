package practica3;

import java.util.Scanner;

public class HundirLaFlota {
	public static String[][] CrearTablero() {
		String[][] tablero = new String[11][11];
		String[] letra = new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };

		int i;
		for (i = 1; i < tablero.length; ++i) {
			for (int j = 1; j < tablero[i].length; ++j) {
				tablero[i][j] = "- \t";
			}
		}

		for (i = 1; i < tablero.length; ++i) {
			tablero[0][i] = i - 1 + "\t";
		}

		for (i = 1; i < tablero.length; ++i) {
			tablero[i][0] = letra[i - 1] + "\t";
		}

		tablero[0][0] = "\t";
		return tablero;
	}

	public static int modoDeJuego() {
		Scanner leer = new Scanner(System.in);
		int modoJuego;
		System.out.println(
				"Selecciona el modo de juego \n 1.Facil (10 barcos 50 intentos) \n 2.Medio (7 barcos 35 intentos) "
						+ "\n 3.Dificil(5 barcos 25 intentos) \n 4.Personalizado");
		modoJuego = leer.nextInt();
		leer.close();
		return modoJuego;
	}

	public static void mostrarTablero(String[][] tablero) {
		for (int i = 0; i < tablero.length; ++i) {
			for (int j = 0; j < tablero[i].length; ++j) {
				System.out.print(tablero[i][j]);
			}

			System.out.println();
		}

	}

	public static String[][] insertarbarco(String[][] tablero) {
		return tablero;
	}

	public static String[][] insertarBuque(String[][] tablero) {
		int fila, col, orientacion, tamaño = 3;
		boolean valido = true;
		do {
			valido=true;
			orientacion = (int) (Math.random() * 2);
			fila = (int) (Math.random() * 10);
			col = (int) (Math.random() * 10);
			
			if (orientacion == 0) {
				if (col + tamaño > tablero[0].length) {
					valido = false;
				} else {
					for (int i = 0; i < tamaño; i++) {
						if (!tablero[fila][col + i].equals("-")) {
							valido = false;
						}
					}
				}
			} else {
				if (fila + tamaño > tablero.length) {
					valido = false;
				} else {
					for (int i = 0; i < tamaño; i++) {
						if (!tablero[fila + i][col].equals("-")) {
							valido = false;
						}
					}
				}
			}
		} while (!valido);
		System.out.println(orientacion);
		if (orientacion == 0) {
			for (int i = 0; i < tamaño; i++) {
				tablero[fila][col + i] = "B";
			}
		} else {
			for (int i = 0; i < tamaño; i++) {
				tablero[fila + i][col] = "B";
			}
		}
		return tablero;

	}

	public static String[][] insertarAcorazado(String[][] tablero) {
		return tablero;
	}

	public static String[][] insertarLancha(String[][] tablero) {
		int fila, col;

		do {
			fila = (int) (1 + Math.random() * (10));
			col = (int) (1 + Math.random() * (10));

		} while (tablero[fila][col].equals("-"));

		tablero[fila][col] = "L \t";

		return tablero;
	}

	public static void main(String[] args) {
		String[][] tablero = new String[11][11];
		String[][] tableroCompleto = new String[11][11];
		tablero = CrearTablero();
		tableroCompleto = tablero;
		modoDeJuego();
		tableroCompleto = insertarLancha(tableroCompleto);
		mostrarTablero(tableroCompleto);
		tableroCompleto = insertarBuque(tableroCompleto);
		mostrarTablero(tableroCompleto);
	}
}
