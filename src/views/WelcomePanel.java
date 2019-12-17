package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
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
		getContentPane().setBackground(new Color(40, 40, 40));
		setBounds(500, 300, 0, 0);
		setMinimumSize(new Dimension(380,280));
		setIconImage(new ImageIcon(Constants.LOGO_PATH).getImage());
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
//		FlowLayout flowLayout=new FlowLayout(FlowLayout.CENTER);
//		flowLayout.setHgap(30);
//		setLayout(flowLayout); 
		initComponents(actionListenner);
	}
	
	  private void initComponents(ActionListener actionListenner) {
		  title();
		  panelButton(actionListenner);
	  }
	  private void title() {
		  Panel panel = new Panel();
		  Label title = new Label("Selecione como quiere carga los datos");
		  title.setForeground(Color.WHITE);
		  title.setFont(new Font(Constants.FONT_RUBIK, Font.ITALIC, 14));
		  panel.add(title);
		  add(panel);
	}
	  	private void panelButton(ActionListener actionListenner) {
	  		Panel panel = new Panel();
	    	web = new JButtonsMenuAndDialogs("WEB" ,"");
	    	web.addActionListener(actionListenner);
	    	web.setActionCommand(Commands.WEB.toString());
	    	panel.add(web, BorderLayout.CENTER);
	    	json = new JButtonsMenuAndDialogs("JSON", "");
	    	json.addActionListener(actionListenner);
	    	json.setActionCommand(Commands.JSON.toString());
	    	panel.add(json, BorderLayout.CENTER);
	    	add(panel);
		}
}
