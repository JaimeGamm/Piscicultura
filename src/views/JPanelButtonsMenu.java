package views;

import java.awt.event.ActionListener;
import javax.swing.JPanel;
import controller.Commands;
import general.HandlerLanguage;

public class JPanelButtonsMenu extends JPanel{

    private static final long serialVersionUID = 1L;
    private JButtonsMenuAndDialogs addButton;
    private JButtonsMenuAndDialogs deleteButton;

    private JButtonsMenuAndDialogs runnerListButton;
    private JButtonsMenuAndDialogs getoutAndSaveButton;
    private JButtonsMenuAndDialogs spanish;
    private JButtonsMenuAndDialogs english;
	
    public JPanelButtonsMenu(ActionListener actionListenner) {
    	initComponents(actionListenner);
    	setBackground(Constants.GRAY_BLUE);
    }
	
    private void initComponents(ActionListener actionListenner) {
    	addButton = new JButtonsMenuAndDialogs(HandlerLanguage.languageProperties.getProperty(Constants.ADD_POND), Constants.ADD_PATH);
    	addButton.addActionListener(actionListenner);
    	addButton.setActionCommand(Commands.ADD.toString());
    	add(addButton);
    	deleteButton = new JButtonsMenuAndDialogs(HandlerLanguage.languageProperties.getProperty(Constants.DELETE_POND), Constants.DELETE_PATH);
    	deleteButton.addActionListener(actionListenner);
    	deleteButton.setActionCommand(Commands.DELETE.toString());
    	add(deleteButton);
    	runnerListButton = new JButtonsMenuAndDialogs(HandlerLanguage.languageProperties.getProperty(Constants.LIST), Constants.LIST_PATH);
    	runnerListButton.addActionListener(actionListenner);
    	runnerListButton.setActionCommand(Commands.SEE_LIST.toString());
    	add(runnerListButton);
    	getoutAndSaveButton = new JButtonsMenuAndDialogs(HandlerLanguage.languageProperties.getProperty(Constants.EXIT), Constants.EXIT_PATH);
    	getoutAndSaveButton.addActionListener(actionListenner);
    	getoutAndSaveButton.setActionCommand(Commands.GET_OUT.toString());
    	add(getoutAndSaveButton);
    	spanish = new JButtonsMenuAndDialogs(HandlerLanguage.languageProperties.getProperty(Constants.SPANISH), Constants.SPAIN_PATH);
    	spanish.addActionListener(actionListenner);
    	spanish.setActionCommand(Commands.SPANISH.toString());
    	add(spanish);
    	english = new JButtonsMenuAndDialogs(HandlerLanguage.languageProperties.getProperty(Constants.ENGLISH), Constants.USA_PATH);
    	english.addActionListener(actionListenner);
    	english.setActionCommand(Commands.ENGLISH.toString());
    	add(english);
    }
    
    public void changeLanguage(){
		addButton.setText(HandlerLanguage.languageProperties.getProperty(Constants.ADD_POND));
		deleteButton.setText(HandlerLanguage.languageProperties.getProperty(Constants.DELETE_POND));
		runnerListButton.setText(HandlerLanguage.languageProperties.getProperty(Constants.LIST));
		getoutAndSaveButton.setText(HandlerLanguage.languageProperties.getProperty(Constants.EXIT));
		spanish.setText(HandlerLanguage.languageProperties.getProperty(Constants.SPANISH));
		english.setText(HandlerLanguage.languageProperties.getProperty(Constants.ENGLISH));
	}

}
