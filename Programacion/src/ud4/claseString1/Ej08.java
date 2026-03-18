package ud4.claseString1;

public class Ej08 {
	public static void main(String[] args) {
//		Crea un programa que cuente el número de veces que aparece la letra "e"
//		(Mayúscula o minúscula). Probar con la frase "Este ejercicio es el primero
//		que cuenta letras".
		String str="Este ejercicio es el primero que cuenta letras";
		char c;
		int cont =0;
		
		for(int i=0;i<str.length();i++) {
			c=str.charAt(i);
			if(c=='e'||c=='E') {
				cont++;
			}
		}
		System.out.println("Hay un total de " + cont + " letras 'e' en la cadena:" + str);
	}
}
