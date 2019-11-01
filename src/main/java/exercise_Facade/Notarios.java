package exercise_Facade;

import java.util.ArrayList;

public class Notarios {
	private ArrayList<String> listaNotarios = new ArrayList<String>();
	public Notarios() {

	}

	public void findNotario() {
		System.out.println("-------------------------------------");
		listaNotarios.add("Adrian Yoplack");
		listaNotarios.add("Marcela Flores");
		listaNotarios.add("Laura Jordan");
		System.out.println("Buscando notarios: ");
		for (int i = 0; i < listaNotarios.size(); i++) {
			System.out.println("\t "+listaNotarios.get(i));
		}
		int posicion = (int) (Math.random() * listaNotarios.size());
		System.out.println("Te sugerimos notario: " + listaNotarios.get(posicion));

	}
}
