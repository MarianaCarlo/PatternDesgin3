package example_Bridge;

public class Client {

	public static void main(String[] args) {
		ConcreateBlanco blanco = new ConcreateBlanco();
		Circulo circulo = new Circulo(blanco);
		
		circulo.dibujar();
	}

}
