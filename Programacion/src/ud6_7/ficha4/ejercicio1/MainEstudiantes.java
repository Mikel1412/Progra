package ud6_7.ficha4.ejercicio1;

public class MainEstudiantes {
	public static void main(String[] args) {
		Estudiante est1 = new Estudiante("Juan Pablo Fernandez","4ºA");
		Estudiante est2 = new Estudiante("Enrique cuesta", 16, "2ºB");
		Estudiante est3 = new Estudiante("Pablo Coches", 80, "5ºC");
		
		est1.cumplirAnios();
		est2.cumplirAnios();
		
		System.out.println(est1.mostrarInformacion());
		System.out.println(est2.mostrarInformacion());
		System.out.println(est3.mostrarInformacion() + "\n");
		
		
		System.out.println(Estudiante.codEstudiante);
	}
}
