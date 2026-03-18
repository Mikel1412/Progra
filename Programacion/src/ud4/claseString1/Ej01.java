package ud4.claseString1;

public class Ej01 {
	public static void main(String[] args) {
//		Obtener la suma de la longitud de estas tres palabras: "coche",
//		"locomotora","camión"
		String str = "coche", str2 = "locomotora", str3 = "camion", suma;
		int longitud;
		suma = str + str2 + str3;
		longitud = suma.length();
		System.out.println("La longitud de la suma de las palabras es " + longitud);
	}
}
