package ud10.ficha6;

import java.util.*;

public class Ejercicio2 {
	public static void main(String[] args) {
		Map<String, Integer> edades = new HashMap<>();
		edades.put("Ana", 25);
		edades.put("Luis", 30);
		edades.put("Pedro", 20);
		
		for(Map.Entry<String, Integer> persona : edades.entrySet()) {
			if(persona.getValue()>=18) {
				System.out.println(persona.getKey()+persona.getValue());
			}
		}
	}
}