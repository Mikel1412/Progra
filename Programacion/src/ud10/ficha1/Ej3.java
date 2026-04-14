package ud10.ficha1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ej3 {
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		Set<Integer> conjunto = new HashSet<>();
		for (int i = 0; i < 20; i++) {
			lista.add((int) (Math.random() * (10 + 1)));
		}
		
		System.out.println(lista);
		
		conjunto.addAll(lista);
		System.out.println(conjunto);
	}
}
