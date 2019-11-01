package exercise_Visitor;

public class ProductosDescuento implements IProduct {
	public int precio;
	public double descuento = 0.10;

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	@Override
	public double accept(IVisitor visitor) {
		return visitor.visit(this);
	}

}
