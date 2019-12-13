package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTextField;

public class MyJTextField extends JTextField{

	private static final long serialVersionUID = 1L;
	
	public MyJTextField() {
		super(20);
		setPreferredSize(new Dimension(0,40));
		setBackground(Color.WHITE);
		setForeground(Color.BLACK);
		
		setFont(new Font("Calibri", Font.ITALIC, 16));
	}
	

}
