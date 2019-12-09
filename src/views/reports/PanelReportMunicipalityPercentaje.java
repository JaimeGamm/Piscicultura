package views.reports;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.IOException;
import java.util.HashMap;

import javax.swing.JPanel;

import org.json.simple.DeserializationException;

import models.TypeMunicipality;
import views.Constants;

public class PanelReportMunicipalityPercentaje  extends JPanel{
	private static final long serialVersionUID = 1L;
	private HashMap<String, Double> municipality;

    public PanelReportMunicipalityPercentaje(HashMap<String, Double> productionMunicipality) throws IOException, DeserializationException {
    	this.municipality=productionMunicipality;
    	setPreferredSize(new Dimension(520,720));
        initComponents();
        setBackground(new Color(15, 15, 15));
        
//        setTitle(Constants.B_PRICE_REPORT);
        
    }
    
                    
    private void initComponents() {
        repaint();  
    }
                
    public void datas() {
    	
    }
    public void paint(Graphics g){
        super.paint(g);
  
            int long_red = (int)(double)municipality.get(TypeMunicipality.ALMEIDA.getName())+10;
            int long_green = (int)(double)municipality.get(TypeMunicipality.AQUITANA.getName())+10;
            int long_blue = (int)(double)municipality.get(TypeMunicipality.ARCABUCO.getName())+10;
            int long_orange = (int)(double)municipality.get(TypeMunicipality.BELEN.getName())+10;
            int long_yellow = (int)(double)municipality.get(TypeMunicipality.BERBEO.getName())+10;
            int long_pink = (int)(double)municipality.get(TypeMunicipality.BETEITIVA.getName())+10;
            int long_gray = (int)(double)municipality.get(TypeMunicipality.BOAVITA.getName())+10;
            int long_cian = (int)(double)municipality.get(TypeMunicipality.BOYACA.getName())+10;
            int long_magenta = (int)(double)municipality.get(TypeMunicipality.BRICEÑO.getName())+10;
            int long_black = (int)(double)municipality.get(TypeMunicipality.CAMPOHERMOSO.getName())+10;
            int long_lightGray = (int)(double)municipality.get(TypeMunicipality.CHINAVITA.getName())+10;
            int chiquinquira = (int)(double)municipality.get(TypeMunicipality.CHIQUINQUIRA.getName())+10;
            int chisca = (int)(double)municipality.get(TypeMunicipality.CHISCAS.getName())+10;
            int chivor =(int)(double)municipality.get(TypeMunicipality.CHIVOR.getName())+10;
            int coper = (int)(double)municipality.get(TypeMunicipality.COPER.getName())+10;
            int covarachia =(int)(double)municipality.get(TypeMunicipality.COVARACHIA.getName())+10;
            int cubara = (int)(double)municipality.get(TypeMunicipality.COVARACHIA.getName())+10;
            int duitama =(int)(double)municipality.get(TypeMunicipality.DUITAMA.getName())+10;
            int cocuy =(int)(double)municipality.get(TypeMunicipality.EL_COCUY.getName())+10;
            int gameza = (int)(double)municipality.get(TypeMunicipality.GAMEZA.getName())+10;
            int garagoa = (int)(double)municipality.get(TypeMunicipality.GAMEZA.getName())+10;
            
//            g.setColor(Color.YELLOW);
//            g.fillRect(170, 575, chiquinquira, 40);
//            g.drawString(TypeMunicipality.CHIQUINQUIRA.getName(), 10, 625);
//            
//            g.setColor(Color.ORANGE);
//            g.fillRect(170, 625, chisca, 40);
//            g.drawString(TypeMunicipality.CHISCAS.getName(), 10, 675);
//            
            g.setColor(Color.RED);
            g.fillRect(170, 50, long_red, 40);
            g.drawString(TypeMunicipality.ALMEIDA.getName(), 10, 75);
            
            g.setColor(Color.GREEN);
            g.fillRect(170, 100, long_green, 40);
            g.drawString(TypeMunicipality.AQUITANA.getName(), 10, 125);
            
            g.setColor(Color.BLUE);
            g.fillRect(170, 150, long_blue, 40);
            g.drawString(TypeMunicipality.ARCABUCO.getName(), 10, 175);
            
            g.setColor(Color.ORANGE);
            g.fillRect(170, 200, long_orange, 40);
            g.drawString(TypeMunicipality.BELEN.getName(), 10, 225);
            
            g.setColor(Color.YELLOW);
            g.fillRect(170, 250, long_yellow, 40);
            g.drawString(TypeMunicipality.BERBEO.getName(), 10, 275);
            
            g.setColor(Color.PINK);
            g.fillRect(170, 300, long_pink, 40);
            g.drawString(TypeMunicipality.BETEITIVA.getName(), 10, 325);
            
            g.setColor(Color.GRAY);
            g.fillRect(170, 350, long_gray, 40);
            g.drawString(TypeMunicipality.BOAVITA.getName(), 10, 375);
            
            g.setColor(Color.CYAN);
            g.fillRect(170, 400, long_cian, 40);
            g.drawString(TypeMunicipality.BOYACA.getName(), 10, 425);
            
            g.setColor(Color.MAGENTA);
            g.fillRect(170, 450, long_magenta, 40);
            g.drawString(TypeMunicipality.BRICEÑO.getName(), 10, 475);
            
            g.setColor(Color.BLACK);
            g.fillRect(170, 500, long_black, 40);
            g.drawString(TypeMunicipality.CAMPOHERMOSO.getName(), 10, 525);
            
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(170, 550, long_lightGray, 40);
            g.drawString(TypeMunicipality.CHINAVITA.getName(), 10, 575);
            
            
        }
    @Override 
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int w2 = getWidth() / 2;
        int h2 = getHeight() / 2;
        g2d.rotate(-Math.PI / 5, w2, h2);
        super.paintComponent(g);
    }
}
