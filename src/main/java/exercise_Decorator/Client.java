package exercise_Decorator;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		ArrayList<Integer> total = new ArrayList<Integer>();

		IComputadora computadora = new Computadora();
		total.add(computadora.getPrecio());

		computadora = new Teclado(computadora,"Gamer", 25);
		total.add(computadora.getPrecio());

		computadora = new Mouse(computadora,"Gamer", 15);
		total.add(computadora.getPrecio());

		computadora = new TarjetaVideo(computadora,"Gamer", 5);
		total.add(computadora.getPrecio());

		computadora = new Monitor(computadora,"Samsung", 30);
		total.add(computadora.getPrecio());

		computadora.operation();

		int res = 0;
		for (int i = 0; i < total.size(); i++) {
			res += total.get(i);
		}
		System.out.println("Total: " + res);

	}

}
