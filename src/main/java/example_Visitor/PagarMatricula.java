package example_Visitor;

public class PagarMatricula implements IVisitor{

	@Override
	public double visit(Estudiante estudiante) {
		estudiante.setDescuento(100);
		estudiante.getDescuento();
		int rest = (int) (estudiante.descuento*0.13);
		System.out.println("Descuento 13%: "+ rest);
		return estudiante.getDescuento()-rest;
	}

	@Override
	public double visit(Director director) {
		director.setDescuento(50);
		director.getDescuento();
		System.out.println("Descuento 13%: " + director.descuento*0.13);
		return director.descuento*0.87;
	}

}
