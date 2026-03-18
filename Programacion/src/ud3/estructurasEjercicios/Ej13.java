package ud3.estructurasEjercicios;

public class Ej13 {
	public static void main(String[] args) {
//		Obtener un listado de todos los números múltiplos de 4 entre 4 y 40.

		for (int i = 4; i <= 40; i++) {
			if (i % 4 == 0) {
				System.out.println(i);
			}
		}
	}
}
