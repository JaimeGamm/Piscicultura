package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class PanelAddButton extends JPanel {
	private JButton jButton;
	private JTextField jTextField;
	public PanelAddButton(String text) {
		setPreferredSize(new Dimension(500,50));
		setBackground(Color.white);
		setLayout( new BoxLayout( this, BoxLayout.X_AXIS ));
		setBackground(Color.getColor("#DDDD5F5"));
		initComponents(text);
		
	}
	public PanelAddButton(ActionListener actionListener) {
		
	}
	
	public void initComponents(String text){
		addButton(text);		 
	}
	public void addButton(String text) {
		jButton=new JButton(text);
		jTextField = new JTextField();
		jButton.setPreferredSize(new Dimension(150,30));
		jTextField.setPreferredSize(new Dimension(300,30));
		this.add(jButton);
		this.add(jTextField);
	}
	public JButton getjButton() {
		return jButton;
	}
	public void setjButton(JButton jButton) {
		this.jButton = jButton;
	}
	public JTextField getjTextField() {
		return jTextField;
	}
	public void setjTextField(JTextField jTextField) {
		this.jTextField = jTextField;
	}

	


}
