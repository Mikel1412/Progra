package ud3.estructurasEjercicios;

public class Ej12 {
	public static void main(String[] args) {
//		Obtener un listado de todos los números del 1 al 100 que contengan un 8.
		for (int i = 1; i <= 100; i++) {
			if(i/10==8 || i%10==8) {
				System.out.println(i);
			}
		}
	}
}
