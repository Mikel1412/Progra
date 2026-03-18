package ud3.estructurasEjercicios;

public class Ej11 {
	public static void main(String[] args) {
//		.Sin utilizar la estructura FOR sacar un listado de todos los números impares del 7 al 21
		
		int n=7;
		
		while(n<=21) {
			if (n%2!=0) {
				System.out.println(n);
			}
			n=n+1;
		}
	}
}
