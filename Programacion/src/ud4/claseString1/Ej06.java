package ud4.claseString1;

public class Ej06 {
	public static void main(String[] args) {
//		Crea un programa que muestre cada una de las letras de una frase en una
//		línea, exceptuando los espacios. Probar con "Este es el Ejercicio 5". El
//		resultado debe mostrar
		String str = "Este es el Ejercicio 5";
		char espacio = ' ';
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)!=espacio) {
				System.out.println(str.charAt(i));
			}
		}
		
		String cad="Hola Mundo!";
		int posicion=cad.indexOf('m');
		System.out.println(posicion);
		
		
	}
}
