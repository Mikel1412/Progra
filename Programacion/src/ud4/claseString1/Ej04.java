package ud4.claseString1;

public class Ej04 {
	public static void main(String[] args) {
//		Crea cuatro String con los valores "uno", "dos", "tres" y "cuatro".
//		A partir de estos String crear otro que contenga "uno, dos, tres y cuatro"
		String str1="uno, ", str2="dos, ", str3="tres y ", str4="cuatro", strJunto;
		strJunto=str1+str2+str3+str4;
		System.out.println(strJunto);
		
	}
}
