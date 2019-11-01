package exercise_Adapter;

public class Cooperativa1 implements ICooperativas {
	private int montoDolares;
	private int valorDolar = 7;

	public int getMontoDolares() {
		return montoDolares;
	}

	public void setMontoDolares(int montoDolares) {
		this.montoDolares = montoDolares;
	}

	@Override
	public void credito(int monto) {
		int bs = monto/7;
		//valorDolar * montoDolares;
		VentanillaSingleton.getInstance().realizarPrestamos(bs);
	}


}
