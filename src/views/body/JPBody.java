package views.body;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class JPBody extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private BackgroundHome backgroundHome;
	private JPBDOne jpbdOne; 
	private JPBDTwo jpbdTwo;
	private JPBDThree jpbdThree;
	private JPBDFour jpbdFour;
	
	
	public static final int WIDTH_SCREEN = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	public static final int HEIGHT_SCREEN = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	
	public JPBody() {
		setBackground(Color.WHITE);
		initComponets();
	}
	
	 public void initComponets() {
	    backgroundHome = new BackgroundHome();
	    add(backgroundHome);
	    jpbdOne = new JPBDOne();
	    jpbdOne.setPreferredSize(new Dimension(WIDTH_SCREEN-900,180));
	    add(jpbdOne);
	    jpbdTwo = new JPBDTwo();
	    jpbdTwo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
	    jpbdTwo.setPreferredSize(new Dimension(WIDTH_SCREEN-900,180));
	    add(jpbdTwo);
	    jpbdThree = new JPBDThree();
	    jpbdThree.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
	    jpbdThree.setPreferredSize(new Dimension(WIDTH_SCREEN-900,180));
	    add(jpbdThree);
	    jpbdFour = new JPBDFour();
	    jpbdFour.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
	    jpbdFour.setPreferredSize(new Dimension(WIDTH_SCREEN-900,180));
	    add(jpbdFour);
	 }
	 
	 
	 public void changeLanguage() {
		 jpbdOne.changeLanguage();
		 jpbdTwo.changeLanguage();
		 jpbdThree.changeLanguage();
		 jpbdFour.changeLanguage();
	 }

}
