package ud4.matrizes1;

public class Ej2 {
	public static void main(String[] args) {
//		Crea un programa que cree una matriz de 10x10 e introduzca los valores de
//		las tablas de multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará
//		la matriz por pantalla.
		
		int matriz1[][] = new int[10][10];
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				matriz1[i][j] = (i + 1) * ( j + 1);
			}
		}

		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				if (j == 9) {
					System.out.println(matriz1[i][j]);
				} else {
					System.out.print(matriz1[i][j] + "\t");
				}
			}
		}
	}
}
