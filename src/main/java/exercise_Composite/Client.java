package exercise_Composite;

public class Client {

	public static void main(String[] args) {
		Composite subtask = new Composite("my subtask");
		
		int[] cant = {2,4,6};
		Item item1 = new Item("Item1", cant[0]);
		Item item2 = new Item("Item2", cant[1]);
		Item item3 = new Item("Item3", cant[2]);
		subtask.setSum(cant);

		subtask.add(item1);
		subtask.add(item2);
		subtask.add(item3);
		//subtask.imprimir();
		
		Composite task = new Composite("my task");
		Subtask subtask1 = new Subtask("subtask", item1);
		Subtask subtask2 = new Subtask("subtask", item2);
		Subtask subtask3 = new Subtask("subtask", item3);
		task.add(subtask1);
		task.add(subtask2);
		task.add(subtask3);

		Composite ustory = new Composite("my user story");
		Task task1 = new Task("task1", subtask1);
		Task task2 = new Task("task2", subtask1);
		Task task3 = new Task("task3", subtask1);
		ustory.add(task1);
		ustory.add(task2);
		ustory.add(task3);

		ustory.imprimir();  

		
		
		
		
		
		subtask.imprimir();
	}

}
