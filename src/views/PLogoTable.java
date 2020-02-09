package views;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class PLogoTable extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private IconLabel label;
	
	public PLogoTable() {
		setOpaque(false);
		initComponents();
	}
	
	public void initComponents() {
		label = new IconLabel();
		add(label, BorderLayout.NORTH);
	}

}
