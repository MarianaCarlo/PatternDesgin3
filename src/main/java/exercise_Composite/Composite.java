package exercise_Composite;

import java.util.ArrayList;

public class Composite extends Component {
	private ArrayList<Component> list = new ArrayList<>();
	public int[] sum = new int[3];
	public Subtask subtask;
	public Item item;
	public Task task;
	public Component component;
	public int total = 0;
	public int totales = 0;

	public Composite(String name) {
		super(name);
	}

	@Override
	public void imprimir() {
		for (Component component : list) {
			component.imprimir();
		}
		if (this.getComponent() == this.getSubtask()) {
			this.meth2();
		} 
		if (this.getComponent() == this.getItem()) {
			this.meth();
		} 
		if (this.getComponent() == this.getTask()) {
			this.meth3();
		}

	}

	public void meth() {
		int cs = this.getTotal();
		totales = cs*sum.length;
		System.out.println("total subtask: " + totales);
		this.setTotales(totales);

	}

	public void meth2() {
		if (this.getComponent() == this.getSubtask()) {
			this.getSum();
			this.getSubtask();
			for (int i = 0; i < sum.length; i++) {
				total += sum[i];
			}
			int contador = total;
			System.out.println("total Task: " + contador);
			this.setTotal(contador);
		}

	}

	public void meth3() {
		this.getTotales();
		int tt = this.getTotales()*sum.length;
		System.out.println("total UserStory: " + tt);

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

	public int[] getSum() {
		return sum;
	}

	public void setSum(int[] sum) {
		this.sum = sum;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Subtask getSubtask() {
		return subtask;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Component getComponent() {
		return component;
	}

	public void setComponent(Component component) {
		this.component = component;
	}

	public void setSubtask(Subtask subtask) {
		this.subtask = subtask;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public int getTotales() {
		return totales;
	}

	public void setTotales(int totales) {
		this.totales = totales;
	}
	
	

}
