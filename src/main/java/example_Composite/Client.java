package example_Composite;

public class Client {

	public static void main(String[] args) {
		Composite kitDeProducto1 = new Composite("kit de producto1");
		kitDeProducto1.add(new Producto("Product1"));
		kitDeProducto1.add(new Producto("Product2"));
		kitDeProducto1.add(new Producto("Product3"));
		
		Composite kitDeProducto2 = new Composite("kit de producto2"); 
		kitDeProducto2.add(new Producto2("Product1"));
		kitDeProducto2.add(new Producto2("Product2"));
		kitDeProducto2.add(new Producto2("Product3"));
		
		Composite boxProduct = new Composite("box Product");
		boxProduct.add(kitDeProducto1);
		boxProduct.add(kitDeProducto2);
		
		boxProduct.imprimir();
	}

}
