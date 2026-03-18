package ud4.claseString2;

public class Ej02 {
	public static void main(String[] args) {
//		En cualquier frase sustituir todas las posiciones múltiplos de 3 por ‘#’.
//		Probarlo con “Esta es la frase donde vamos a poner almohadillas”
		String str = "Esta es la frase donde vamos a poner almohadillas", fraseFinal = "";
		for (int i = 0; i < str.length(); i++) {
			if (i % 3 == 0 && i != 0) {
				fraseFinal = fraseFinal + "#";
			} else {
				fraseFinal = fraseFinal + str.charAt(i);
			}
		}
		System.out.println(fraseFinal);
	}
}
