package ud4.arrays2;

import java.util.Scanner;

public class Ej9 {
	public static void main(String[] args) {
//		Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con
//		valores enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego
//		pedirá un valor N y mostrará en qué posiciones del array aparece N.
		int array1[] =new int[100];
		Scanner sc =new Scanner(System.in);
		int numero_Pedido;
		
		for (int i=0;i<99;i++) {
			array1[i]=(int) (1+Math.random()*10);
		}
		
		System.out.println("Introduce un valor entre 1 y 10 para encontrarlo en en array");
		numero_Pedido=sc.nextInt();
		
		while(numero_Pedido<1 || numero_Pedido>10) {
			System.out.println("Numero incorrecto, introduce otro");
			System.out.println("Introduce un valor entre 1 y 10 para encontrarlo en en array");
			numero_Pedido=sc.nextInt();
		}
		
		for (int i=0;i<99;i++) {
			if(array1[i]==numero_Pedido) {
				System.out.println("El numero " + numero_Pedido + " se encuenra en la posicion " + (i+1));
			}
		}
		sc.close();
	}
}
