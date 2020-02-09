package views.header;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import views.IconLabel;

public class JPUp extends JPanel{
    
    private static final long serialVersionUID = 1L;
    private IconLabel iconLabel;
    
    public JPUp() {
        BorderLayout borderLayout = new BorderLayout();
        setLayout(borderLayout);
        setBackground(Color.BLACK);
        initComponents();
        setVisible(true);
    }  
    
    public void initComponents(){
    	iconLabel = new IconLabel();
    	iconLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    	iconLabel.setOpaque(false);
    	add(iconLabel, BorderLayout.WEST);
    }

}
