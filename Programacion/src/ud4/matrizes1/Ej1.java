package ud4.matrizes1;

public class Ej1 {
	public static void main(String[] args) {
//		Crea un programa que cree una matriz de tamaño 5x5 que almacene los
//		números del 1 al 25 y luego muestre la matriz por pantalla
		int prueba[][] = new int[5][5];
		int cont=1;
		for (int i = 0; i < prueba.length; i++) {
			for (int j = 0; j < prueba[i].length; j++) {
				prueba[i][j] = cont;
				cont++;
			}
		}

		for (int i = 0; i < prueba.length; i++) {
			for (int j = 0; j < prueba[i].length; j++) {
				if (j == 4) {
					System.out.println(prueba[i][j]);
				} else {
					System.out.print(prueba[i][j] + "|");
				}
			}
		}
	}
}
