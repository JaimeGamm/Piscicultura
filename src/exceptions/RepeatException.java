package exceptions;

import general.HandlerLanguage;
import views.Constants;

public class RepeatException extends Exception{
	
    private static final long serialVersionUID = 1L;
    public static final String MESSAGE_NOT_FOUND = Constants.EXIST_ID;
	
    public RepeatException() {
	super( HandlerLanguage.languageProperties.getProperty(MESSAGE_NOT_FOUND) );
    }
}
