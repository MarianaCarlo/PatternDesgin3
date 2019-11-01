package pComposite;

public class Leaf2 extends Component {

	public Leaf2(String attribute) {
		super(attribute);
	}

	@Override
	public void operation() {
		System.out.println("\t Leaf 2: " + this.getAttribute());

	}

	@Override
	public void add(Component component) {
		System.out.println("not applicable on Leaf");

	}

	@Override
	public void remove(Component component) {
		System.out.println("not applicable on Leaf");

	}

	@Override
	public void getChild(int position) {
		System.out.println("\t Leaf 2: " + this.getAttribute());

	}

}
