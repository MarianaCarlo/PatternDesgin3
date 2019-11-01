package exercise_Facade;

public class Client1 {

	public static void main(String[] args) {
		Bancos encontrarBanco = new Bancos();
		Cooperativas encontrarCooperativa = new Cooperativas();
		FondosFinancieros encontrarFondosF = new FondosFinancieros();
		Abogados encontrarAbogado = new Abogados();
		Notarios encontrarNotario = new Notarios();
		Arquitectos encontrarArquitecto = new Arquitectos();
		
		encontrarBanco.findBanco();
		encontrarCooperativa.findCoop();
		encontrarFondosF.findFFP();
		encontrarAbogado.findAbogado();
		encontrarNotario.findNotario();
		encontrarArquitecto.findArquitecto();
		

	}

}
