package ud3.estructurasListado5;

public class Ej4 {
	public static void main(String[] args) {
//		Realiza un programa para calcular la suma de los cuadrados de los 5 primeros
//		números naturales.
		
		int suma=0;
		for(int i=1;i<=5;i++) {
			suma=suma+(i*i);
		}
		System.out.println("La suma de los cuadrados de los 5 primeros numeros naturales es " + suma);
	}
}
