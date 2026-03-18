package ud3.estructurasEjercicios;

public class Ej9 {
	public static void main(String[] args) {
//		Obtener un listado con los números del 1 al 10. En la posición del cinco en lugar de
//		salir el número ha de salir la palabra ‘CINCO’.

		for (int i = 0; i <= 9; i++) {
			if (i == 4) {
				System.out.println("CINCO");
			} else {
				System.out.println(i + 1);
			}
		}
	}
}
