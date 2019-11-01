package exercise_Bridge;

public class Windows implements IPlataforma {
	private IArquitectura arquitectura;

	public Windows(IArquitectura arquitectura) {
		super();
		this.arquitectura = arquitectura;
	}

	@Override
	public void usarSO() {
		System.out.println("Usando SO Windows");
		this.arquitectura.usarArquitectura();
	}

}
