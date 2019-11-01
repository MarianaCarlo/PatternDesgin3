package example_Bridge;

public class Circulo implements IFigura {
	private IColor color;

	public Circulo(IColor color) {
		super();
		this.color = color;
	}

	@Override
	public void dibujar() {
		System.out.println("Dibujando");
		color.pintar();
	}

}
