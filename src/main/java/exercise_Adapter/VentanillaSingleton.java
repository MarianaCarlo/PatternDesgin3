package exercise_Adapter;

public class VentanillaSingleton {
	private static VentanillaSingleton instance = null;
	private int montoTotal = 10000;

	private VentanillaSingleton() {

	}

	public static VentanillaSingleton getInstance() {
		if (instance == null) {
			instance = new VentanillaSingleton();
		}
		return instance;
	}

	public int getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(int montoTotal) {
		this.montoTotal = montoTotal;
	}

	public void realizarPrestamos(int monto) {
		if (this.getMontoTotal() - monto > 0) {
			setMontoTotal(this.getMontoTotal() - monto);
		} else {
			System.out.println("No se puede prestar");
		}
	}
}
