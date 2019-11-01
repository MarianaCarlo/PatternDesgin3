package exercise_Visitor;

public class Client {

	public static void main(String[] args) {
		ProductosNormales prodNormales = new ProductosNormales();
		ProductosDescuento prodDescuento = new ProductosDescuento();
		ProductosSobreprecio prodSobreprecio = new ProductosSobreprecio();
		
		IVA visitor = new IVA();
		System.out.println("prod Normales: " + prodNormales.accept(visitor));
		System.out.println("prod descuento: " + prodDescuento.accept(visitor));
		System.out.println("prod sobreprecio:" + prodSobreprecio.accept(visitor));
	}

}
