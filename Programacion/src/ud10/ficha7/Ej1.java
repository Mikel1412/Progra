package ud10.ficha7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ej1 {
	public static void main(String[] args) {
		Map<String, Integer> personas = new HashMap<>();

		personas.put("Ana", 25);
		personas.put("Luis", 30);
		personas.put("Pedro", 20);
		personas.put("Ivan", 23);
		personas.put("Esteban", 55);

		for (Map.Entry<String, Integer> a : personas.entrySet()) {
			System.out.println("Nombre: " + a.getKey() + ". Edad: " + a.getValue());
		}

		personas.replace("Ana", 25, 35);

		Iterator<Map.Entry<String, Integer>> it = personas.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> a = it.next();

			if (a.getValue() < 22) {
				it.remove();
			}
		}

		System.out.println();
		for (Map.Entry<String, Integer> a : personas.entrySet()) {
			System.out.println("Nombre: " + a.getKey() + ". Edad: " + a.getValue());
		}

		int mediaEdad = 0;

		for (Map.Entry<String, Integer> a : personas.entrySet()) {
			mediaEdad = mediaEdad + a.getValue();
		}
		System.out.println();
		System.out.println("La media de la edad es " + mediaEdad/personas.size());
	}
}
