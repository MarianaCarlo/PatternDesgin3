package exercise_Adapter;

public class BancoSol implements IBanco {
	private int prestamoCantidad;
	private VentanillaSingleton singleton;

	@Override
	public int getPrestamo() {
		//System.out.println(singleton.getMontoTotal());
		return this.prestamoCantidad;
	}

	@Override
	public void setPrestamo(int prestamo) {
		this.prestamoCantidad = prestamo;
	}

	@Override
	public void prestamo(int monto) {
		VentanillaSingleton.getInstance().realizarPrestamos(monto);
	}

}
