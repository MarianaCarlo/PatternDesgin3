package exercise_Visitor;

public class IVA implements IVisitor {

	@Override
	public double visit(ProductosNormales prodNormales) {
		prodNormales.setPrecio(50);
		prodNormales.getPrecio();
		double cantIVA = 5;
		System.out.println("Precio"+prodNormales.getPrecio()+" Descuento: 0");
		double iva = prodNormales.getPrecio()+cantIVA;
		return iva;
	}

	@Override
	public double visit(ProductosDescuento prodDescuento) {
		prodDescuento.setPrecio(100);
		double descuento=10;
		prodDescuento.setDescuento(descuento);
		System.out.println("Precio: "+prodDescuento.getPrecio() +" Descuento: " + prodDescuento.getDescuento());
		double canIVA = 5;
		double res = (prodDescuento.getPrecio()-prodDescuento.getDescuento());
		System.out.println("res Descuento:" + res);
		double porcent = res*0.05;
		System.out.println("Porcent:" + porcent);
		return res+porcent;
	}

	@Override
	public double visit(ProductosSobreprecio prodSobreprecio) {
		prodSobreprecio.setPrecio(100);
		double sobreprecio=10;
		prodSobreprecio.setAdicion(sobreprecio);
		System.out.println("Precio: "+prodSobreprecio.getPrecio() +" sSobreprecio: " + prodSobreprecio.getAdicion());
		double canIVA = 5;
		double res = prodSobreprecio.getPrecio()+prodSobreprecio.getAdicion();
		//return res+canIVA;
		System.out.println("res aumento:" + res);
		double porcent = res*0.05;
		System.out.println("Porcent:" + porcent);
		return res+porcent;
	}

}
