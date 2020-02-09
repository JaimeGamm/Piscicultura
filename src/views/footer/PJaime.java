package views.footer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import controller.Commands;
import views.Constants;
import views.JButtonsMenuAndDialogs;

public class PJaime extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButtonsMenuAndDialogs fb, in;
	private JLabel label;
	
	public PJaime(ActionListener actionListenner) {
		setBackground(Constants.GRAY_DRAK);
		initComponetns(actionListenner);
	}
	
	public void initComponetns(ActionListener actionListenner){
		label = new JLabel();
		label.setText(Constants.JAIME_T);
		label.setForeground(Color.WHITE);
		label.setFont(new Font(Constants.FONT_RUBIK, Font.PLAIN, 18));
		add(label);
		fb = new JButtonsMenuAndDialogs(Constants.FB1_PATH);
    	fb.addActionListener(actionListenner);
    	fb.setOpaque(false);
    	fb.setActionCommand(Commands.FB2.toString());
    	fb.setPreferredSize(new Dimension(30,30));
    	add(fb);
    	in = new JButtonsMenuAndDialogs(Constants.ING_PATH);
    	in.addActionListener(actionListenner);
    	in.setOpaque(false);
    	in.setActionCommand(Commands.IN2.toString());
    	in.setPreferredSize(new Dimension(30,30));
    	add(in);
	}

}
