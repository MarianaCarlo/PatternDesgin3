package pDecorator;

public class DecoratorConcreateA extends Decorator {
	private String attribute1;
	
	public DecoratorConcreateA(IComponent componente) {
		super(componente);
	}
	
	public void operation() {
		super.operation();
		this.attribute1 = "Nueva propiedad";
		System.out.println("Adding decorator " + attribute1);
	}

}
