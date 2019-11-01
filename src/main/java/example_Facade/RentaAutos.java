package example_Facade;

public class RentaAutos {
	private String disponibilidad;
	private String date;
	
	public RentaAutos(String disponibilidad, String date) {
		this.disponibilidad = disponibilidad;
	}
	
	public void rentACar() {
		System.out.println("Rentas disponibles " + this.disponibilidad);
	}
}
