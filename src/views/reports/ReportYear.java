package views.reports;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.IOException;
import javax.swing.JPanel;
import org.json.simple.DeserializationException;
import models.FishFarm;

public class ReportYear  extends JPanel{
	private static final long serialVersionUID = 1L;
	private FishFarm farm;

    public ReportYear() throws IOException, DeserializationException {
    	farm = new FishFarm();
    	setPreferredSize(new Dimension(520,520));
        initComponents();
        setBackground(new Color(15, 15, 15));        
    }
    
                    
    private void initComponents() {
        repaint();  
    }
                
    
    public void paint(Graphics g){
        super.paint(g);
        
        int int_cian = farm.quantityPondByYear(2016);
        int int_orange = farm.quantityPondByYear(2017);
        int int_yellow = farm.quantityPondByYear(2018);
        
        int total_votos = int_cian + int_orange + int_yellow;
        
        int grados_cian = int_cian * 360 / total_votos;
        int grados_orange = int_orange * 360 / total_votos;
        int grados_yellow = int_yellow * 360 / total_votos;
        
        g.setColor(Color.CYAN);
        g.fillArc(25, 80, 300, 300, 0, grados_cian);
        g.fillRect(350, 120, 20, 20);
        g.drawString("2016", 375, 135);
        
        g.setColor(Color.ORANGE);
        g.fillArc(25, 80, 300, 300, grados_cian, grados_orange);
        g.fillRect(350, 150, 20, 20);
        g.drawString("2017", 375, 165);
        
        g.setColor(Color.YELLOW);
        g.fillArc(25, 80, 300, 300, grados_cian + grados_orange, grados_yellow);
        g.fillRect(350, 180, 20, 20);
        g.drawString("2018", 375, 195);
    }
			
}
