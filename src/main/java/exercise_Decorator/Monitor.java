package exercise_Decorator;

public class Monitor extends Decorator {
	public int precio;
	public String tipo;

	public Monitor(IComputadora componente, String tipo,int precio) {
		super(componente);
		this.tipo = tipo;
		this.precio = precio;
	}

	public void operation() {
		super.operation();
		addedBehavior();
		System.out.println("Monitor " + this.getPrecio());
	}

	public void addedBehavior() {
		System.out.println("Add new Behavior of Monitor");
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
