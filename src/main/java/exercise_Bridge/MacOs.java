package exercise_Bridge;

public class MacOs implements IPlataforma {
	private IArquitectura arquitectura;
	
	public MacOs(IArquitectura arquitectura) {
		super();
		this.arquitectura = arquitectura;
	}

	@Override
	public void usarSO() {
		System.out.println("Usando SO MAC");
		this.arquitectura.usarArquitectura();
	}

}
