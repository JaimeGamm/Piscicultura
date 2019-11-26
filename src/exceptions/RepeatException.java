package exceptions;

public class RepeatException extends Exception{
	
    private static final long serialVersionUID = 1L;
    public static final String MESSAGE_NOT_FOUND = "El id del corredor ya existe";
	
    public RepeatException() {
	super( MESSAGE_NOT_FOUND );
    }
}
