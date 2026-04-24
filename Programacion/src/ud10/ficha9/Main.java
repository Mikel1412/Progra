package ud10.ficha9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) throws RiegoExcesivoException {
		List<Planta> listaPlantas = new ArrayList<>();

		Planta planta1 = new Arbol(3, HojasArbolTipo.CADUCA, "Arbol1", 10, false);
		Planta planta2 = new Arbol(12, HojasArbolTipo.PERENNE, "Arbol2", 26, false);
		Planta planta3 = new Arbol(24, HojasArbolTipo.CADUCA, "Arbol3", 37, false);
		Planta planta4 = new Flor("Verde", "Flor1", 2, false);
		Planta planta5 = new Flor("Verde", "Flor2", 5, false);
		Planta planta6 = new Flor("Verde", "Flor3", 7, false);

		listaPlantas.add(planta1);
		listaPlantas.add(planta2);
		listaPlantas.add(planta3);
		listaPlantas.add(planta4);
		listaPlantas.add(planta5);
		listaPlantas.add(planta6);

		for (Planta p : listaPlantas) {
			p.mostrarInformacion();
		}

		for (Planta p : listaPlantas) {
			if (p.isNecesitaAgua()) {
				p.regar();
			}
		}

		planta1.crecer();

		planta4.crecer();

		double mediaAltura = 0;

		for (Planta p : listaPlantas) {
			mediaAltura += p.getAltura();
		}

		System.out.println("La altura media de las plantas es de " + mediaAltura / listaPlantas.size());

		Iterator<Planta> it = listaPlantas.iterator();

		while (it.hasNext()) {
			if (!it.next().isNecesitaAgua()) {
				it.remove();
			}
		}

		System.out.println(listaPlantas);

		Map<Integer, Planta> mapaPlantas = new HashMap<>();

		mapaPlantas.put(planta1.getIDPlanta(), planta1);
		mapaPlantas.put(planta2.getIDPlanta(), planta2);
		mapaPlantas.put(planta3.getIDPlanta(), planta3);
		mapaPlantas.put(planta4.getIDPlanta(), planta4);
		mapaPlantas.put(planta5.getIDPlanta(), planta5);
		mapaPlantas.put(planta6.getIDPlanta(), planta6);

		for (Entry<Integer, Planta> p : mapaPlantas.entrySet()) {
			if(p.getKey()==2) {
				p.getValue().mostrarInformacion();
			}
		}
		
		for (Entry<Integer, Planta> p : mapaPlantas.entrySet()) {
			if(p.getKey()==5) {
				p.;
			}
		}
	}
}
