package ud4.arrays1;

public class Ej4 {
	public static void main(String[] args) {
//		Busca la posición en la que se encuentra el número 5 en el array3
		int array1[] = new int[10];
		int array2[] = new int[20];
		int array3[] = new int[30];

		for (int i = 0; i < array1.length; i++) {
			array1[i] = i + 100;
		}

		for (int i = 20; i > 0; i--) {
			array2[20 - i] = i;
		}

		for (int i = 0; i < array3.length; i++) {
			if (i < 10) {
				array3[i] = array1[i];
			}
			if (i >= 10) {
				array3[i] = array2[i - 10];
			}
		}

		for (int i = 0; i < array3.length; i++) {
			if(array3[i]==5) {
				System.out.println("El numero 5 se encuentra en la posicion " + i);
			}
		}
	}
}
