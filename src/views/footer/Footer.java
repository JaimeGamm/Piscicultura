package views.footer;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import views.Constants;
import views.LabelFooter;

public class Footer extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6586645879947540471L;
	public static final int WIDTH_SCREEN = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	public static final int HEIGHT_SCREEN = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	private LabelFooter footer;
	
    public Footer() {
    	setLayout(new BorderLayout());
    	setBackground(Constants.MY_ORANGE);
    	initComponents();
    }
    
	
    private void initComponents() {
    	footer = new LabelFooter();
    	footer.setBorder(BorderFactory.createEmptyBorder(0, 200, 0, 0));
    	add(footer);
    }
    
    public void changeLanguage() {
    	footer.changeLanguage();
    }

}
