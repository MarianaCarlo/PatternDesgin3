package example_Adapter;

public class AdaptadorDocente implements IPersona{
	// AQUI VA EL PATRON DE DISEÑO
	private Docente docente = new Docente();
	private int edad;

	public AdaptadorDocente(Docente docente) {
		super();
		this.docente = docente;
	}

	@Override
	public int getEdad() {
		edad = this.docente.calcularEdad();
		return edad;
	}

	@Override
	public void setEdad(int edad) {
		edad = this.docente.calcularEdad();
	}

}
