package ud10.ficha1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ej5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> positivos = new ArrayList<>();
		List<Integer> negativos = new ArrayList<>();

		int n = 0;

		do {
			System.out.println("Introduce numeros, 0 para salir");
			n = sc.nextInt();
			if(n<0) {
				negativos.add(n);
			}else {
				positivos.add(n);
			}
		} while (n != 0);

		System.out.println(positivos);
		System.out.println(negativos);
		
		System.out.println("\n Se muestra la suma de las colecciones");
		
		int suma = 0;
		Iterator<Integer> it = positivos.iterator();
		
		while(it.hasNext()) {
			suma+=it.next();
		}
		
		System.out.println("Suma total: " + suma);
		
		int resta = 0;
		Iterator<Integer> itr = negativos.iterator();
		
		while(itr.hasNext()) {
			resta+=itr.next();
		}
		
		System.out.println("Suma total: " + resta);
		
		it = positivos.iterator();
		
		while(it.hasNext()) {
			if(it.next()>=10) {
				it.remove();
			}
		}
		
		itr = negativos.iterator();
		
		while(itr.hasNext()) {
			if(itr.next()<=-10) {
				itr.remove();
			}
		}
		
		System.out.println(positivos);
		System.out.println(negativos);
		
	}
}