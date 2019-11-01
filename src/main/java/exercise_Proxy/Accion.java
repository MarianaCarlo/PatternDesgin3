package exercise_Proxy;

public class Accion {
	private String nombre;
	private Monedas moneda;
	private int cantidad;

	public Accion(String nombre, Monedas moneda, int cantidad) {
		super();
		this.nombre = nombre;
		this.moneda = moneda;
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Monedas getMoneda() {
		return moneda;
	}

	public void setMoneda(Monedas moneda) {
		this.moneda = moneda;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
