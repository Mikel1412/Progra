package ud4.claseString1;

public class Ej05 {
	public static void main(String[] args) {
//		Crea una cadena con el nombre a y el valor mesa. Crea el caracter (char) con
//		el nombre b y el valor s. ¿Cuál es el resultado de hacer a=a+b?¿Podemos
//		concatenar una cadena con un char?
		String a="mesa";
		char b='s';
		a=a+b;
		System.out.println(a);
		System.out.println("Si se puede concatenar un String y un char");
	}
}
