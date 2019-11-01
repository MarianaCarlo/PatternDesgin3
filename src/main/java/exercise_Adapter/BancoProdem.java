package exercise_Adapter;

public class BancoProdem implements IBanco {
	private int prestamoCantidad;
	private int cantidad;

	@Override
	public int getPrestamo() {
		return prestamoCantidad;
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
