package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class AddJTextField2 extends JTextField{
	public AddJTextField2(String text) {
		setPreferredSize(new Dimension(255,50));
		  Border titled = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(55, 55, 55)), text, TitledBorder.CENTER, TitledBorder.TOP, null, Color.WHITE);
//		setBorder(BorderFactory.createLineBorder(Color.BLACK));
//		setBorder(BorderFactory.createTitledBorder(text)); 
		setBorder(titled);
	
	addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
			String p = getText();
			 setText(p);
				
			}
		});
	}

}
