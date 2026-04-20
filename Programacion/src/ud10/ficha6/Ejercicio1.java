package ud10.ficha6;

import java.util.*;

public class Ejercicio1 {
	public static void main(String[] args) {
		Map<String, Integer> personas = new HashMap<>();
		personas.put("Eduardo", 3);
		personas.put("Antonio", 5);
		personas.put("Estefania", 12);
		
		for(Map.Entry<String, Integer> entry : personas.entrySet()) {
			System.out.println(entry.getKey()+ entry.getValue());
		}
	}
}