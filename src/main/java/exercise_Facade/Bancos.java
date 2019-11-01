package exercise_Facade;

import java.util.ArrayList;

public class Bancos {
	private ArrayList<String> listabancos = new ArrayList<String>();
	public Bancos() {

	}

	public void findBanco() {
		System.out.println("-------------------------------------");
		listabancos.add("Banco Sol");
		listabancos.add("Banco Mercantil Sant Cruz");
		listabancos.add("Banco Nacional De Bolivia");
		System.out.println("Buscando bancos: ");
		for (int i = 0; i < listabancos.size(); i++) {
			System.out.println("\t "+listabancos.get(i));
		}
		int posicion = (int) (Math.random() * listabancos.size());
		System.out.println("Te sugerimos banco: " + listabancos.get(posicion));

	}
}
