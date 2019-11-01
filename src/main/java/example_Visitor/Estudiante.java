package example_Visitor;

public class Estudiante implements IPersona {
	public int descuento=50;
	public int descuento13=13;
	
	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	public int getDescuento13() {
		return descuento13;
	}

	public void setDescuento13(int descuento13) {
		this.descuento13 = descuento13;
	}

	@Override
	public double accept(IVisitor visitor) {
		//visitor.visit(this);
		return visitor.visit(this);
	}

}
