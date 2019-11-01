package exercise_Visitor;

public interface IVisitor {
	public double visit(ProductosNormales prodNormales);
	public double visit(ProductosDescuento prodDescuento);
	public double visit(ProductosSobreprecio prodSobreprecio);
}
