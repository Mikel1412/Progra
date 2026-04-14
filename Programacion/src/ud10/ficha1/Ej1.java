package ud10.ficha1;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> lista1 = new ArrayList<>();
		int numero=0;
		
		
		while(numero>=0) {
			System.out.println("Introduce numeros enteros hasta introducir -1");
			numero=sc.nextInt();
			lista1.add(numero);
		}
		
		System.out.println(lista1);
		
		for(int i = 0; i < lista1.size();i++) {
			if(lista1.get(i)%2==0) {
				System.out.println(lista1.get(i)+"\t");
			}
		}
		
		for(int i = 0; i < lista1.size();i++) {
			if(lista1.get(i)%3==0) {
				lista1.remove(i);
			}
		}
		
		//Recorremos la lista con iterador
		Iterator<Integer> it = lista1.iterator();
		while(it.hasNext()) {
			if(it.next()%3==0) {
				it.remove();
			}
		}
		
		System.out.println(lista1);
		
	}
}
