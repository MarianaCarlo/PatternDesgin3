package example_Visitor;

public class Director implements IPersona {
	public String nombre;
	
	public int descuento=10;
	public int descuento13=13;
	
	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDescuento13() {
		return descuento13;
	}

	public void setDescuento13(int descuento13) {
		this.descuento13 = descuento13;
	}

	@Override
	public double accept(IVisitor visitor) {
		
		return visitor.visit(this);
	}

}
