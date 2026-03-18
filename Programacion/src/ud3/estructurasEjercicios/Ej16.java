package ud3.estructurasEjercicios;

public class Ej16 {
	public static void main(String[] args) {
//		Obtener la suma de todos los números impares entre 3 y 21 exceptuando el 13 y el
//		17.
		int cont = 0;
		for (int i = 3; i <= 21; i++) {
			if (i % 2 != 0 && i != 13 && i != 17) {
				cont = cont + i;
			}
		}
//		for (int i = 3; i <= 21; i = i + 2) {
//			if (i != 13 && i != 17) {
//				cont += i;
//			}
//		}
//		otra posible solución
		System.out.println(cont);
	}
}
