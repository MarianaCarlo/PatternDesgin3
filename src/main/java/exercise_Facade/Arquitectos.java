package exercise_Facade;

import java.util.ArrayList;

public class Arquitectos {
	private ArrayList<String> listaArquitectos = new ArrayList<String>();
	public Arquitectos() {

	}

	public void findArquitecto() {
		System.out.println("-------------------------------------");
		listaArquitectos.add("Arq. Manuel Cortez");
		listaArquitectos.add("Arq. Priscila Ando");
		listaArquitectos.add("Arq. Juan Pinto");
		System.out.println("Buscando arquitectos: ");
		for (int i = 0; i < listaArquitectos.size(); i++) {
			System.out.println("\t "+listaArquitectos.get(i));
		}
		int posicion = (int) (Math.random() * listaArquitectos.size());
		System.out.println("Te sugerimos arquitecto: " + listaArquitectos.get(posicion));

	}
}
