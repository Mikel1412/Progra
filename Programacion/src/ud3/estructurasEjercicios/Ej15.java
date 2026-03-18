	package ud3.estructurasEjercicios;

public class Ej15 {
	public static void main(String[] args) {
//		Obtener la suma de todos los números entre 5 y 15.
		int cont=0;
		for (int i = 5; i <= 15; i++) {
			//cont=cont+i;
			//es lo mismo
			cont+=i;
		}
		System.out.println(cont);
	}
}
