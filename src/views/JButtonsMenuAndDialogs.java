package views;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class JButtonsMenuAndDialogs extends JButton{

    private static final long serialVersionUID = 1L;
    public static final int DIMENSION_WHIDTH = 170;
    public static final int DIMENSION_HEIGHT = 100;
	
    public JButtonsMenuAndDialogs(String text, String routeImage) {
        setText(text);   
        setFont(new Font(Constants.FONT_RUBIK, Font.BOLD, 14));
        setBackground(Constants.GRAY);
        setForeground(Constants.CIAN);
        setPreferredSize(new Dimension(DIMENSION_WHIDTH,DIMENSION_HEIGHT));
        setIcon(convertToIcon(routeImage));
        setOpaque(false);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setHorizontalTextPosition(SwingConstants.CENTER);
        setVerticalTextPosition(SwingConstants.BOTTOM);
    }
	
    public JButtonsMenuAndDialogs(String text, int width, int heigth) {
    	setText(text);
        setFont(new Font(Constants.FONT_RUBIK,Font.BOLD, 16));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
	
    private static Icon convertToIcon(String route) {
    	ImageIcon icon = new ImageIcon(route);
    	Icon scaleIcon = new ImageIcon(icon.getImage().getScaledInstance(75,75, Image.SCALE_DEFAULT));
    	return scaleIcon;
    }
	
}
