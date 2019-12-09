package views.reports;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.IOException;
import java.util.HashMap;

import javax.swing.JPanel;

import org.json.simple.DeserializationException;

import models.TypeSpecie;
import views.Constants;

public class PanelReporrtPercentajeOfSpeciesInBoyaca  extends JPanel{
	private static final long serialVersionUID = 1L;
	private HashMap<String, Double> percentajeOfSpeciesPriceInBoyaca;

    public PanelReporrtPercentajeOfSpeciesInBoyaca(HashMap<String, Double> percentajeOfSpeciesPriceInBoyaca) throws IOException, DeserializationException {
    	this.percentajeOfSpeciesPriceInBoyaca=percentajeOfSpeciesPriceInBoyaca;
    	setPreferredSize(new Dimension(520,520));
        initComponents();
        setBackground(new Color(15, 15, 15));
        
//        setTitle(Constants.B_PRICE_REPORT);
        
    }
    
                    
    private void initComponents() {
        repaint();  
    }
                
    
    public void paint(Graphics g){
        super.paint(g);
  
            int long_red = (int)(double)percentajeOfSpeciesPriceInBoyaca.get(TypeSpecie.BOCACHICO.getName());
            int long_green = (int)(double)percentajeOfSpeciesPriceInBoyaca.get(TypeSpecie.CACHAMA.getName());
            int long_blue = (int)(double)percentajeOfSpeciesPriceInBoyaca.get(TypeSpecie.CARPA.getName());
            int long_orange = (int)(double)percentajeOfSpeciesPriceInBoyaca.get(TypeSpecie.RTRUCHA.getName());
            int long_yellow = (int)(double)percentajeOfSpeciesPriceInBoyaca.get(TypeSpecie.TILAPIA_NEGRA.getName());
            int long_pink = (int)(double)percentajeOfSpeciesPriceInBoyaca.get(TypeSpecie.TILAPIA_O_MOJARRA.getName());
            int long_gray = (int)(double)percentajeOfSpeciesPriceInBoyaca.get(TypeSpecie.TILAPIA_O_MOJARRA_ROJA.getName());
            int long_cian = (int)(double)percentajeOfSpeciesPriceInBoyaca.get(TypeSpecie.TRUCHA.getName());
            int long_magenta = (int)(double)percentajeOfSpeciesPriceInBoyaca.get(TypeSpecie.UCACHAMA.getName());
            int long_black = (int)(double)percentajeOfSpeciesPriceInBoyaca.get(TypeSpecie.UTILAPIA_NEGRA.getName());
            int long_lightGray = (int)(double)percentajeOfSpeciesPriceInBoyaca.get(TypeSpecie.UTILAPIA_O_MOJARRA.getName());
            
            
            g.setColor(Color.GREEN);
            g.fillRect(170, 100, long_green, 40);
            g.drawString(Constants.CACHAMA, 10, 125);
            
            g.setColor(Color.BLUE);
            g.fillRect(170, 150, long_blue, 40);
            g.drawString(Constants.CARPA, 10, 175);
            
            g.setColor(Color.ORANGE);
            g.fillRect(170, 200, long_orange, 40);
            g.drawString(Constants.RTRUCHA, 10, 225);
            
            g.setColor(Color.YELLOW);
            g.fillRect(170, 250, long_yellow, 40);
            g.drawString(Constants.TILAPIA_NEGRA, 10, 275);
            
            g.setColor(Color.PINK);
            g.fillRect(170, 300, long_pink, 40);
            g.drawString(Constants.TILAPIA_O_MOJARRA, 10, 325);
            
            g.setColor(Color.GRAY);
            g.fillRect(170, 350, long_gray, 40);
            g.drawString(Constants.TILAPIA_O_MOJARRA_ROJA, 10, 375);
            
            g.setColor(Color.CYAN);
            g.fillRect(170, 400, long_cian, 40);
            g.drawString(Constants.TRUCHA, 10, 425);
            
            g.setColor(Color.MAGENTA);
            g.fillRect(170, 450, long_magenta, 40);
            g.drawString(Constants.UCACHAMA, 10, 475);
            
            g.setColor(Color.BLACK);
            g.fillRect(170, 500, long_black, 40);
            g.drawString(Constants.UTILAPIA_NEGRA, 10, 525);
            
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(170, 550, long_lightGray, 40);
            g.drawString(Constants.UTILAPIA_O_MOJARRA, 10, 575);
            
            g.setColor(Color.RED);
            g.fillRect(170, 50, long_red, 40);
            g.drawString(Constants.BOCACHICO, 10, 75);
        }
    @Override 
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int w2 = getWidth() / 2;
        int h2 = getHeight() / 6;
        g2d.rotate(-Math.PI / 4, w2, h2);
        super.paintComponent(g);
    }
}
