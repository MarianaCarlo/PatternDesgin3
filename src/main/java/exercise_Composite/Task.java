package exercise_Composite;

public class Task extends Component {
	public Subtask subtask;

	public Task(String nombre, Subtask substask) {
		super(nombre);
		this.subtask = substask;
	}

	@Override
	public void imprimir() {
		System.out.println("\t \t Task: " + this.getAttribute() );
		subtask.getChild(0);
		subtask.getChild(1);
		subtask.getChild(2);

	}

	@Override
	public void add(Component component) {
		System.out.println("not applicable on Task");

	}

	@Override
	public void remove(Component component) {
		System.out.println("not applicable on Task");

	}

	@Override
	public void getChild(int position) {
		System.out.println("\t \t Task: " + this.getAttribute());

	}

}
