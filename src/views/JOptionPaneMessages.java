package views;



import javax.swing.Icon;
import javax.swing.JOptionPane;

public class JOptionPaneMessages {

    public static void showMessage(String message, String title, int icon){
	JOptionPane.showMessageDialog(null, message,title,icon);
    }
	
    public static void showMessage(String message, String title, int icon, Icon iconImage){
	JOptionPane.showMessageDialog(null, message,title,icon,iconImage);
    }
	
    public static void showMessage(String message){
	JOptionPane.showMessageDialog(null, message);
    }
	
    public static void showErrorMessage(String message){
        JOptionPane.showMessageDialog(null, message, Constants.ERROR, JOptionPane.ERROR_MESSAGE);
    }
    
    public static void showErrorNumberFormatException() {
    	showErrorMessage(Constants.MESSAGE_NUMBER_FORMAT);
    }
	

    public static void showMessagePondCreated() {
	showMessage(Constants.MESSAGE_CREATE_POND);
    }
	
    public static void showMessageEndProgram() {
	showMessage(Constants.END_PROGRAM,Constants.EXIT,JOptionPane.INFORMATION_MESSAGE);
    }
	
    public static int showMessageConfirmation() {
	return JOptionPane.showConfirmDialog(null,Constants.MESSAGE_CONFIRMATION,Constants.VERIFY,JOptionPane.YES_NO_OPTION);
    }
	
    public static int showMessageConfirmationDelete() {
	return JOptionPane.showConfirmDialog(null,Constants.MESSAGE_CONFIRMATION_DELETE,Constants.VERIFY,JOptionPane.YES_NO_OPTION);
    }
	
	
    public static int jOptionPaneYesOption() {
	return JOptionPane.YES_OPTION;
    }
	
    public static void showMessageCorrectDelete() {
	showMessage(Constants.MESSAGE_CORRECT_DELETE);
    }
	

}
