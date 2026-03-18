package ud6_7.ficha5.ejercicio1;

public class Robot {
	private String modelo;
	private int nivelBateria, idRobot;
	private static int totalRobots = 0, maximoBateriaTotal = 0, generarID = 0;
	private static int bateriaEstandar = 50;
	private static String modeloEstandar = "Exos125";

	// Constructores

	public Robot(String modelo, int bateria) {
		this.modelo = comprobarModelo(modelo);
		this.nivelBateria = comprobarBateria(bateria);
		this.idRobot = generarID;
		generarID++;
	}

	public Robot(String modelo) {
		this.modelo = comprobarModelo(modelo);
		this.nivelBateria = bateriaEstandar;
		this.idRobot = generarID;
		generarID++;
	}

	public Robot() {
		this.modelo = modeloEstandar;
		this.nivelBateria = bateriaEstandar;
		this.idRobot = generarID;
		generarID++;
	}

	// Metodos
	public int comprobarBateria(int bateria) {
		int nuevaBateria;
		if (bateria >= 0 && bateria <= 100) {
			nuevaBateria = bateria;
		} else {
			nuevaBateria = bateriaEstandar;
		}
		return nuevaBateria;
	}

	public String comprobarModelo(String modelo) {
		String comprobado;
		if (modelo.equals("")) {
			comprobado = modeloEstandar;
		} else {
			comprobado = modelo;
		}
		return comprobado;
	}

	//GETTERS Y SETTERS
	
	
	public String getModelo() {
		return modelo;
	}
	
	public int getNivelBateria() {
		return nivelBateria;
	}
	
	public int getIdRobot() {
		return idRobot;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setNivelBateria(int nivelBateria) {
		this.nivelBateria = nivelBateria;
	}

	public void setIdRobot(int idRobot) {
		this.idRobot = idRobot;
	}

	@Override
	public String toString() {
		return "Robot [modelo=" + modelo + ", nivelBateria=" + nivelBateria + ", idRobot=" + idRobot + "]";
	}

	

	
	
}
