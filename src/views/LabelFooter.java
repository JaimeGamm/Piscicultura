package views;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import general.HandlerLanguage;

public class LabelFooter extends JLabel{
	
	private static final long serialVersionUID = 1L;

	public LabelFooter() {
		initComponets();
	}
	
	public void initComponets() {
		setText(HandlerLanguage.languageProperties.getProperty(Constants.FOOTER_TEXT));
		setFont(new Font(Constants.FONT_RUBIK, Font.PLAIN, 18));
		setForeground(Color.WHITE);
	}
	
	public void changeLanguage() {
		setText(HandlerLanguage.languageProperties.getProperty(Constants.FOOTER_TEXT));
	}
}
