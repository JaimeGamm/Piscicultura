package views.header;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import views.JPanelButtonsMenu;

public class JPNorthPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanelButtonsMenu buttonsMenu;
    private JPanelNorthUp panelNorthUp;
	public static final int WIDTH_SCREEN = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	public static final int HEIGHT_SCREEN = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;

	public JPNorthPanel(ActionListener actionListener) {
		setBackground(Color.BLACK);
		panelNorthUp = new JPanelNorthUp(actionListener);
		panelNorthUp.setPreferredSize(new Dimension(600, 55));
		add(panelNorthUp, BorderLayout.NORTH);
		buttonsMenu = new JPanelButtonsMenu(actionListener);
        buttonsMenu.setPreferredSize(new Dimension(600, 55));
        add(buttonsMenu, BorderLayout.CENTER);
    }
}
