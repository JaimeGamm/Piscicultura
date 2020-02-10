package views.dialogs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;

import general.HandlerLanguage;
import controller.Commands;
import views.Constants;
import views.JButtonsMenuAndDialogs;
import views.JTextFieldDialog;
import views.MyJFramePpal;

public class JDialogOne extends JDialog{

    private static final long serialVersionUID = 1L;
    private JTextFieldDialog id;
    private JButtonsMenuAndDialogs buttonDelete, buttonCancel;

    public JDialogOne(MyJFramePpal frame,ActionListener actionListenner,String title, String routeImage, boolean anotherButton) {
    	setMinimumSize(new Dimension(350,160));
		getContentPane().setBackground(new Color(40, 40, 40));
		setBackground(new Color(35, 35, 35));
		setIconImage(new ImageIcon(routeImage).getImage());
		setLocationRelativeTo(frame);
		setTitle(title);
		getRootPane().setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		setModal(true);
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		initComponents(actionListenner, anotherButton);
    }
	
    private void initComponents(ActionListener actionListenner, boolean anotherButton) {
    	addTextField();
        addButtonsDelete(actionListenner);
    }
	
    private void addTextField() {
    	Panel panel = new Panel();
   	 	panel.setPreferredSize(new Dimension(340,60));
    	id = new JTextFieldDialog(HandlerLanguage.languageProperties.getProperty(Constants.IN_ID));
    	id.setForeground(Color.WHITE);
    	id.setFont(new Font(Constants.FONT_RUBIK, Font.ITALIC, 18));
    	id.setHorizontalAlignment(JTextField.RIGHT);
    	id.setBackground(new Color(90, 90, 90));
    	id.setPreferredSize(new Dimension(250,50));
    	panel.add(id);
    	add(panel);
    } 
	
    private void addButtonsDelete(ActionListener actionListenner) {
    	JPanel panelButtons = createPanel(10);
    	panelButtons.setBorder(BorderFactory.createEmptyBorder(15, 0, 0, 0));
		buttonDelete = new JButtonsMenuAndDialogs(HandlerLanguage.languageProperties.getProperty(Constants.DELETE_POND),120,35);
		buttonDelete.addActionListener(actionListenner);
		buttonDelete.setActionCommand(Commands.CLOSE_DELETE_DIALOG.toString());
		buttonDelete.setFont(new Font(Constants.FONT_RUBIK, Font.BOLD, 14));
		buttonDelete.setBackground(new Color(90, 90, 90));
		buttonDelete.setForeground(Color.WHITE);
		panelButtons.add(buttonDelete);
		buttonCancel = new JButtonsMenuAndDialogs(HandlerLanguage.languageProperties.getProperty(Constants.CANCEL),120,35);
		buttonCancel.addActionListener(actionListenner);
		buttonCancel.setActionCommand(Commands.CLOSE_DIALOG_DELETE_CANCEL.toString());
		buttonCancel.setFont(new Font(Constants.FONT_RUBIK, Font.BOLD, 14));
    	buttonCancel.setBackground(new Color(90, 90, 90));
    	buttonCancel.setForeground(Color.WHITE);
		panelButtons.add(buttonCancel);
		add(panelButtons);
    }
    
    public void changeLanguage(){
    	id.setBordeText(HandlerLanguage.languageProperties.getProperty(Constants.IN_ID));
    	buttonCancel.setText(HandlerLanguage.languageProperties.getProperty(Constants.CANCEL));
    	buttonDelete.setText(HandlerLanguage.languageProperties.getProperty(Constants.DELETE_POND));
    }
	
	
    private JPanel createPanel(int separation) {
    	JPanel panel = new JPanel();
    	FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
    	layout.setHgap(separation);
    	panel.setLayout(layout);
    	panel.setOpaque(false);
    	return panel;
    }
	
    public void clearComponents() {
    	id.setText("");
    }
	
    public int getId() {
    	return Integer.parseInt(id.getText());
    }
	
    public boolean verifyEmptyComponent() {
    	boolean isEmpty = true;
    	if(id.getText().isEmpty()) {
            isEmpty = false;
    	}
    	return isEmpty;
    }
}
