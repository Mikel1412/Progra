package ud10.ficha1;

import java.util.ArrayList;
import java.util.List;

public class Ej2 {
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			lista.add((int) (Math.random() * (10 + 1)));
		}

		System.out.println(lista);

		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i)==5) {
				lista.remove(i);
			}
		}

		System.out.println(lista);

	}
}
