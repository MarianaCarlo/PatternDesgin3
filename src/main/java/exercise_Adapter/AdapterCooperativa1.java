package exercise_Adapter;

public class AdapterCooperativa1 implements IBanco {
	private Cooperativa1 cooperativa1 = new Cooperativa1();
	public int monto;
	
	public AdapterCooperativa1(Cooperativa1 cooperativa1) {
		super();
		this.cooperativa1 = cooperativa1;
	}

	@Override
	public int getPrestamo() {
		return monto;
	}

	@Override
	public void setPrestamo(int prestamo) {
	}

	@Override
	public void prestamo(int monto) {
		int dolares = monto*7;
		cooperativa1.credito(dolares);
		
	}

}
