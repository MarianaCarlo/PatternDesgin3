package example_Adapter;

public class AdaptadorSeguridad implements IPersona{
	// AQUI VA EL PATRON DE DISEÑO
	private Seguridad seguridad = new Seguridad();
	private int edad;

	public AdaptadorSeguridad(Seguridad seguridad) {
		super();
		this.seguridad = seguridad;
	}

	@Override
	public int getEdad() {
		edad = this.seguridad.calcularEdad();
		return edad;
	}

	@Override
	public void setEdad(int edad) {
		edad = this.seguridad.calcularEdad();
	}

}
