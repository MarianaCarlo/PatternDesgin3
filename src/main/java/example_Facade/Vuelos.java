package example_Facade;

public class Vuelos {
	private String disponibilidad;
	private String date;
	
	public Vuelos(String disponibilidad, String date) {
		this.disponibilidad = disponibilidad;
		this.date = date;
	}
	
	public void findFly() {
		System.out.println("Buscando Vuelos " + this.disponibilidad + " date: " + this.date);
	}
}
