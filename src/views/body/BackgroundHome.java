package views.body;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import views.Constants;


public class BackgroundHome extends JLabel{

 
	private static final long serialVersionUID = 1L;
	public static final int WIDTH_SCREEN = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;

	public BackgroundHome() {
		ImageIcon originalImage = new ImageIcon(Constants.BACKGROUND_HOME);
        ImageIcon scaleIcon = new ImageIcon(originalImage.getImage().getScaledInstance(WIDTH_SCREEN-400, 600, java.awt.Image.SCALE_DEFAULT));
		setIcon(scaleIcon);
		setBackground(Color.WHITE);
		setOpaque(true);
    }   

}
