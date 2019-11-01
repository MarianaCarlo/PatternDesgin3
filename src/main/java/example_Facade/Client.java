package example_Facade;

public class Client {

	public static void main(String[] args) {
		
		AgenciaDeViajes agencia = new AgenciaDeViajes("abc", "octubre");
		agencia.find();
		/*Hoteles enconctrarHotel1 = new Hoteles("abc");
		RentaAutos encontrarAuto = new RentaAutos("auto", "noviembre");
		Seguro encontrarSeguro = new Seguro("20bs", "mayo");
		Vuelos encontrarVuelo = new Vuelos("abc", "octubre");
		
		enconctrarHotel1.findHotel();
		encontrarAuto.rentACar();
		encontrarSeguro.amount();
		encontrarVuelo.findFly();*/

	}

}
