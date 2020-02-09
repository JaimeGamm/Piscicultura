package views.header;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import views.JPanelButtonsMenu;

public class JPanelHeader extends JPanel{

    private static final long serialVersionUID = 1L;
    private JPanelButtonsMenu buttonsMenu;
    private JPUp jpUp;
    
	public static final int WIDTH_SCREEN = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	public static final int HEIGHT_SCREEN = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	
    public JPanelHeader(ActionListener actionListenner) {
    	setLayout(new BorderLayout());
    	setBackground(Color.BLACK);
    	setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));
    	initComponents(actionListenner);
    	setVisible(true);
    }
    
	
    private void initComponents(ActionListener actionListenner) {
    	jpUp =  new JPUp();
    	jpUp.setPreferredSize(new Dimension(300, 130));
    	jpUp.setBorder(BorderFactory.createEmptyBorder(5, 70, 0, 0));
    	add(jpUp, BorderLayout.WEST);
    	buttonsMenu = new JPanelButtonsMenu(actionListenner);
        buttonsMenu.setPreferredSize(new Dimension(WIDTH_SCREEN-200, 100));
        add(buttonsMenu, BorderLayout.EAST);
   
    }
    
    public String estadoJComboReport() {
    	return buttonsMenu.estadoJComboReport();  
    }
    
	public void changeLanguageButtonsMenu(){
		buttonsMenu.changeLanguage();
	}
}
