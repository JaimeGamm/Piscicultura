package views;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class IconLabel extends JLabel{

 
	private static final long serialVersionUID = 1L;

	public IconLabel() {
        ImageIcon originalImage = new ImageIcon(Constants.LOGO_PATH);
        ImageIcon scaleIcon = new ImageIcon(originalImage.getImage().getScaledInstance(110, 100, java.awt.Image.SCALE_DEFAULT));
        setText(Constants.NAME_PAGE);
        setFont(new Font(Constants.FONT_RUBIK, Font.BOLD, 20));
        setFocusable(false);
		setIcon(scaleIcon);
		setVerticalTextPosition(SwingConstants.BOTTOM);
		setHorizontalTextPosition(SwingConstants.CENTER);
		setOpaque(false);
		setForeground(Color.WHITE);
		setOpaque(true);
        
    }   

}
