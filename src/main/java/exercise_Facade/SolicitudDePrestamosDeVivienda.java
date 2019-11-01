package exercise_Facade;

public class SolicitudDePrestamosDeVivienda {
	private String nombre;
	private Bancos encontrarBanco;
	private Cooperativas encontrarCooperativa;
	private FondosFinancieros encontrarFondosF;
	private Abogados encontrarAbogado;
	private Notarios encontrarNotario;
	private Arquitectos encontrarArquitecto;
	
	public SolicitudDePrestamosDeVivienda(String nombre) {
		encontrarBanco = new Bancos();
		encontrarCooperativa = new Cooperativas();
		encontrarFondosF = new FondosFinancieros();
		encontrarAbogado = new Abogados();
		encontrarNotario = new Notarios();
		encontrarArquitecto = new Arquitectos();
		this.nombre = nombre;
	}
	
	public void findSolicitud() {
		System.out.println("Hola " + this.getNombre() + " encontramos la siguiente solicitud:");
		encontrarBanco.findBanco();
		encontrarCooperativa.findCoop();
		encontrarFondosF.findFFP();
		encontrarAbogado.findAbogado();
		encontrarNotario.findNotario();
		encontrarArquitecto.findArquitecto();
	}

	public String getNombre() {
		return nombre;
	}
	
	
}
