package views.header;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import views.Constants;
import views.JPanelButtonsMenu;
import views.ReportEnum;

public class JPanelHeader extends JPanel{

    private static final long serialVersionUID = 1L;
    private JPanelButtonsMenu buttonsMenu;
	
    public JPanelHeader(ActionListener actionListenner) {
	setLayout(new BorderLayout());
	setBackground(Constants.GRAY_BLUE);
	setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));
	initComponents(actionListenner);
	setVisible(true);
    }
    
	
    private void initComponents(ActionListener actionListenner) {
    	buttonsMenu = new JPanelButtonsMenu(actionListenner);
        buttonsMenu.setPreferredSize(new Dimension(1000, 150));
        add(buttonsMenu, BorderLayout.CENTER);
   
    }
    public String estadoJComboReport() {
    	return buttonsMenu.estadoJComboReport();  
    }
	public void changeLanguageButtonsMenu(){
		buttonsMenu.changeLanguage();
	}
}
