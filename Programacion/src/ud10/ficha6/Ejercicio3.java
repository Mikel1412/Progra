package ud10.ficha6;

import java.util.*;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		String[] palabra = {"hola", "adios", "hola", "java", "java", "java"};
		Map<Integer, String> palabras = new HashMap<>();
		int contJava=0,contHola=0,contAdios=0;
		
		for(int i = 0; i< palabra.length;i++) {
			palabras.put(i,palabra[i]);
		}
		
		for(Map.Entry<Integer, String> palabro : palabras.entrySet()) {
			if(palabro.getValue().equals("java")) {
				contJava++;
			}else if(palabro.getValue().equals("hola")) {
				contHola++;
			}else {
				contAdios++;
			}
		}
		
		System.out.println("Numero de holas= " + contHola + "\nNumero de Adioses= " + contAdios + "\nNumero de javas= " + contJava);
		
	}
}