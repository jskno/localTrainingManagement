package es.everis.training.exceptions;

public class ApplicationException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ApplicationException(String message) {
		super(message); 
	}
	
	public ApplicationException(Exception ex) {
		super(ex);
	}
	
	

}
