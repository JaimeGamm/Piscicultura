package views.body;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

import general.HandlerLanguage;
import views.Constants;

public class JPBDThree extends JPanel{

	private static final long serialVersionUID = 1L;
	private JLabel label, label1;

	public JPBDThree() {
		setBackground(Color.WHITE);
		initComponents();
	}
	
	public void initComponents() {
		label1 = new JLabel();
		label1.setText(HandlerLanguage.languageProperties.getProperty(Constants.T_THREE));
		label1.setFont(new Font(Constants.FONT_RUBIK, Font.BOLD, 30));
		label1.setForeground(Constants.MY_ORANGE);
		this.add(label1);
		label = new JLabel();
		label.setText(HandlerLanguage.languageProperties.getProperty(Constants.L_THREE));
		label.setFont(new Font(Constants.FONT_RUBIK, Font.PLAIN, 14));
		label.setForeground(Color.BLACK);
		this.add(label);
	}
	
	public void changeLanguage() {
		label.setText(HandlerLanguage.languageProperties.getProperty(Constants.L_THREE));
		label1.setText(HandlerLanguage.languageProperties.getProperty(Constants.T_THREE));
	}
}
