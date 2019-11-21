package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class JButtonMenu extends JButton {
	private int radius;
	private ImageIcon normalIcon;
//	private JButton button;
	public JButtonMenu(String text, String imgRuta) {
		super(text);
		normalIcon = new ImageIcon(new ImageIcon(imgRuta).getImage().getScaledInstance(60, 60, java.awt.Image.SCALE_DEFAULT));
		setIcon(normalIcon);
		this.setSize(60, 60);
	//	ImageIcon logo = new ImageIcon(text);
		
		//this.button.setIcon(new ImageIcon(logo.getImage().getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_SMOOTH)));// escalar la imagen
		this.setVerticalTextPosition(SwingConstants.BOTTOM);
		this.setHorizontalTextPosition(SwingConstants.CENTER);
		setBackground(Color.decode("#4300D2"));
		this.setFont(new Font("aria",Font.PLAIN,12)); 
		this.setForeground(Color.white);
		setBorder(BorderFactory.createEmptyBorder(0,15,5,15));
		setCursor(new Cursor(Cursor.HAND_CURSOR));
		//etOpaque(false);
		setBorderPainted(false);
		setFocusable(false);
	}
}
