package pDecorator;

public class Client {

	public static void main(String[] args) {
		IComponent objectConcrete = new ComponentConcrete();
		objectConcrete = new DecoratorConcreateA(objectConcrete);
		objectConcrete = new DecoratorConcreateB(objectConcrete);
		
		objectConcrete.operation();

	}

}
