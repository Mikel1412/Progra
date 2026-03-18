package ud8.ejercicios.ficha1;

public class MainPersona {
	public static void main(String[] args) {
		Persona p1 = new Persona();
		Persona p2 = new Persona("David", 20, 'm');
		Empleado e1 = new Empleado();
		Empleado e2 = new Empleado("Ana", 35, 'f', 200, "Comercial", "Direccion");
		
		p1.presentacion();
		p2.presentacion();
		e1.presentacion();
		e2.presentacion();
		e1.saludoEmpleado();
		e2.saludoEmpleado();
	}
}
