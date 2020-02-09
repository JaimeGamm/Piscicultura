package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import controller.Commands;
import general.HandlerLanguage;
import views.header.JPanelNorthUp;

public class JPanelButtonsMenu extends JPanel{

    private static final long serialVersionUID = 1L;
    private JButtonsMenuAndDialogs addButton;
    private JButtonsMenuAndDialogs deleteButton;
    private JButtonsMenuAndDialogs runnerListButton;
    private JButtonsMenuAndDialogs home;
    private JLabel label, label1;
    private JButton button;
    private Panel panelJComboReport;
    private JPanelNorthUp jPanelNorthUp;
    JComboBox<String> jComboReport; 
	public static final int WIDTH_SCREEN = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	public static final int HEIGHT_SCREEN = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	
    public JPanelButtonsMenu(ActionListener actionListenner) {
    	initComponents(actionListenner);
    	setBackground(Color.BLACK);
    	report(actionListenner);
//    	addButtonSaveData(actionListenner);
    }
	 
    private void initComponents(ActionListener actionListenner) {
    	jPanelNorthUp = new JPanelNorthUp(actionListenner);
    	jPanelNorthUp.setPreferredSize(new Dimension(WIDTH_SCREEN, 65));
    	jPanelNorthUp.setBorder(BorderFactory.createEmptyBorder(0, 800, 0, 0));
    	add(jPanelNorthUp, BorderLayout.NORTH);
    	home = new JButtonsMenuAndDialogs(HandlerLanguage.languageProperties.getProperty(Constants.HOME), Constants.ADD_PATH);
    	home.addActionListener(actionListenner);
    	home.setActionCommand(Commands.HOME.toString());
    	add(home);
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
    }
    
    public void changeLanguage(){
    	home.setText(HandlerLanguage.languageProperties.getProperty(Constants.HOME));
		addButton.setText(HandlerLanguage.languageProperties.getProperty(Constants.ADD_POND));
		deleteButton.setText(HandlerLanguage.languageProperties.getProperty(Constants.DELETE_POND));
		runnerListButton.setText(HandlerLanguage.languageProperties.getProperty(Constants.LIST));
		label.setText(HandlerLanguage.languageProperties.getProperty(Constants.REPORTS));
		button.setText(HandlerLanguage.languageProperties.getProperty(Constants.SEE));
		jComboReport.removeAllItems();
		for (ReportEnum team : ReportEnum.values()) {
			jComboReport.addItem(HandlerLanguage.languageProperties.getProperty(team.getName()));
		}
	}
    
	private void report(ActionListener actionListenner) {
		panelJComboReport =new Panel();
		label = new JLabel();
		label1 = new JLabel();
		label1.setText("|");
		label1.setForeground(Constants.MY_ORANGE);
		label1.setFont(new Font(Constants.FONT_RUBIK, Font.PLAIN, 44));
		add(label1);
		label.setText(HandlerLanguage.languageProperties.getProperty(Constants.REPORTS));
		button = new JButton();
		button.setText(HandlerLanguage.languageProperties.getProperty(Constants.SEE));
		button.setPreferredSize(new Dimension(100,35));
		button.addActionListener(actionListenner);
		button.setBackground(Constants.MY_ORANGE);
		button.setForeground(Color.WHITE);
		button.setActionCommand(Commands.ENTER_REPORT.toString());
		button.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button.setFont(new Font(Constants.FONT_RUBIK, Font.BOLD, 12));
		label.setFont(new Font(Constants.FONT_RUBIK, Font.BOLD, 12));
		label.setForeground(Color.WHITE);
		jComboReport= new JComboBox<>(); 
		jComboReport.setPreferredSize(new Dimension(300,35));
		jComboReport.setBackground(Color.WHITE);
		jComboReport.setForeground(Color.BLACK);
		for (ReportEnum team : ReportEnum.values()) {
			jComboReport.addItem(HandlerLanguage.languageProperties.getProperty(team.getName()));
		}
		jComboReport.setFont(new Font(Constants.FONT_RUBIK, Font.BOLD, 13));
		panelJComboReport.add(label);
		panelJComboReport.add(jComboReport); 
		panelJComboReport.add(button);
		this.add(panelJComboReport,BorderLayout.CENTER);
	}
	
	public String estadoJComboReport() {
		return (String)jComboReport.getSelectedItem();
	}

}
