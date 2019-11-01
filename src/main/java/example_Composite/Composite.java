package example_Composite;

import java.util.ArrayList;

public class Composite extends Component {
	private ArrayList<Component> list = new ArrayList<>();
	
	public Composite(String name) {
		super(name);
	}
	
	@Override
	public void imprimir() {
		for (Component component : list) {
			component.imprimir();
		}
		

	}

	@Override
	public void add(Component component) {
		list.add(component);

	}

	@Override
	public void remove(Component component) {
		list.remove(component);

	}

	@Override
	public void getChild(int position) {
		System.out.println(list.get(position).getAttribute());

	}

}
