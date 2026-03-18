package ud4.arrays1;

public class Ej2 {
	public static void main(String[] args) {
//		Crear un array2 unidimensional de enteros de longitud 20 y rellenarlo con los
//		números que van del 20 hacia atrás.
		int array2[] = new int[20];
		for (int i = 20; i > 0; i--) {
			array2[20 - i] = i;
			System.out.println(array2[20 - i]);
		}
	}
}
