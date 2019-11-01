package exercise_Facade;

import java.util.ArrayList;

public class Cooperativas {
	private ArrayList<String> listaCoop = new ArrayList<String>();
	public Cooperativas() {

	}

	public void findCoop() {
		System.out.println("-------------------------------------");
		listaCoop.add("Cooperativa 1");
		listaCoop.add("Cooperativa 2");
		listaCoop.add("Cooperativa 3");
		System.out.println("Buscando cooperativas: ");
		for (int i = 0; i < listaCoop.size(); i++) {
			System.out.println("\t "+listaCoop.get(i));
		}
		int posicion = (int) (Math.random() * listaCoop.size());
		System.out.println("Te sugerimos cooperativa: " + listaCoop.get(posicion));

	}
}
