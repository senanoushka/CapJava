package exception_handling;

public class InvalidPinException extends RuntimeException{    //extends Exception will throw error
	private String message;
	
	public InvalidPinException(String message) {
		this.message=message;
	}
	public String getMessage() {
		return message;
	}

}
