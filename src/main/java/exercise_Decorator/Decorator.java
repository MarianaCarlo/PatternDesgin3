package exercise_Decorator;

public abstract class Decorator implements IComputadora {
	private IComputadora componente;

	public Decorator(IComputadora componente) {
		super();
		this.componente = componente;
	}

	@Override
	public void operation() {
		componente.operation();

	}

}
