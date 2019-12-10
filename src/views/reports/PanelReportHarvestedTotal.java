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

public class PanelReportHarvestedTotal  extends JPanel{
	private static final long serialVersionUID = 1L;
	private HashMap<String, Double> percentajeOfSpeciesPriceInBoyaca;

    public PanelReportHarvestedTotal(HashMap<String, Double> percentajeOfSpeciesPriceInBoyaca) throws IOException, DeserializationException {
    	this.percentajeOfSpeciesPriceInBoyaca=percentajeOfSpeciesPriceInBoyaca;
    	setPreferredSize(new Dimension(520,520));
        initComponents();
        setBackground(new Color(15, 15, 15));    
    }
    
                    
    private void initComponents() {
        repaint();  
    }
                
    
    public void paint(Graphics g){
        super.paint(g);
  
            int long_red = ((int)(double)percentajeOfSpeciesPriceInBoyaca.get(TypeSpecie.BOCACHICO.getName()) /10000)+1;
            int long_green = ((int)(double)percentajeOfSpeciesPriceInBoyaca.get(TypeSpecie.CACHAMA.getName())/10000)+1;
            int long_blue = ((int)(double)percentajeOfSpeciesPriceInBoyaca.get(TypeSpecie.CARPA.getName())/10000)+1;
            int long_orange = ((int)(double)percentajeOfSpeciesPriceInBoyaca.get(TypeSpecie.RTRUCHA.getName())/10000)+1;
            int long_yellow = ((int)(double)percentajeOfSpeciesPriceInBoyaca.get(TypeSpecie.TILAPIA_NEGRA.getName())/10000)+1;
            int long_pink = ((int)(double)percentajeOfSpeciesPriceInBoyaca.get(TypeSpecie.TILAPIA_O_MOJARRA.getName())/10000)+1;
            int long_gray = ((int)(double)percentajeOfSpeciesPriceInBoyaca.get(TypeSpecie.TILAPIA_O_MOJARRA_ROJA.getName())/10000)+1;
            int long_cian = ((int)(double)percentajeOfSpeciesPriceInBoyaca.get(TypeSpecie.TRUCHA.getName())/10000)+1;
            int long_magenta = ((int)(double)percentajeOfSpeciesPriceInBoyaca.get(TypeSpecie.UCACHAMA.getName())/10000)+1;
            int long_black = ((int)(double)percentajeOfSpeciesPriceInBoyaca.get(TypeSpecie.UTILAPIA_NEGRA.getName())/10000)+1;
            int long_lightGray = ((int)(double)percentajeOfSpeciesPriceInBoyaca.get(TypeSpecie.UTILAPIA_O_MOJARRA.getName())/10000)+1;
            
            
            g.setColor(Color.RED);
            g.fillRect(170, 40, long_red, 30);
            g.drawString(Constants.BOCACHICO, 6, 60);
        
            g.setColor(Color.GREEN);
            g.fillRect(170, 80, long_green, 30);
            g.drawString(Constants.CACHAMA, 6, 100);
            
            g.setColor(Color.BLUE);
            g.fillRect(170, 120, long_blue, 30);
            g.drawString(Constants.CARPA, 6, 140);
            
            g.setColor(Color.ORANGE);
            g.fillRect(170, 160, long_orange, 30);
            g.drawString(Constants.RTRUCHA, 6, 180);
            
            g.setColor(Color.YELLOW);
            g.fillRect(170, 200, long_yellow, 30);
            g.drawString(Constants.TILAPIA_NEGRA, 6, 220);
            
            g.setColor(Color.PINK);
            g.fillRect(170, 240, long_pink, 30);
            g.drawString(Constants.TILAPIA_O_MOJARRA, 6, 260);
            
            g.setColor(Color.GRAY);
            g.fillRect(170, 280, long_gray, 30);
            g.drawString(Constants.TILAPIA_O_MOJARRA_ROJA, 6, 300);
            
            g.setColor(Color.CYAN);
            g.fillRect(170, 320, long_cian, 30);
            g.drawString(Constants.TRUCHA, 6, 340);
            
            g.setColor(Color.MAGENTA);
            g.fillRect(170, 360, long_magenta, 30);
            g.drawString(Constants.UCACHAMA, 6, 380);
            
            g.setColor(Color.WHITE);
            g.fillRect(170, 400, long_black, 30);
            g.drawString(Constants.UTILAPIA_NEGRA, 6, 420);
            
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(170, 440, long_lightGray, 30);
            g.drawString(Constants.UTILAPIA_O_MOJARRA, 6, 460);
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
