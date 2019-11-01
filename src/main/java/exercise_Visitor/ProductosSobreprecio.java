package exercise_Visitor;

public class ProductosSobreprecio implements IProduct {
	public int precio;
	public double adicion = 0.50;

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public double getAdicion() {
		return adicion;
	}

	public void setAdicion(double adicion) {
		this.adicion = adicion;
	}

	@Override
	public double accept(IVisitor visitor) {
		return visitor.visit(this);
	}

}
