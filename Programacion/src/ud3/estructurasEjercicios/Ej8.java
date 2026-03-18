package ud3.estructurasEjercicios;

public class Ej8 {
	public static void main(String[] args) {
//		Crea un programa para obtener un listado de todos los números pares del 2 al 20.
//		Realiza el ejercicio de 3 formas diferentes (utilizando un bucle for, while y dowhile).
		
		int cont = 0;

		System.out.println("For");
		
		for (int i = 2; i <= 20; i = i + 2) {
			System.out.println(i);
		}
		
		System.out.println("While");
		
		while (cont <= 20) {
			System.out.println(cont);
			cont = cont + 2;
		}

		cont = 0;
		
		System.out.println("Do while");
		
		do {
			cont = cont + 2;
			System.out.println(cont);
		} while (cont <= 18);
	}
}
