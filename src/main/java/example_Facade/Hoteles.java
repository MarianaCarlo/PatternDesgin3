package example_Facade;

public class Hoteles {
	private String disponibilidad;
	
	public Hoteles(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	
	public void findHotel() {
		System.out.println("Buscando Hotel " + this.disponibilidad);
	}
}
