package ud8.ejemplos;

public class Empresa {
	public static void main(String[] args) {
		Trabajador t = new Trabajador("Luis", "A123456");
		
		System.out.println(t);
		
		Empleado e1 = new Empleado("Ana", "j235123");
		System.out.println(e1);
		e1.sueldo();
		
		Empleado e2 = new Empleado("Diego", "C234654",3000,22);
		
		System.out.println(e2);
		e2.sueldo();
		
		Consultor c1 = new Consultor("David", "F234643", 10,20);
		System.out.println(c1);
		c1.sueldo();
		
		Trabajador t2 = new Consultor("Eva", "G123456", 100, 15);
	}
}
