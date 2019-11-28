package exceptions;

public class EmptyFieldsException extends Exception {
    
    private static final long serialVersionUID = 1L;
    public static final String MESSAGE_NOT_FOUND = "Debe completar todos los campos requeridos";
	
    public EmptyFieldsException() { 
    	super( MESSAGE_NOT_FOUND );
    }
}
