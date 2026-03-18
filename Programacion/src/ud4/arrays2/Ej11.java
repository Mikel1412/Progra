package ud4.arrays2;

public class Ej11 {
	public static void main(String[] args) {
//		.Crea un programa que cree dos arrays de enteros de tamaño 100. Luego
//		introducirá en el primer array todos los valores del 1 al 100. Por último, deberá
//		copiar todos los valores del primer array al segundo array en orden inverso, y
//		mostrar ambos por pantalla
		int array1[] = new int[100];
		int array2[] = new int[100];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = i + 1;
			array2[99-i] = array1[i];
		}
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array2[i]);
		}
	}
}
