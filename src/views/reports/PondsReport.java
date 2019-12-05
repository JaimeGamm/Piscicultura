/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.reports;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.IOException;
import javax.swing.JDialog;
import org.json.simple.DeserializationException;
import models.FishFarm;
import models.TypeSpecie;
import views.Constants;


public class PondsReport extends JDialog {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private FishFarm farm;


    public PondsReport() throws IOException, DeserializationException {
    	farm = new FishFarm();
    	setBounds(500, 80, 0, 0);
        initComponents();
        setBackground(Color.WHITE);
        setTitle(Constants.TITLE_PRICE_RPORT);
        setMinimumSize(new Dimension(600,620));
    }
    
                    
    private void initComponents() {
        repaint();  
    }
                

    public int maxValue(int value_red, int value_green, int value_blue, int value_orange, int value_yellow, int value_pink, int value_gray, int value_cian, int value_magenta, int value_black, int value_lightGrey){
        if(value_red > value_green && value_red > value_blue && value_red > value_orange && value_red > value_yellow && value_red > value_pink && value_red > value_gray && value_red > value_cian && value_red > value_magenta && value_red > value_black && value_red > value_lightGrey){    
            return value_red;
        } else if(value_green > value_blue && value_green > value_orange && value_green > value_yellow && value_green > value_pink && value_green > value_gray && value_green > value_cian && value_green > value_magenta && value_green > value_black && value_green > value_lightGrey){
            return value_green;
        } else if(value_blue > value_orange && value_blue > value_yellow && value_blue > value_pink && value_blue > value_gray && value_blue > value_cian && value_blue > value_magenta && value_blue > value_black && value_blue > value_lightGrey){
            return value_blue;
        } else if(value_orange > value_yellow && value_orange > value_pink && value_orange > value_gray && value_orange > value_cian && value_orange > value_magenta && value_orange > value_black && value_orange > value_lightGrey){
            return value_orange;
        } else if(value_yellow > value_pink && value_yellow > value_gray && value_yellow > value_cian && value_yellow > value_magenta && value_yellow > value_black && value_yellow > value_lightGrey){
            return value_yellow;
        } else if(value_pink > value_gray && value_pink > value_cian && value_pink > value_magenta && value_pink > value_black && value_pink > value_lightGrey){
            return value_pink;
        } else if(value_gray > value_cian && value_gray > value_magenta && value_gray > value_black && value_gray > value_lightGrey){
            return value_gray;
        } else if(value_cian > value_magenta && value_cian > value_black && value_cian > value_lightGrey){
            return value_cian;
        } else if(value_magenta > value_black && value_magenta > value_lightGrey){
            return value_magenta;
        } else if(value_black > value_lightGrey){
            return value_black;
        }else {
        	return value_lightGrey;
        }
    }
    
    public void paint(Graphics g){
        super.paint(g);
            
 
            
            int int_red = farm.calculatePercentage(TypeSpecie.BOCACHICO.getName()) +1;
            int int_green = farm.calculatePercentage(TypeSpecie.CACHAMA.getName()) +1;
            int int_blue = farm.calculatePercentage(TypeSpecie.CARPA.getName()) +1;
            int int_orange = farm.calculatePercentage(TypeSpecie.RTRUCHA.getName()) +1;
            int int_yellow = farm.calculatePercentage(TypeSpecie.TILAPIA_NEGRA.getName()) +1;
            int int_pink = farm.calculatePercentage(TypeSpecie.TILAPIA_O_MOJARRA.getName()) +1;
            int int_gray = farm.calculatePercentage(TypeSpecie.TILAPIA_O_MOJARRA_ROJA.getName()) +1;
            int int_cian = farm.calculatePercentage(TypeSpecie.TRUCHA.getName()) +1;
            int int_magenta = farm.calculatePercentage(TypeSpecie.UCACHAMA.getName()) +1;
            int int_black = farm.calculatePercentage(TypeSpecie.UTILAPIA_NEGRA.getName())+1 ;
            int int_lightGray = farm.calculatePercentage(TypeSpecie.UTILAPIA_O_MOJARRA.getName()) +1;
            
            
            int max_value = maxValue(int_red, int_green, int_blue, int_orange, int_yellow, int_pink, int_gray, int_cian, int_magenta, int_black, int_lightGray);
  
            int long_red = (int)(int_red * 400 / max_value);
            int long_green = (int)(int_green * 400 / max_value);
            int long_blue = (int)(int_blue * 400 / max_value);
            int long_orange = (int)(int_orange * 400 / max_value);
            int long_yellow = (int)(int_yellow * 400 / max_value);
            int long_pink = (int)(int_pink * 400 / max_value);
            int long_gray = (int)(int_gray * 400 / max_value);
            int long_cian = (int)(int_cian * 400 / max_value);
            int long_magenta = (int)(int_magenta * 400 / max_value);
            int long_black = (int)(int_black * 400 / max_value);
            int long_lightGray = (int)(int_lightGray * 400 / max_value);
            
            g.setColor(Color.RED);
            g.fillRect(170, 50, long_red, 40);
            g.drawString(Constants.BOCACHICO, 10, 75);
            
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
        }
    }

