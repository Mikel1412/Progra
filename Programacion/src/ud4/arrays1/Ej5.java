package ud4.arrays1;

public class Ej5 {
	public static void main(String[] args) {
		//Rellena en el array2 desde la posición 5 a la posición 8 con el número 99
		int array2[] = new int[20];

		for (int i = 20; i > 0; i--) {
			array2[20 - i] = i;
		}

		for (int i = 0; i < array2.length; i++) {
            if (i >= 5 && i <= 8) {
                array2[i] = 99;
            }
            System.out.println(array2[i]);
        }
	}
}
