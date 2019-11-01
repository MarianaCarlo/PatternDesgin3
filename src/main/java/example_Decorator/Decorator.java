package example_Decorator;

public abstract class Decorator implements Ide {
	private Ide componente;

	public Decorator(Ide componente) {
		super();
		this.componente = componente;
	}

	@Override
	public void operation() {
		componente.operation();

	}

}
