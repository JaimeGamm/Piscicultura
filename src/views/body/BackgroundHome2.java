package views.body;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class BackgroundHome2 extends JLabel{

 
	private static final long serialVersionUID = 1L;
	public static final int WIDTH_SCREEN = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;

	public BackgroundHome2(String path) {
        ImageIcon originalImage1 = new ImageIcon(path);
        ImageIcon scaleIcon1 = new ImageIcon(originalImage1.getImage().getScaledInstance(160, 600, java.awt.Image.SCALE_DEFAULT));
		setIcon(scaleIcon1);
		setBackground(Color.WHITE);
		setOpaque(true);
    }   

}
