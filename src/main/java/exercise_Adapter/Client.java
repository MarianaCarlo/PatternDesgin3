package exercise_Adapter;

public class Client {

	public static void main(String[] args) {
		BancoSol bancosol = new BancoSol();
		Cooperativa1 coo1 = new Cooperativa1();
		AdapterCooperativa1 ad = new AdapterCooperativa1(coo1);
		bancosol.prestamo(100);
		ad.prestamo(100); 
		System.out.println("monto:" + VentanillaSingleton.getInstance().getMontoTotal());

	}

}
