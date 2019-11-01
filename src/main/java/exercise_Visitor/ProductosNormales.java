package exercise_Visitor;

public class ProductosNormales implements IProduct {
	public int precio;
	public int descuento = 0;

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	@Override
	public double accept(IVisitor visitor) {
		return visitor.visit(this);
	}

}
