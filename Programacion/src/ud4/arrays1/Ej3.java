package ud4.arrays1;

public class Ej3 {
	public static void main(String[] args) {
//		Crea un array3 unidimensional de longitud 30 rellenarlo con los 20 elementos del
//		array2 seguidos de los 10 elementos del array1
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
			System.out.println(array3[i]);
		}
	}
}
