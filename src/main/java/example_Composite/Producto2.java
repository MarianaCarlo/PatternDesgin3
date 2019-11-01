package example_Composite;

public class Producto2 extends Component {

	public Producto2(String nombre) {
		super(nombre);
	}

	@Override
	public void imprimir() {
		System.out.println("\t\t Leaf: " + this.getAttribute());

	}

	@Override
	public void add(Component component) {
		System.out.println("not applicable on Product");

	}

	@Override
	public void remove(Component component) {
		System.out.println("not applicable on Product");

	}

	@Override
	public void getChild(int position) {
		System.out.println("\t \t Leaf: " + this.getAttribute());

	}

}
