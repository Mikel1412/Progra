package ud4.arrays1;

public class Ej6 {
	public static void main(String[] args) {
//		Copia en el array1 desde la posición 2, los 6 primeros elementos del array2
		int array1[] = new int[10];
		int array2[] = new int[20];

		for (int i = 0; i < array1.length; i++) {
			array1[i] = i + 100;
		}

		for (int i = 20; i > 0; i--) {
			array2[20 - i] = i;
		}
		
		for (int i = 0; i < array2.length; i++) {
			if (i >= 5 && i <= 8) {
                array2[i] = 99;
            }
        }

		for (int i = 0; i < array1.length; i++) {
			if (i > 1 && i < 8) {
				array1[i] = array2[i - 1];
			}
			System.out.println(array1[i]);	
		}
	}
}
