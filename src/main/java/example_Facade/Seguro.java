package example_Facade;

public class Seguro {
	private String precio;
	private String date;
	
	public Seguro(String precio,String date) {
		this.precio = precio;
	}
	
	public void amount() {
		System.out.println("Precio seguro: " + this.precio);
	}
}
