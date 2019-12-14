package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import controller.Commands;

public class WelcomePanel extends JDialog{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButtonsMenuAndDialogs web;
    private JButtonsMenuAndDialogs json;

	
	public WelcomePanel(ActionListener actionListenner) {
		setBackground(new Color(40, 40, 40));
		setBounds(500, 300, 0, 0);
		setMinimumSize(new Dimension(380,150));
		setIconImage(new ImageIcon(Constants.LOGO_PATH).getImage());
		FlowLayout flowLayout=new FlowLayout(FlowLayout.CENTER);
		flowLayout.setHgap(30);
		setLayout(flowLayout); 
		initComponents(actionListenner);
	}
	
	  private void initComponents(ActionListener actionListenner) {
	    	web = new JButtonsMenuAndDialogs("WEB" ,"");
	    	web.addActionListener(actionListenner);
	    	web.setActionCommand(Commands.WEB.toString());
	    	add(web, BorderLayout.CENTER);
	    	json = new JButtonsMenuAndDialogs("JSON", "");
	    	json.addActionListener(actionListenner);
	    	json.setActionCommand(Commands.JSON.toString());
	    	add(json, BorderLayout.CENTER);
	  }
}
