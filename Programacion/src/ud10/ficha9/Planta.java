package ud10.ficha9;

import java.util.Objects;

public abstract class Planta{
	
	//Atributos
	private String nombre;
	double altura;
	private int IDPlanta;
	private boolean necesitaAgua;
	private static int totalPlantasCreadas;
	
	//Constructores
	public Planta(String nombre, int altura, boolean necesitaAgua, int maxAgua) {
		this.nombre=nombre;
		this.altura=altura;
		this.IDPlanta=totalPlantasCreadas;
		this.necesitaAgua=necesitaAgua;
		totalPlantasCreadas++;
	}
	
	//Metodos
	public void regar() throws RiegoExcesivoException {
		if(necesitaAgua) {
			necesitaAgua=!necesitaAgua;
			System.out.println(this.IDPlanta + " ha sido regada correctamente");
		}else {
			throw new RiegoExcesivoException("La planta no necesita agua en este momento");
		}
	}
	
	
	//Lo que hacemos aqui es que la constante MAX_AGUA de arbol y flor la cojemos por
	//parametro en el constructor y usamos esa variable para que sepamos el maximo de agua
	public abstract void regar(int cantidadAgua) throws RiegoExcesivoException;
	
	public abstract void crecer();
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Planta other = (Planta) obj;
		return IDPlanta == other.IDPlanta && Objects.equals(nombre, other.nombre);
	}
	
	public String mostrarInformacion() {
		String agua;
		if(necesitaAgua) {
			agua="Si";
		}else {
			agua="No";
		}
		return "Planta:" + nombre + "| Altura:" + altura + "| Necesita agua="
				+ agua + "ID: " + IDPlanta ;
	}
	
	public int totalPlantas() {
		return totalPlantasCreadas;
	}

	//GETTERS Y SETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double d) {
		this.altura = d;
	}

	public int getIDPlanta() {
		return IDPlanta;
	}

	public void setIDPlanta(int iDPlanta) {
		IDPlanta = iDPlanta;
	}

	public boolean isNecesitaAgua() {
		return necesitaAgua;
	}

	public void setNecesitaAgua(boolean necesitaAgua) {
		this.necesitaAgua = necesitaAgua;
	}

	public static int getTotalPlantasCreadas() {
		return totalPlantasCreadas;
	}

	public static void setTotalPlantasCreadas(int totalPlantasCreadas) {
		Planta.totalPlantasCreadas = totalPlantasCreadas;
	}

	
}
