package exceptions;

import general.HandlerLanguage;
import views.Constants;

public class NoExistException extends Exception{
	
    private static final long serialVersionUID = 1L;
    public static final String MESSAGE_NOT_FOUND = Constants.NOT_EXIST_ID;
    
    public NoExistException() {
	super( HandlerLanguage.languageProperties.getProperty(MESSAGE_NOT_FOUND) );
    }
}
