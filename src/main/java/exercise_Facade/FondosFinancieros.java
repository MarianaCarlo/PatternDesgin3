package exercise_Facade;

import java.util.ArrayList;

public class FondosFinancieros {
	private ArrayList<String> listaFondos = new ArrayList<String>();
	public FondosFinancieros() {

	}

	public void findFFP() {
		System.out.println("-------------------------------------");
		listaFondos.add("Fondo financiero Ecofuturo");
		listaFondos.add("Fondo financiero Prodem");
		listaFondos.add("Fondo financiero Fassil");
		System.out.println("Buscando fondos financieros: ");
		for (int i = 0; i < listaFondos.size(); i++) {
			System.out.println("\t "+listaFondos.get(i));
		}
		int posicion = (int) (Math.random() * listaFondos.size());
		System.out.println("Te sugerimos fondo financiero: " + listaFondos.get(posicion));

	}
}
