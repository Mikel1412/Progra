package ud4.claseString1;

public class Ej07 {
	public static void main(String[] args) {
//		Crea un programa que obtenga en qué posición aparece por primera vez un
//		espacio. Y después del primer espacio en qué posición aparece el tercer
//		espacio. Prueba con la frase "En esta frase hay varios espacios
		String str = "En esta frase hay varios espacios";
		int contEspacios=0;
		
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				contEspacios++;
				if(contEspacios==1||contEspacios==3) {
					System.out.println("El espacio nº " + (contEspacios) + " se encuentra en la posición " + i);
				}
			}
		}
	}
}
