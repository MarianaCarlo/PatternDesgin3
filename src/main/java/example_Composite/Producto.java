package example_Composite;

public class Producto extends Component {

	public Producto(String nombre) {
		super(nombre);
	}

	@Override
	public void imprimir() {
		System.out.println("\t Leaf: " + this.getAttribute());

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
		System.out.println("\t Leaf: " + this.getAttribute());

	}

}
