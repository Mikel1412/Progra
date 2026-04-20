package ud10.ficha6;

import java.util.*;

public class Ejercicio5 {
	public static void main(String[] args) {
		Map<Integer, Integer> numeros = new HashMap<>();
		numeros.put(1, 25);
		numeros.put(2, 30);
		numeros.put(3, 20);
		numeros.put(4, 2);
		numeros.put(5, 45);
		numeros.put(6, 8);
		numeros.put(7, 14);
		numeros.put(8, 9);
		
		Iterator<Map.Entry<Integer,Integer>>it=numeros.entrySet().iterator();
		while (it.hasNext()) {
		if(it.next().getValue()<10)
			it.remove();
		}
		
		System.out.println(numeros);
	}
}