package exercises10;

/* A Task that can be added to your Todo List.
 * 
 * */
public class Task {

	// Fields
	private String name;
	private int priority;
	private String dueMonth;
	private int dueDay;

	// Constructors
	public Task(String name) throws BlankNameException {
		this.setName(name);
		this.priority = 0;
		this.dueMonth = "January";
		this.dueDay = 1;
	}

	public Task(String name, String priority, String dueMonth, String dueDay) throws InvalidPriorityException,
			InvalidMonthException, InvalidDayException, BlankNameException {
		this.setName(name);
		this.setPriority(priority);
		this.setDueDate(dueMonth, dueDay);
	}

	// Methods
	public String getName() {
		return name;
	}

	public void setName(String name) throws BlankNameException {
		if (name.equals("")) {
			throw new BlankNameException();
		}
		this.name = name;
	}

	public int getPriority() {
		return priority;
	}

	// STUDENT-TODO
	/*
	 * Given an integer, set the this tasks priority to this value. If the given
	 * priority is negative, throw an InvalidPriorityException
	 */
	public void setPriority(int priority) throws InvalidPriorityException {
		if (priority < 0) {
			throw new InvalidPriorityException();
		}
		this.priority = priority;
	}

	public void setPriority(String priority) throws InvalidPriorityException {
		int priorityInt;
		try {
			priorityInt = Integer.parseInt(priority);
		} catch (NumberFormatException e) {
			throw new InvalidPriorityException();
		}
		this.setPriority(priorityInt);
	}

	public String getDueMonth() {
		return dueMonth;
	}

	// STUDENT-TODO
	/*
	 * Given a string, set the due month of the task if the string represents a
	 * valid month. Examples of valid months may be "1", "january", or "jan".
	 * You should ignore the case of the input string.
	 * 
	 * When setting the month, the full name of the month should be used
	 * starting with a capital. For example, this.dueMonth = "January"
	 */
	private void setDueMonth(String dueMonth) throws InvalidMonthException {
		dueMonth = dueMonth.toLowerCase();
		if (dueMonth.equals("1") || dueMonth.equals("jan") || dueMonth.equals("january")) {
			this.dueMonth =  "January";
		} else if (dueMonth.equals("2") || dueMonth.equals("feb") || dueMonth.equals("february")) {
			this.dueMonth =  "February";
		} else if (dueMonth.equals("3") || dueMonth.equals("mar") || dueMonth.equals("march")) {
			this.dueMonth =  "March";
		} else if (dueMonth.equals("4") || dueMonth.equals("apr") || dueMonth.equals("april")) {
			this.dueMonth =  "April";
		} else if (dueMonth.equals("5") || dueMonth.equals("may")) {
			this.dueMonth =  "May";
		} else if (dueMonth.equals("6") || dueMonth.equals("jun") || dueMonth.equals("june")) {
			this.dueMonth =  "June";
		} else if (dueMonth.equals("7") || dueMonth.equals("jul") || dueMonth.equals("july")) {
			this.dueMonth =  "July";
		} else if (dueMonth.equals("8") || dueMonth.equals("aug") || dueMonth.equals("august")) {
			this.dueMonth =  "August";
		} else if (dueMonth.equals("9") || dueMonth.equals("sep") || dueMonth.equals("september")) {
			this.dueMonth =  "September";
		} else if (dueMonth.equals("10") || dueMonth.equals("oct") || dueMonth.equals("october")) {
			this.dueMonth =  "October";
		} else if (dueMonth.equals("11") || dueMonth.equals("nov") || dueMonth.equals("november")) {
			this.dueMonth =  "November";
		} else if (dueMonth.equals("12") || dueMonth.equals("dec") || dueMonth.equals("december")) {
			this.dueMonth =  "December";
		} else {
			throw new InvalidMonthException();
		}
	}

	public int getDueDay() {
		return dueDay;
	}

	// STUDENT-TODO
	/*
	 * Given a dueDay represented as an integer, set the due day of this task to
	 * this integer. We assume that this.dueMonth is already set.
	 */
	private void setDueDay(int dueDay) throws InvalidDayException {
		if (dueDay < 1) {
			throw new InvalidDayException();
		}
		switch (this.dueMonth) {
		case "January":
			if (dueDay > 31) {
				throw new InvalidDayException("January");
			}
		case "February":
			 if (dueDay > 28) {
				 throw new InvalidDayException("February");
			 }
			 break;
		case "March":
			 if (dueDay > 31) {
				 throw new InvalidDayException("March");
			 }
			 break;
		case "April":
			 if (dueDay > 30) {
				 throw new InvalidDayException("April");
			 }
			 break;
		case "May":
			 if (dueDay > 31) {
				 throw new InvalidDayException("May");
			 }
			 break;
		case "June":
			 if (dueDay > 30) {
				 throw new InvalidDayException("June");
			 }
			 break;
		case "July":
			 if (dueDay > 31) {
				 throw new InvalidDayException("July");
			 }
			 break;
		case "August":
			 if (dueDay > 31) {
				 throw new InvalidDayException("August");
			 }
			 break;
		case "September":
			 if (dueDay > 30) {
				 throw new InvalidDayException("September");
			 }
			 break;
		case "October":
			 if (dueDay > 31) {
				 throw new InvalidDayException("October");
			 }
			 break;
		case "November":
			 if (dueDay > 30) {
				 throw new InvalidDayException("November");
			 }
			 break;
		case "December":
			 if (dueDay > 31) {
				 throw new InvalidDayException("December");
			 }
			 break;
		}
		this.dueDay = dueDay;
	}

	/*
	 * It is easier to work with dueDays when they are represented as integers.
	 * This will convert the string input from our application to an integer. If
	 * the string we recieve is not a valid number, we throw an
	 * InvalidDayException.
	 */
	private void setDueDay(String dueDay) throws InvalidDayException {
		int dayInt;
		try {
			dayInt = Integer.parseInt(dueDay);
		} catch (NumberFormatException e) {
			throw new InvalidDayException();
		}
		this.setDueDay(dayInt);
	}

	/*
	 * Given two strings representing the month and day, set the due month and
	 * due day of this task.
	 * 
	 * The methods setDueMonth and setDueDay throw InvalidMonthException and
	 * InvalidDayException respectively if their inputs are invalid.
	 * 
	 * Note that since determining whether or not the day is valid or invalid is
	 * dependent on the month, we attempt to set the month first.
	 */
	public void setDueDate(String month, String day) throws InvalidMonthException, InvalidDayException {
		this.setDueMonth(month);
		this.setDueDay(day);
	}

}
