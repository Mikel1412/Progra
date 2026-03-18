package ud4.arrays1;

public class Ej1 {
	public static void main(String[] args) {
//		Crear un array1 unidimensional de enteros de longitud 10 y rellenarlo con los
//		números que van del 100 en adelante
		int array1[] = new int[10];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = i + 100;
			System.out.println(array1[i]);
		}
	}
}
