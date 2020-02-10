package exceptions;

import general.HandlerLanguage;
import views.Constants;

public class EmptyFieldsException extends Exception {
    
    private static final long serialVersionUID = 1L;
    public static final String MESSAGE_NOT_FOUND = Constants.EMPTY_FIELDS;
	
    public EmptyFieldsException() { 
    	super( HandlerLanguage.languageProperties.getProperty(MESSAGE_NOT_FOUND) );
    }
}
