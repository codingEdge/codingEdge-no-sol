package exercises10;

@SuppressWarnings("serial")
public class InvalidMonthException extends Exception {
	
	public InvalidMonthException() { 
		super();
	}
	
	public InvalidMonthException(String message) {
		super(message);
	}

}
