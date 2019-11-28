package views.header;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import views.Constants;
import views.JPanelButtonsMenu;

public class JPanelHeader extends JPanel{

    private static final long serialVersionUID = 1L;
	
    public JPanelHeader(ActionListener actionListenner) {
	setLayout(new BorderLayout());
	setBackground(Constants.GRAY_BLUE);
	setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));
	initComponents(actionListenner);
	setVisible(true);
    }
	
    private void initComponents(ActionListener actionListenner) {
    	JPanelButtonsMenu buttonsMenu = new JPanelButtonsMenu(actionListenner);
        buttonsMenu.setPreferredSize(new Dimension(1000, 150));
        add(buttonsMenu, BorderLayout.CENTER);
    }

}
