package ud8.ejercicios.ficha1;

public class Empleado extends Persona{
	private int numeroEmpleado;
	String departamento, puesto;
	
	public Empleado() {
		
	}
	
	public Empleado(String nombre, int edad, char genero, int numeroEmpleado, String departamento, String puesto) {
		super(nombre, edad, genero);
		this.numeroEmpleado=numeroEmpleado;
		this.departamento=departamento;
		this.puesto=puesto;
	}
	
	
	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}
	public void setNumeroEmpleado(int numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	public void saludoEmpleado() {
		System.out.println("Buenos dias desde el empleado " + getNombre() + " con numero de empleado " + getNumeroEmpleado());
	}
}
