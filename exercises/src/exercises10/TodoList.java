package exercises10;

import java.util.ArrayList;
import java.util.List;


/* A list of Tasks
 * 
 * */
public class TodoList {

	// Fields
	private List<Task> tasks;
	
	public TodoList() {
		this.tasks = new ArrayList<Task>();
	}
	
	public List<Task> getTasks() {
		return this.tasks;
	}
	
	// STUDENT-TODO
	/* Given the name of a task, first check if the name is unique.  If not,
	 * throw an NameNotUniqueException.  Otherwise, create a new task and add
	 * it to this task list.
	 * */
	public void addTask(String name, String priority, String month, String day)
			throws NameNotUniqueException, InvalidPriorityException, InvalidMonthException, InvalidDayException, BlankNameException {

		for (Task task: this.tasks) {
			if (task.getName().equals(name)) {
				throw new NameNotUniqueException();
			}
		}

		Task newTask = new Task(name, priority, month, day);
		this.tasks.add(newTask);
	}
	
	public String[][] toStringArray() {
		String[][] tabularData = new String[this.tasks.size()][3];
		Task task;
		for (int i = 0; i < this.tasks.size(); i++) {
			task = this.tasks.get(i);
			tabularData[i][0] = task.getName();
			tabularData[i][1] = Integer.toString(task.getPriority());
			tabularData[i][2] = task.getDueMonth() + " " + Integer.toString(task.getDueDay());
		}
		return tabularData;
	}
}
