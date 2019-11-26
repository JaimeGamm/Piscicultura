package views;

import views.dialogs.JDialogTwo;
import views.table.JtableElement;
import views.dialogs.JDialogOne;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

import general.HandlerLanguage;
import models.Pond;

public class MyJFramePpal extends JFrame{
	
    private static final long serialVersionUID = 1L;
    private MyJPanelPrincipal panel;
    private JDialogTwo dialogAdd;
    private JDialogOne dialogDelete;
    private JtableElement table;
    private JPanelButtonsMenu buttons;
	
    public MyJFramePpal(ActionListener actionListenner, ArrayList<Object[]> datasFarm) {
    	setMinimumSize(new Dimension(700, 400));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setIconImage(new ImageIcon(Constants.LOGO_PATH).getImage());
		setTitle(HandlerLanguage.languageProperties.getProperty(Constants.TITLE));
		initComponents(actionListenner, datasFarm);
		setVisible(true);
    }
	
    private void initComponents(ActionListener actionListenner, ArrayList<Object[]> datasFarm) {
    	panel = new MyJPanelPrincipal(actionListenner, datasFarm);
    	JScrollPane jScrollPane = new JScrollPane();
		jScrollPane.setViewportView( panel );
		this.add( jScrollPane, BorderLayout.CENTER );
		add(panel);
		dialogAdd = new JDialogTwo(this,actionListenner,HandlerLanguage.languageProperties.getProperty(Constants.ADD_POND),Constants.ADD_PATH,false);
		dialogDelete = new JDialogOne(this,actionListenner,HandlerLanguage.languageProperties.getProperty(Constants.DELETE_POND),Constants.DELETE_PATH,false);
    }
    public Pond actualizarTable() {
    	panel.reiniciarTable();
    	Pond pond=dialogAdd.createRunner();
    	return pond;
    }
	public void reiniciarTable() {
		   panel.reiniciarTable();
	}
	public void cargaDeNuevoTabla(ArrayList<Object[]> datasFarm) {
		panel.newDatas(datasFarm);
//		jpMainPanel.setJtableElement(jtableElement);
		//jpMainPanel.showDatas( datasFarm);
	}
	public void changeLanguage(){
		table.changeLanguageColunmJtable();
		buttons.changeLanguage();
		dialogAdd.changeLanguage();
		dialogDelete.changeLanguage();
	}
    
    public void getPondsList(ArrayList<Object[]> info) {
    	//panel.getPondsList(info);
    }
	
    public void showMessage() {
    	JOptionPaneMessages.showMessageEndProgram();
    }
	
    public void openDialogAdd() {
    	dialogAdd.setVisible(true);
    }
	
    public void openDialogDelete() {
    	dialogDelete.setVisible(true);
    }
	
    public void closeDialogAdd() {
    	dialogAdd.setVisible(false);
		dialogAdd.clearComponents();
    }
	
    public void closeDialogDelete() {
    	dialogDelete.setVisible(false);
    	dialogDelete.clearComponents();
    }

	
//    public boolean componentsAddDialogEmpty() {
//    	return dialogAdd.verifyEmptyComponents();
//    }
	
	
    public Pond getRunnerFromDialog() {
    	return dialogAdd.createRunner();
    }
	
    public  void showMessage(String message){
    	JOptionPaneMessages.showMessage(message);
    }
    
    public void showErrorMessage(String message){
    	JOptionPaneMessages.showErrorMessage(message);
    }
    
    public void showErrorNumberFormatException() {
    	JOptionPaneMessages.showErrorNumberFormatException();
    }
	
	
    public void showMessagePondCreated() {
    	JOptionPaneMessages.showMessagePondCreated();
    }
	
    public int showMessageConfirmation() {
    	return JOptionPaneMessages.showMessageConfirmation();
    }
	
    public int showMessageConfirmationDelete() {
    	return JOptionPaneMessages.showMessageConfirmationDelete();
    }
	

    public int jOptionPaneYesOption() {
    	return JOptionPaneMessages.jOptionPaneYesOption();
    }
	

    public void showMessageCorrectDelete() {
    	JOptionPaneMessages.showMessageCorrectDelete();
    }
	
	
    public boolean componentsDeleteDialogEmpty() {
    	return dialogDelete.verifyEmptyComponent();
    }

    public int getIdDeletDialog() {
    	return dialogDelete.getId();
    }
}
