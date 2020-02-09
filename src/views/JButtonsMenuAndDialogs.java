package views;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import com.itextpdf.text.Image;

public class JButtonsMenuAndDialogs extends JButton{

    private static final long serialVersionUID = 1L;
    public static final int DIMENSION_WHIDTH = 135;
    public static final int DIMENSION_HEIGHT = 40;
    private JButton button;
	
    public JButtonsMenuAndDialogs(String text, String routeImage) {
        setText(text);   
        setFont(new Font(Constants.FONT_RUBIK, Font.BOLD, 12));
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);
        setPreferredSize(new Dimension(DIMENSION_WHIDTH,DIMENSION_HEIGHT));
//        setIcon(convertToIcon(routeImage));
    	setBorderPainted(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setHorizontalTextPosition(SwingConstants.CENTER);
        setVerticalTextPosition(SwingConstants.BOTTOM);
        button = this;
        super.addMouseListener(new MouseAdapter() {
			@Override
            public void mouseEntered(MouseEvent arg0){
            	button.setBackground(Constants.MY_ORANGE);
        		setBorderPainted(false);
            }
			@Override
            public void mouseExited(MouseEvent e){
            	button.setBackground(Color.BLACK);
        		setBorderPainted(false);
            }
        });
    } 
    
    public JButtonsMenuAndDialogs(String text, int width, int heigth) {
    	setText(text);
        setFont(new Font(Constants.FONT_RUBIK,Font.BOLD, 14));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
	
    public JButtonsMenuAndDialogs(String routeImage) {
    	setIcon(convertToIcon(routeImage));
    	setBackground(Color.BLACK);
    	setBorderPainted(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    
//    @Override
//	protected void paintComponent(Graphics g){
//            super.paintComponent(g);
//            Dimension arcs = new Dimension(30,40); //Border corners arcs {width,height}, change this to whatever you want
//            int width = getWidth();
//            int height = getHeight();
//            Graphics2D graphics = (Graphics2D) g;
//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);//paint border
//	}
	
    private static Icon convertToIcon(String route) {
    	ImageIcon icon = new ImageIcon(route);
    	Icon scaleIcon = new ImageIcon(icon.getImage().getScaledInstance(30,30, Image.DEFAULT));
    	return scaleIcon;
    } 
	
}
