package Tests;


import org.junit.Test;

import exercises10.BlankNameException;
import exercises10.InvalidDayException;
import exercises10.InvalidMonthException;
import exercises10.InvalidPriorityException;
import exercises10.NameNotUniqueException;
import exercises10.Task;
import exercises10.TodoList;


public class Ex10TaskTest {

	@Test(expected=BlankNameException.class)
	public void setNameTest() throws BlankNameException {
		new Task("");
	}
	
	@Test(expected=InvalidPriorityException.class)
	public void setPriorityInvalidTest() throws BlankNameException, InvalidPriorityException {
		Task task = new Task("Test");
		task.setPriority("invalid");
	}
	
	@Test(expected=InvalidMonthException.class)
	public void setMonthInvalidTest() throws BlankNameException, InvalidMonthException, InvalidDayException {
		Task task = new Task("Test");
		task.setDueDate("invalid", "5");
	}
	
	@Test(expected=InvalidDayException.class)
	public void setDayInvalidTest() throws BlankNameException, InvalidDayException, InvalidMonthException {
		Task task = new Task("Test");
		task.setDueDate("January", "invalid");
	}
	
	@Test(expected=InvalidMonthException.class)
	public void shouldThrowInvalidMonthExceptionFirstTest() throws BlankNameException, InvalidDayException, InvalidMonthException {
		Task task = new Task("Test");
		task.setDueDate("invalid", "invalid");
	}
	
	@Test(expected=NameNotUniqueException.class)
	public void nameNotUniqueTest() throws NameNotUniqueException, InvalidPriorityException, InvalidMonthException, InvalidDayException, BlankNameException {
		TodoList todoList = new TodoList();
		
		todoList.addTask("Test", "0", "January", "1");
		todoList.addTask("Test", "0", "January", "1");
	}
}
