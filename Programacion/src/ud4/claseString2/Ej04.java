package ud4.claseString2;

public class Ej04 {
	public static void main(String[] args) {
//		Obtener el número de palabras que hay en cualquier frase. Probarlo con “A
//		ver cuántas palabras hay aquí.” 
		
		String cad= "A ver cuántas palabras niga hay aquí.";
		String palabras[];
		
		palabras=cad.split(" ");
		
		System.out.println("En total hay " + palabras.length + " palabras");
	}
}
