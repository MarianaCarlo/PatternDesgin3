package exercise_Decorator;

public class TarjetaVideo extends Decorator {
	public int precio;
	public String tipo;
 
	public TarjetaVideo(IComputadora componente, String tipo, int precio) {
		super(componente);
		this.tipo = tipo;
		this.precio = precio;
	}

	public void operation() {
		super.operation();
		addedBehavior();
		System.out.println("Tarjeta Video " + this.getTipo() + " "+this.getPrecio());
	}

	public void addedBehavior() {
		System.out.println("Add new Behavior of Tarjeta Video");
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
