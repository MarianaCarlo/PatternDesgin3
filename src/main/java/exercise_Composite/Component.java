package exercise_Composite;

public abstract class Component {
	private String name;

	public Component(String name) {
		this.name = name;
		System.out.println("Constructor " + name);
	}

	public String getAttribute() {
		return name;
	}
	
	public abstract void imprimir();
	public abstract void add(Component component);
	public abstract void remove(Component component);
	public abstract void getChild(int position); 
	
}
