package example_Facade;

public class AgenciaDeViajes {
	//Facade
	private Hoteles enconctrarHotel1;
	private RentaAutos encontrarAuto;
	private Seguro encontrarSeguro;
	private Vuelos encontrarVuelo;
	
	public AgenciaDeViajes(String disponibilidad, String date) {
		enconctrarHotel1 = new Hoteles(disponibilidad);
		encontrarAuto = new RentaAutos(disponibilidad, date);
		encontrarSeguro = new Seguro(disponibilidad, date);
		encontrarVuelo = new Vuelos(disponibilidad, date);
	}
	
	public void find() {
		enconctrarHotel1.findHotel();
		encontrarAuto.rentACar();
		encontrarSeguro.amount();
		encontrarVuelo.findFly();
	}
}
