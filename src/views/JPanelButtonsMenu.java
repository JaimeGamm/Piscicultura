package views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
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
    private JLabel label;
    private JButton button;
    JComboBox<String> jComboReport; 
	
    public JPanelButtonsMenu(ActionListener actionListenner) {
    	initComponents(actionListenner);
    	setBackground(Constants.GRAY);
    	report(actionListenner);
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
		label.setText(HandlerLanguage.languageProperties.getProperty(Constants.REPORTS));
		button.setText(HandlerLanguage.languageProperties.getProperty(Constants.SEE));
	}
    
	private void report(ActionListener actionListenner) {
		Panel panel =new Panel();
		label = new JLabel();
		label.setText(HandlerLanguage.languageProperties.getProperty(Constants.REPORTS));
		button = new JButton();
		button.setText(HandlerLanguage.languageProperties.getProperty(Constants.SEE));
		button.setPreferredSize(new Dimension(100,40));
		button.addActionListener(actionListenner);
		button.setActionCommand(Commands.ENTER_REPORT.toString());
		label.setFont(new Font(Constants.FONT_RUBIK, 1, 16));
		jComboReport= new JComboBox<>(); 
		jComboReport.setPreferredSize(new Dimension(430,40));
		for (ReportEnum team : ReportEnum.values()) {
			jComboReport.addItem(team.getName());
		}
		jComboReport.setFont(new Font(Constants.FONT_RUBIK, 1, 16));
		panel.add(label);
		panel.add(jComboReport);
		panel.add(button);
		this.add(panel,BorderLayout.CENTER);
	}
	public String estadoJComboReport() {
		return (String)jComboReport.getSelectedItem();
	}

}
