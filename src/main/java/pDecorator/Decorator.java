package pDecorator;

public abstract class Decorator implements IComponent {
	private IComponent componente;

	public Decorator(IComponent componente) {
		super();
		this.componente = componente;
	}

	@Override
	public void operation() {
		componente.operation();

	}

}
