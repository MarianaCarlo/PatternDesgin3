package exercise_Facade;

import java.util.ArrayList;

public class Abogados {
	private ArrayList<String> listaAbogados = new ArrayList<String>();
	public Abogados() {

	}

	public void findAbogado() {
		System.out.println("-------------------------------------");
		listaAbogados.add("Juan Perez");
		listaAbogados.add("Jose Aguilar");
		listaAbogados.add("Maria Lopez");
		System.out.println("Buscando abogados: ");
		for (int i = 0; i < listaAbogados.size(); i++) {
			System.out.println("\t "+listaAbogados.get(i));
		}
		int posicion = (int) (Math.random() * listaAbogados.size());
		System.out.println("Te sugerimos abogado: " + listaAbogados.get(posicion));

	}
}
