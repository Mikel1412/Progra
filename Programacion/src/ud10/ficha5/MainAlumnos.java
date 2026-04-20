package ud10.ficha5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainAlumnos {
	public static void main(String[] args) {
		List<Alumno> alumnos = new ArrayList<>();
		
		Alumno alumno1 = new Alumno("Juan", 8, 15);
		Alumno alumno2 = new Alumno("Esteban", 5, 16);
		Alumno alumno3 = new Alumno("Francisco", 8, 14);
		
		alumnos.add(alumno1);
		alumnos.add(alumno2);
		alumnos.add(alumno3);
		
		for(Alumno a : alumnos) {
			System.out.println(a);
		}
		
		Collections.sort(alumnos);
		
		for(Alumno a : alumnos) {
			System.out.println(a);
		}
	}
}
