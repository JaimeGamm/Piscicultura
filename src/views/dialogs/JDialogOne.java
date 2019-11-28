package views.dialogs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import general.HandlerLanguage;

import javax.swing.SwingConstants;

import controller.Commands;
import views.Constants;
import views.JButtonsMenuAndDialogs;
import views.MyJFramePpal;
import views.MyJTextField;

public class JDialogOne extends JDialog{

    private static final long serialVersionUID = 1L;
    private MyJTextField id;
    private JLabel idL;
    private JButtonsMenuAndDialogs buttonDelete, buttonCancel;

    public JDialogOne(MyJFramePpal frame,ActionListener actionListenner,String title, String routeImage, boolean anotherButton) {
    	setMinimumSize(new Dimension(350,160));
		setIconImage(new ImageIcon(routeImage).getImage());
		setLocationRelativeTo(frame);
		setTitle(title);
		getRootPane().setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
		setModal(true);
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		initComponents(actionListenner, anotherButton);
    }
	
    private void initComponents(ActionListener actionListenner, boolean anotherButton) {
    	addTextField();
        addButtonsDelete(actionListenner);
    }
	
    private void addTextField() {
    	idL = createLabel(HandlerLanguage.languageProperties.getProperty(Constants.IN_ID));
    	add(idL);
    	id = new MyJTextField();
    	add(id);
    }
	
    private void addButtonsDelete(ActionListener actionListenner) {
    	JPanel panelButtons = createPanel(10);
    	panelButtons.setBorder(BorderFactory.createEmptyBorder(15, 0, 0, 0));
		buttonDelete = new JButtonsMenuAndDialogs(HandlerLanguage.languageProperties.getProperty(Constants.DELETE_POND),120,35);
		buttonDelete.addActionListener(actionListenner);
		buttonDelete.setActionCommand(Commands.CLOSE_DELETE_DIALOG.toString());
		panelButtons.add(buttonDelete);
		buttonCancel = new JButtonsMenuAndDialogs(HandlerLanguage.languageProperties.getProperty(Constants.CANCEL),120,35);
		buttonCancel.addActionListener(actionListenner);
		buttonCancel.setActionCommand(Commands.CLOSE_DIALOG_DELETE_CANCEL.toString());
		panelButtons.add(buttonCancel);
		add(panelButtons);
    }
    
    public void changeLanguage(){
    	idL.setText(HandlerLanguage.languageProperties.getProperty(Constants.IN_ID));
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
	
    private JLabel createLabel(String text) {
    	JLabel label = new JLabel(text);
    	label.setBorder(BorderFactory.createEmptyBorder(0, 0, 15, 0));
    	label.setForeground(Color.BLACK);
    	label.setHorizontalTextPosition(SwingConstants.CENTER);
    	label.setVerticalTextPosition(SwingConstants.CENTER);
    	label.setOpaque(false);
    	return label;
    }
	
    public void clearComponents() {
    	id.setText(" ");
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
