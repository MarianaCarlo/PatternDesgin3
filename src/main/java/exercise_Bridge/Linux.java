package exercise_Bridge;

public class Linux implements IPlataforma {
	private IArquitectura arquitectura;
	
	public Linux(IArquitectura arquitectura) {
		super();
		this.arquitectura = arquitectura;
	}


	@Override
	public void usarSO() {
		System.out.println("Usando SO Linux");
		this.arquitectura.usarArquitectura();
	}

}
