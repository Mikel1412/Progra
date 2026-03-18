package ud4.claseString1;

public class Ej02 {
	public static void main(String[] args) {
//		Obtener qué tres caracteres hay en las posiciones 0, 13 y 18 de una frase,
//		probar con "En un lugar de la Mancha".
		String frase="En un lugar de la Mancha";
		char valor1, valor2, valor3;
		
		valor1=frase.charAt(0);
		valor2=frase.charAt(13);
		valor3=frase.charAt(18);
		System.out.println("Los caracteres en las posiciones 0, 13 y 18 son: " + valor1 + ", " + valor2 + ", " + valor3 + " respectivamente");
	}
}
