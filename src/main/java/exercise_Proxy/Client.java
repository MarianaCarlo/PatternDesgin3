package exercise_Proxy;

public class Client {

	public static void main(String[] args) {
		IBanco proxy = new ProxyCajero(new Accion("Mariana", Monedas.Boliviano, 100));
		proxy.retirar();

	}

}
