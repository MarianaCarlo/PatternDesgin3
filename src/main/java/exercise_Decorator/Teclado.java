package exercise_Decorator;

public class Teclado extends Decorator {
	private String attribute1;  
	private int precio;
	private String tipo;

	public Teclado(IComputadora componente, String tipo,int precio) {
		super(componente);
		this.tipo = tipo;
		this.precio = precio;
	}

	public void operation() {
		super.operation();
		this.attribute1 = "Teclado ";
		this.getPrecio();
		System.out.println("Adding " + attribute1 + this.getTipo() + " "+this.getPrecio());
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
