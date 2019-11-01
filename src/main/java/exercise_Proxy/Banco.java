package exercise_Proxy;

public class Banco implements IBanco {
	Accion request;
	private int cantidad = 100;

	public Banco(Accion request) {
		super();
		this.request = request;
	}

	@Override
	public void depositar() {
		System.out.println("Request real subject depositar: " + this.request.getNombre() + " " + this.request.getMoneda());
		int res = request.getCantidad()+cantidad;
		System.out.println("Saldo: " + res);
	}

	@Override
	public void retirar() {
		System.out.println("Request real subject retirar: " + this.request.getNombre() + " " + this.request.getMoneda());
		int res = cantidad - request.getCantidad();
		if (res >= 0) {
			System.out.println("Saldo: " + res); 
		} else {
			System.out.println("Tu monto de retiro sobrepasa la cantidad base");
		}
		
	}

	public Accion getRequest() {
		return request;
	}

	public void setRequest(Accion request) {
		this.request = request;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
