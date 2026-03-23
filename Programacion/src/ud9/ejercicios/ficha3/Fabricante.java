package ud9.ejercicios.ficha3;

public class Fabricante {
	private String nombre, pais;
	private static int nFabricantes;
	
	//CONSTRUCTORES
	
	public Fabricante(String nombre, String pais) {
		this.nombre=nombre;
		this.pais=pais;
		}
	
	//METODOS
	
	public int mostrarNumFabricantes() {
		return getnFabricantes();
	}
	

	@Override
	public String toString() {
		return "Fabricante: " + nombre + " - Pais: " + pais;
	}

	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public static int getnFabricantes() {
		return nFabricantes;
	}

	public static void setnFabricantes(int nFabricantes) {
		Fabricante.nFabricantes = nFabricantes;
	}
	
	
}
