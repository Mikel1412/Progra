package ud10.ficha9;

public interface Cuidable {
	public static void recomendarRiego(Planta p){
		if(p.isNecesitaAgua()) {
			System.out.println("Es recomendable regar la planta");
		}else {
			System.out.println("No es necesario regar la planta");
		} 
	}
	
	boolean necesitaRiego();
	
	void recibirLuz();
}
