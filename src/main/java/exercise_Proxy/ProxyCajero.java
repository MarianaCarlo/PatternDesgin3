package exercise_Proxy;

public class ProxyCajero implements IBanco {
	private Accion request;
	private Banco banco = null;
	
	public ProxyCajero(Accion request) {
		this.request = request;
	}
	
	@Override
	public void depositar() {
		Monedas monedas = this.request.getMoneda();
		if (banco == null) {
			this.banco = new Banco(request);
		}
		Moneda moneda;
		switch (monedas) {
		case Boliviano:
			moneda = new Boliviano();
			this.banco.depositar();
			break;
		case Dolar:
			moneda = new Dolar();
			System.out.println("Por favor cambia tu dinero a bolivianos");
			break;
		case Euro:
			moneda = new Euro();
			System.out.println("Por favor cambia tu dinero a bolivianos");
			break;
		default:
			moneda = new Boliviano();
			this.banco.depositar(); 
			break;
		}
	}

	@Override
	public void retirar() {
		Monedas monedas = this.request.getMoneda();
		if (banco == null) {
			this.banco = new Banco(request);
		}
		Moneda moneda;
		switch (monedas) {
		case Boliviano:
			moneda = new Boliviano();
			this.banco.retirar();
			break;
		case Dolar:
			moneda = new Dolar();
			System.out.println("Por favor cambia tu dinero a bolivianos");
			break;
		case Euro:
			moneda = new Euro();
			System.out.println("Por favor cambia tu dinero a bolivianos");
			break;
		default:
			moneda = new Boliviano();
			break;
		}
	}

}
