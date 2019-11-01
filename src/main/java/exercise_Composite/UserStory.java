package exercise_Composite;

public class UserStory extends Component {
	public Task task;

	public UserStory(String nombre, Task task) {
		super(nombre);
		this.task = task;
	}

	@Override
	public void imprimir() {
		System.out.println("\t UserStory: " + this.getAttribute() );
		task.getChild(0);
		task.getChild(1);
		task.getChild(2);

	}

	@Override
	public void add(Component component) {
		System.out.println("not applicable on UserStory");

	}

	@Override
	public void remove(Component component) {
		System.out.println("not applicable on UserStory");

	}

	@Override
	public void getChild(int position) {
		System.out.println("\t UserStory: " + this.getAttribute() );
	}

}
