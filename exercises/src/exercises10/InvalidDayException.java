package exercises10;

@SuppressWarnings("serial")
public class InvalidDayException extends Exception {
	
	public InvalidDayException() { 
		super();
	}
	
	public InvalidDayException(String message) {
		super(message);
	}

}
