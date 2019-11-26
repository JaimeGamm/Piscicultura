package exceptions;

public class NoExistException extends Exception{
	
    private static final long serialVersionUID = 1L;
    public static final String MESSAGE_NOT_FOUND = "El id del corredor no existe";
    
    public NoExistException() {
	super( MESSAGE_NOT_FOUND );
    }
}
