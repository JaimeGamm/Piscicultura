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

public class PIvan extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButtonsMenuAndDialogs fb, in, tw;
	private JLabel label;
	
	public PIvan(ActionListener actionListenner) {
		setBackground(Constants.GRAY_DRAK);
		initComponents(actionListenner);
	}
	
	public void initComponents(ActionListener actionListenner){
		label = new JLabel();
		label.setText(Constants.IVAN_T);
		label.setForeground(Color.WHITE);
		label.setFont(new Font(Constants.FONT_RUBIK, Font.PLAIN, 18));
		add(label);
		fb = new JButtonsMenuAndDialogs(Constants.FB1_PATH);
    	fb.addActionListener(actionListenner);
    	fb.setOpaque(false);
    	fb.setActionCommand(Commands.FB1.toString());
    	fb.setPreferredSize(new Dimension(30,30));
    	add(fb);
    	in = new JButtonsMenuAndDialogs(Constants.ING_PATH);
    	in.addActionListener(actionListenner);
    	in.setOpaque(false);
    	in.setActionCommand(Commands.IN1.toString());
    	in.setPreferredSize(new Dimension(30,30));
    	add(in);
    	tw = new JButtonsMenuAndDialogs(Constants.TW_PATH);
    	tw.addActionListener(actionListenner);
    	tw.setOpaque(false);
    	tw.setActionCommand(Commands.TW1.toString());
    	tw.setPreferredSize(new Dimension(30,30));
    	add(tw);
	}

}
