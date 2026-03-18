package practica4;

//Mikel Gómez

public class MainVehiculos {
	public static void main(String[] args) {
		Vehiculos com1 = new Compacto("1209 BRP",true,false,Puertas.CINCO);
		Vehiculos com2 = new Compacto("0126 KZP",true,false,Puertas.TRES);
		Vehiculos prem1 = new Premium("2104 HYX", true, 240, false);
		Vehiculos prem2 = new Premium("4800 BRK",false,67,true);
		
		Cliente cli1 = new Cliente("12344567L","Pedro", "Picapiedra", 642971573);
		Cliente cli2 = new Cliente("7654321P","David", "ElGnomo", 679158673);
		
		Vehiculos.numeroTotalVehiculos();
		
		System.out.println(com1.toString());
		System.out.println(com2.toString());
		System.out.println(prem1.toString());
		System.out.println(prem2.toString());
		
		System.out.println(com1.equals(com2));
		
		com1.alquilar(cli1);
		com2.alquilar(cli2);
		
		Vehiculos array[] = {com1, com2, prem1, prem2};
		
		for(int i = 0;i < array.length;i++) {
			if(array[i] instanceof Premium) {
				Premium otro = (Premium) array[i];
				otro.calcularCosteAlquiler();
				System.out.println(otro.getPrecio());
			}
		}
		
		for(int i = 0;i < array.length;i++) {
			if(array[i] instanceof Compacto) {
				Compacto otro = (Compacto) array[i];
				System.out.println("Nombre completo del cliente " + otro.getCliente().getNombre() + " " + otro.getCliente().getApellidos());
				System.out.println("Dni del cliente " + otro.getCliente().getDni());
			}
		}
	
		
	}
}
