package es.everis.training.exceptions;

public class ValidationException extends ApplicationException {

	private static final long serialVersionUID = 1L;
	
	public ValidationException(String message) {
		super(message);
	}
	
	public ValidationException(Exception ex) {
		super(ex);
	}

}
