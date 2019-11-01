package pDecorator;

public class DecoratorConcreateB extends Decorator {
	
	public DecoratorConcreateB(IComponent componente) {
		super(componente);
	}
	
	public void operation() {
		super.operation();
		addedBehavior();
		System.out.println("Decorator B" );
	}
	
	public void addedBehavior() {
		System.out.println("Add new Behavior");
	}

}
