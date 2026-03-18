package ud4.arrays1;

public class Ej7 {
	public static void main(String[] args) {
//		Mostrar los valores de los tres arrays. 
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

		for (int i = 0; i < array2.length; i++) {
            if (i >= 5 && i <= 8) {
                array2[i] = 99;
            }
        }
		
		for (int i = 0; i < array1.length; i++) {
			if (i > 1 && i < 8) {
				array1[i] = array2[i - 1];
			}
		}
		
		System.out.print("Array1: ");
		for (int i= 0;i< array1.length;i++) {
			System.out.print(array1[i] + ", ");
		}
		System.out.println("");
		
		System.out.print("Array2: ");
		for (int i= 0;i< array2.length;i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println("");
		
		System.out.print("Array3: ");
		for (int i= 0;i< array3.length;i++) {
			System.out.print(array3[i] + " ");
		}
	}
}
