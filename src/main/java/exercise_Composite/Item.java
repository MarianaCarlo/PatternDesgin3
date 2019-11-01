package exercise_Composite;

public class Item extends Component {
	public int estimacion;

	public Item(String nombre, int estimacion) {
		super(nombre);
		this.estimacion = estimacion;
	}

	@Override
	public void imprimir() {
		System.out.println("\t Item: " + this.getAttribute() + " " + this.getEstimacion());
	}

	@Override
	public void add(Component component) {
		System.out.println("not applicable on Item");

	}

	@Override
	public void remove(Component component) {
		System.out.println("not applicable on Item");

	}

	@Override
	public void getChild(int position) {
		System.out.println("\t Item: " + this.getAttribute() + " " + this.getEstimacion());

	}

	public int getEstimacion() {
		return estimacion;
	}

	
	
}
