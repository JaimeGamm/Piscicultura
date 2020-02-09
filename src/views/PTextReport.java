package views;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PTextReport extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private JLabel jLabel;

	public PTextReport() {
		setBackground(Color.WHITE);
		jLabel = new JLabel();
		jLabel.setText("Reportes:");
		jLabel.setFont(new Font(Constants.FONT_RUBIK, Font.BOLD, 16));
		jLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 300));
		add(jLabel);
	}
	
}
