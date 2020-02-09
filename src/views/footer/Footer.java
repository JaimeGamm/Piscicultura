package views.footer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

import general.HandlerLanguage;
import views.Constants;

public class Footer extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6586645879947540471L;
	public static final int WIDTH_SCREEN = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	public static final int HEIGHT_SCREEN = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	private PIvan ivan;
	private PJaime jaime;
	private JLabel label;
	
    public Footer(ActionListener actionListenner) {
    	setBackground(Constants.GRAY_DRAK);
    	initComponents(actionListenner);
    }
    
	
    private void initComponents(ActionListener actionListenner) {
    	ivan = new PIvan(actionListenner);
    	ivan.setPreferredSize(new Dimension(WIDTH_SCREEN-300,40));
    	add(ivan);
    	jaime = new PJaime(actionListenner);
    	jaime.setPreferredSize(new Dimension(WIDTH_SCREEN-300,40));
    	add(jaime);
    	label = new JLabel();
    	label.setText(HandlerLanguage.languageProperties.getProperty(Constants.FOOTER_TEXT));
    	label.setFont(new Font(Constants.FONT_RUBIK, Font.PLAIN, 18));
    	label.setForeground(Color.WHITE);
    	add(label);
    }
    
    public void changeLanguage() {
    	label.setText(HandlerLanguage.languageProperties.getProperty(Constants.FOOTER_TEXT));
    }

}
