package views.header;


import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

import controller.Commands;
import views.Constants;
import views.JButtonsMenuAndDialogs;

public class JPanelNorthUp extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private JButtonsMenuAndDialogs spanish;
    private JButtonsMenuAndDialogs english;

	public JPanelNorthUp(ActionListener actionListener) {
		setBackground(Color.BLACK);
		initComponents(actionListener);
		
	}
		
	private void initComponents(ActionListener actionListenner) {
    	spanish = new JButtonsMenuAndDialogs(Constants.SPAIN_PATH);
    	spanish.addActionListener(actionListenner);
    	spanish.setActionCommand(Commands.SPANISH.toString());
    	add(spanish);
    	english = new JButtonsMenuAndDialogs(Constants.USA_PATH);
    	english.addActionListener(actionListenner);
    	english.setActionCommand(Commands.ENGLISH.toString());
    	add(english);
    }
}
