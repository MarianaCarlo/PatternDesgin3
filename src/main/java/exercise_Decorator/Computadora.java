package exercise_Decorator;

public class Computadora implements IComputadora {
	public int precio = 100;
	public int total = 0;

	@Override
	public void operation() {
		System.out.println("Operation Component Computadora " + this.getPrecio());
	}
	

	@Override
	public int getPrecio() {
		return precio;
	}

}
