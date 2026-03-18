package ud8.ejercicios.ficha2;

public class Electrodomestico {
	private static final int PESO_DEFECTO = 5;
	private static final int PRECIO_DEFECTO = 100;
	private static final char CONSUMO_DEFECTO = 'F';
	private static final String COLOR_DEFECTO = "Blanco";
	private int precioBase, peso;
	private String color;
	private char consumoEnergetico;

	public Electrodomestico() {
		this.color = COLOR_DEFECTO;
		this.consumoEnergetico = CONSUMO_DEFECTO;
		this.precioBase = PRECIO_DEFECTO;
		this.peso = PESO_DEFECTO;
	}

	public Electrodomestico(int peso, int precio) {
		this.peso = peso;
		this.precioBase = precio;
		this.consumoEnergetico = CONSUMO_DEFECTO;
		this.color = COLOR_DEFECTO;
	}

	public Electrodomestico(int peso, int precio, char consumo, String color) {
		this.peso = peso;
		this.precioBase = precio;
		this.consumoEnergetico = comprobarConsumoEnergetico(consumo);
		this.color = comprobarColor(color);
	}

	public char comprobarConsumoEnergetico(char consumoEnergetico) {
		char letras[] = { 'A', 'B', 'C', 'D', 'E', 'F' };
		boolean comprobar=false;
		char devuelve;
		for(int i = 0; i<letras.length;i++) {
			if (consumoEnergetico==letras[i]) {
				comprobar=true;
			}
		}
		if (!comprobar) {
			devuelve=CONSUMO_DEFECTO;
		}else {
			devuelve = consumoEnergetico;
		}
		return devuelve;
		
	}
	
	public String comprobarColor(String color) {
		String coloresDisponibles[] = {"BLANCO","NEGRO","ROJO","AZUL","GRIS"};
		boolean comprobar=false;
		String devuelve;
		for(int i = 0; i<coloresDisponibles.length;i++) {
			if (color.toUpperCase().equals(coloresDisponibles[i])) {
				comprobar=true;
			}
		}
		if (!comprobar) {
			devuelve=COLOR_DEFECTO;
		}else {
			devuelve = color;
		}
		return devuelve;
		
	}

	public int precioFinal() {
		int precioFinal=precioBase;
		char letras[] = { 'A', 'B', 'C', 'D', 'E', 'F' };
		for(int i = 0;i<letras.length;i++) {
			if(this.consumoEnergetico==letras[i]&&i<4) {
				precioFinal+=100-(i*20);
			}else if(this.consumoEnergetico==letras[i]){
				precioFinal+=50-((i-3)*20);
			}
		}
		if(this.peso>=80) {
			precioFinal+=100;
		}else if(this.peso>=50) {
			precioFinal+=80;
		}else if(this.peso>=20) {
			precioFinal+=50;
		}else{
			precioFinal+=10;
		}
		
		return precioFinal;
	}

	// GETTERS Y SETTERS

	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

}
