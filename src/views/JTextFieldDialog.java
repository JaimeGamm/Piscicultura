package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class JTextFieldDialog extends JTextField{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	  private Border titled;

	public JTextFieldDialog(String text) {
//		super(20);
		setPreferredSize(new Dimension(380,35));
		titled = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(55, 55, 55)), text, TitledBorder.LEFT, TitledBorder.TOP, null, Color.WHITE);
		setForeground(Color.WHITE);
		setFont(new Font(Constants.FONT_RUBIK, Font.ITALIC, 18));
		setHorizontalAlignment(JTextField.RIGHT);
		setBorder(titled);
		setBackground(new Color(90, 90, 90));
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
	public void setBordeText(String text) {
		titled = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(55, 55, 55)), text, TitledBorder.LEFT, TitledBorder.TOP, null, Color.WHITE);
		setBorder(titled);
	}
}
