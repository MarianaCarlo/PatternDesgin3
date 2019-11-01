package exercise_Composite;

public class Subtask extends Component {
	public Item item;
	public Composite comp;

	public Subtask(String nombre, Item item) {
		super(nombre);
		this.item = item;
	}

	@Override
	public void imprimir() {
		System.out.println("\t \t \t Subtask: " + this.getAttribute());
		this.getChild(0);
	}

	public void meth2() {
		comp.getSum();
		for (int i = 0; i < comp.sum.length; i++) {
			comp.total += comp.sum[i];
		}
		int contador = comp.total;
		System.out.println("total: " + contador);
	}

	@Override
	public void add(Component component) {
		System.out.println("not applicable on Subtask");

	}

	@Override
	public void remove(Component component) {
		System.out.println("not applicable on Subtask");

	}

	@Override
	public void getChild(int position) {
		System.out.println("\t \t \t Subtask: " + this.getAttribute());

	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Composite getComp() {
		return comp;
	}

	public void setComp(Composite comp) {
		this.comp = comp;
	}

}
