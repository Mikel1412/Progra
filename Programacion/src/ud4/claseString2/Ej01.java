package ud4.claseString2;

public class Ej01 {
	public static void main(String[] args) {
		String str = "Esta es la frase que vamos a partir en cuatro", resul1, resul2, resul3, resul4;
		resul3 = str.substring(0, str.length() / 2);
		resul4 = str.substring(str.length() / 2);
		resul1 = resul3.substring(0, resul3.length() / 2);
		resul2 = resul3.substring(resul3.length() / 2);
		resul3 = resul4.substring(0, resul4.length() / 2);
		resul4 = resul4.substring(resul4.length() / 2);
		System.out.println(resul1 + "\n" + resul2 + "\n" + resul3 + "\n" + resul4 + "\n");
	}
}
