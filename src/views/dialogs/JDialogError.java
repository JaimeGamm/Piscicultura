package views.dialogs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import controller.Commands;
import general.HandlerLanguage;
import views.Constants;
import views.JButtonsMenuAndDialogs;
import views.MyJFramePpal;

public class JDialogError extends JDialog {

	private static final long serialVersionUID = 1L;
	private JButtonsMenuAndDialogs buttonDelete, buttonCancel;
	public JDialogError(MyJFramePpal frame,ActionListener actionListenner,String title) {
    	setMinimumSize(new Dimension(350,160));
		setLocationRelativeTo(frame);
		setTitle(title);
		getContentPane().setBackground(new Color(40, 40, 40));
		getRootPane().setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
		setModal(true);
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		initComponents(actionListenner);
    }
	   private void initComponents(ActionListener actionListenner) {
	        addButtonsDelete(actionListenner);
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
		
		
	    private JPanel createPanel(int separation) {
	    	JPanel panel = new JPanel();
	    	FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
	    	layout.setHgap(separation);
	    	panel.setLayout(layout);
	    	panel.setOpaque(false);
	    	return panel;
	    }
		
	    @SuppressWarnings("unused")
		private JLabel createLabel(String text) {
	    	JLabel label = new JLabel(text);
	    	label.setBorder(BorderFactory.createEmptyBorder(0, 0, 15, 0));
	    	label.setForeground(Color.BLACK);
	    	label.setHorizontalTextPosition(SwingConstants.CENTER);
	    	label.setVerticalTextPosition(SwingConstants.CENTER);
	    	label.setOpaque(false);
	    	return label;
	    }
}
