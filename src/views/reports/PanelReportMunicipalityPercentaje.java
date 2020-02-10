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
    	setPreferredSize(new Dimension(1000, 590));
        initComponents();
        setBackground(new Color(15, 15, 15));    
    }
    
                    
    private void initComponents() {
        repaint();  
    }
                
    public void datas() {
    	
    }
    public void paint(Graphics g){
        super.paint(g);
  
            int long_red = (int)((double)municipality.get(TypeMunicipality.ALMEIDA.getName()));
            int long_green = (int)((double)municipality.get(TypeMunicipality.AQUITANA.getName()));
            int long_blue = (int)((double)municipality.get(TypeMunicipality.ARCABUCO.getName()));
            int long_orange = (int)((double)municipality.get(TypeMunicipality.BELEN.getName()));
            int long_yellow = (int)((double)municipality.get(TypeMunicipality.BERBEO.getName()));
            int long_pink = (int)((double)municipality.get(TypeMunicipality.BETEITIVA.getName()));
            int long_gray = (int)((double)municipality.get(TypeMunicipality.BOAVITA.getName()));
            int long_cian = (int)((double)municipality.get(TypeMunicipality.BOYACA.getName()));
            int long_magenta = (int)((double)municipality.get(TypeMunicipality.BRICEÑO.getName()));
            int long_black = (int)((double)municipality.get(TypeMunicipality.CAMPOHERMOSO.getName()));
            int long_lightGray = (int)((double)municipality.get(TypeMunicipality.CHINAVITA.getName()));
            int chiquinquira = (int)((double)municipality.get(TypeMunicipality.CHIQUINQUIRA.getName()));
            int chisca = (int)((double)municipality.get(TypeMunicipality.CHISCAS.getName()));
            int chivor =(int)((double)municipality.get(TypeMunicipality.CHIVOR.getName()));
            int coper = (int)((double)municipality.get(TypeMunicipality.COPER.getName()));
            int covarachia =(int)((double)municipality.get(TypeMunicipality.COVARACHIA.getName()));
            int cubara = (int)((double)municipality.get(TypeMunicipality.COVARACHIA.getName()));
            int duitama =(int)((double)municipality.get(TypeMunicipality.DUITAMA.getName()));
            int cocuy =(int)((double)municipality.get(TypeMunicipality.EL_COCUY.getName()));
            int gameza = (int)((double)municipality.get(TypeMunicipality.GAMEZA.getName()));
            int garagoa = (int)((double)municipality.get(TypeMunicipality.GARAGOA.getName()));
            int gucamayas = (int)((double)municipality.get(TypeMunicipality.GUACAMAYAS.getName()));
            int guayatan = (int)((double)municipality.get(TypeMunicipality.GUAYATAN.getName()));
            int guican = (int)((double)municipality.get(TypeMunicipality.GUICAN.getName()));
            int jenesano = (int)((double)municipality.get(TypeMunicipality.JENESANO.getName()));
            int labranzagrande = (int)((double)municipality.get(TypeMunicipality.LABRANZAGRANDE.getName()));
            int laUvita = (int)((double)municipality.get(TypeMunicipality.LA_UVITA.getName()));
            int laVictoria = (int)((double)municipality.get(TypeMunicipality.LA_VICTORIA.getName()));
            int maripi = (int)((double)municipality.get(TypeMunicipality.MARIPI.getName()));
            int miraflores = (int)((double)municipality.get(TypeMunicipality.MIRAFLORES.getName()));
            int mongui = (int)((double)municipality.get(TypeMunicipality.MONGUI.getName()));
            int moniquira = (int)((double)municipality.get(TypeMunicipality.MONIQUIRA.getName()));
            int muzo = (int)((double)municipality.get(TypeMunicipality.MUZO.getName()));
            int otanche = (int)((double)municipality.get(TypeMunicipality.OTANCHE.getName()));
            int pachavita = (int)((double)municipality.get(TypeMunicipality.PACHAVITA.getName()));
            int paez = (int)((double)municipality.get(TypeMunicipality.PAEZ.getName()));
            int paipa = (int)((double)municipality.get(TypeMunicipality.PAIPA.getName()));
            int pajarito = (int)((double)municipality.get(TypeMunicipality.PAJARITO.getName()));
            int panqueba = (int)((double)municipality.get(TypeMunicipality.PANQUEBA.getName()));
            int pauna = (int)((double)municipality.get(TypeMunicipality.PAUNA.getName()));
            int paya = (int)((double)municipality.get(TypeMunicipality.PAYA.getName()));
            int pazDelRio = (int)((double)municipality.get(TypeMunicipality.PAZ_DEL_RIO.getName()));
            int pesca = (int)((double)municipality.get(TypeMunicipality.PESCA.getName()));
            int pisba = (int)((double)municipality.get(TypeMunicipality.PISBA.getName()));
            int puertoBoyaca = (int)((double)municipality.get(TypeMunicipality.PUERTO_BOYACA.getName()));
            int quipama = (int)((double)municipality.get(TypeMunicipality.QUIPAMA.getName()));
            int raquira = (int)((double)municipality.get(TypeMunicipality.RAQUIRA.getName()));
            int saboya = (int)((double)municipality.get(TypeMunicipality.SABOYA.getName()));
            int samaca = (int)((double)municipality.get(TypeMunicipality.SAMACA.getName()));
            int sanEduardo = (int)((double)municipality.get(TypeMunicipality.SAN_EDUARDO.getName()));
            int sanJoseDePare = (int)((double)municipality.get(TypeMunicipality.SAN_JOSE_DE_PARE.getName()));
            int sanLuisDeGaceno = (int)((double)municipality.get(TypeMunicipality.SAN_LUIS_DE_GACENO.getName()));
            int sanMateo = (int)((double)municipality.get(TypeMunicipality.SAN_MATEO.getName()));
            int sanPabloDeBorb = (int)((double)municipality.get(TypeMunicipality.SAN_PABLO_DE_BORB.getName()));
            int sanPabloDeBorbur = (int)((double)municipality.get(TypeMunicipality.SAN_PABLO_DE_BORBUR.getName()));
            int santaMaria = (int)((double)municipality.get(TypeMunicipality.SANTA_MARIA.getName()));
            int santana = (int)((double)municipality.get(TypeMunicipality.SANTANA.getName()));
            int santaRosaDeViterbo = (int)((double)municipality.get(TypeMunicipality.SANTA_ROSA_DE_VITERBO.getName()));
            int sativanorte = (int)((double)municipality.get(TypeMunicipality.SATIVANORTE.getName()));
            int sativasur = (int)((double)municipality.get(TypeMunicipality.SATIVASUR.getName()));
            int soata = (int)((double)municipality.get(TypeMunicipality.SOATA.getName()));
            int socota = (int)((double)municipality.get(TypeMunicipality.SOCOTA.getName()));
            int sogamoso = (int)((double)municipality.get(TypeMunicipality.SOGAMOSO.getName()));
            int somondonco = (int)((double)municipality.get(TypeMunicipality.SOMONDONCO.getName()));
            int soraca= (int)((double)municipality.get(TypeMunicipality.SORACA.getName()));
            int sotaquira = (int)((double)municipality.get(TypeMunicipality.SOTAQUIRA.getName()));
            int susacon = (int)((double)municipality.get(TypeMunicipality.SUSACON.getName()));
            int sutamarchan = (int)((double)municipality.get(TypeMunicipality.SUTAMARCHAN.getName()));
            int tasco = (int)((double)municipality.get(TypeMunicipality.TASCO.getName()));
            int tibana = (int)((double)municipality.get(TypeMunicipality.TIBANA.getName()));
            int tinjaca = (int)((double)municipality.get(TypeMunicipality.TINJACA.getName()));
            int togui = (int)((double)municipality.get(TypeMunicipality.TOGUI.getName()));
            int tunungua = (int)((double)municipality.get(TypeMunicipality.TUNUNGUA.getName()));
            int turmeque = (int)((double)municipality.get(TypeMunicipality.TURMEQUE.getName()));
            int tutaza = (int)((double)municipality.get(TypeMunicipality.TUTAZA.getName()));
            int umbita = (int)((double)municipality.get(TypeMunicipality.UMBITA.getName()));
            int ventaquemada = (int)((double)municipality.get(TypeMunicipality.VENTAQUEMADA.getName()));
            int viracacha = (int)((double)municipality.get(TypeMunicipality.VIRACACHA.getName()));
            int zetaquira = (int)((double)municipality.get(TypeMunicipality.ZETAQUIRA.getName()));
            
            int total = long_red + long_green + long_blue + long_orange +long_yellow + long_pink + long_gray + long_cian + long_magenta + long_lightGray + long_black + chisca
            		+chiquinquira+chivor+coper+covarachia+cubara+duitama+cocuy+gameza+garagoa+gucamayas+guayatan+guican+jenesano+labranzagrande+laUvita+laVictoria+maripi+miraflores+
            		mongui+moniquira+muzo+otanche+pachavita+paez+paipa+pajarito+panqueba+pauna+paya+pazDelRio+pesca+pisba+puertoBoyaca+quipama+raquira+saboya+samaca+sanEduardo+
            		sanJoseDePare+sanLuisDeGaceno+sanMateo+sanPabloDeBorb+sanPabloDeBorbur+santaMaria+santana+santaRosaDeViterbo+sativanorte+sativasur+soata+socota+sogamoso+
            		somondonco+soraca+sotaquira+susacon+sutamarchan+tasco+tibana+tinjaca+togui+tunungua+turmeque+tutaza+umbita+ventaquemada+viracacha+zetaquira;
            		
            int g_long_red = (long_red * 360 )/ total;
            int g_long_green = (long_green * 360) / total;
            int g_long_blue = (long_blue * 360 )/ total;
            int g_long_orange = (long_orange * 360) / total;
            int g_long_yellow = (long_yellow * 360) / total;
            int g_long_pink =( long_pink * 360 )/ total;
            int g_long_gray = (long_gray * 360 )/ total;
            int g_long_cian = (long_cian * 360 )/ total;
            int g_long_magenta =( long_magenta * 360) / total;
            int g_long_black = (long_black * 360 )/ total;
            int g_long_lightGray = (long_lightGray * 360) / total;
            int g_chiquinquira =( chiquinquira * 360) / total;
            int g_chisca = (chisca * 360) / total;
            int g_chivor = (chivor * 360) / total;
            int g_coper = ((coper * 360 )/ total)+1;
            int g_covarachia = (covarachia * 360) / total;
            int g_cubara = (cubara * 360 )/ total;
            int g_duitama =( duitama * 360) / total;
            int g_cocuy = (cocuy * 360 )/ total;
            int g_gameza = (gameza * 360 )/ total;
            int g_garagoa =(( garagoa * 360 )/ total)+1;
            int g_gucamayas = (gucamayas * 360) / total;
            int g_guayatan =( guayatan * 360) / total;
            int g_guican = (guican * 360) / total;
            int g_jenesano = (jenesano * 360 )/ total;
            int g_labranzagrande = (labranzagrande * 360) / total;
            int g_laUvita = (laUvita * 360) / total;
            int g_laVictoria = ((laVictoria * 360 )/ total)+1;
            int g_maripi = (maripi * 360 )/ total;
            int g_miraflores = (( miraflores* 360) / total)+1;
            int g_mongui = (mongui * 360 )/ total;
            int g_moniquira =( moniquira * 360 )/ total;
            int g_muzo = (muzo * 360) / total;
            int g_otanche = (otanche * 360) / total;
            int g_pachavita = (pachavita * 360 )/ total;
            int g_paez = ((paez * 360 )/ total)+1;
            int g_paipa = (paipa * 360) / total;
            int g_pajarito = (pajarito * 360 )/ total;
            int g_panqueba = (panqueba * 360 )/ total;
            int g_pauna = (pauna * 360) / total;
            int g_paya = (paya * 360 )/ total;
            int g_pazDelRio = (pazDelRio * 360) / total;
            int g_pesca = (pesca * 360) / total;
            int g_pisba = (pisba * 360) / total;
            int g_puertoBoyaca =( puertoBoyaca * 360) / total;
            int g_quipama = (quipama * 360) / total;
            int g_raquira = (raquira * 360) / total;
            int g_saboya = (saboya * 360) / total;
            int g_samaca = (samaca * 360) / total;
            int g_sanEduardo =( sanEduardo * 360 )/ total;
            int g_sanJoseDePare = (sanJoseDePare * 360) / total;
            int g_sanLuisDeGaceno = (sanLuisDeGaceno * 360) / total;
            int g_sanMateo = (sanMateo * 360) / total;
            int g_sanPabloDeBorb = (sanPabloDeBorb * 360) / total;
            int g_sanPabloDeBorbur = (sanPabloDeBorbur * 360) / total;
            int g_santaMaria = (santaMaria * 360 )/ total;
            int g_santana = (santana * 360 )/ total;
            int g_santaRosaDeViterbo =( santaRosaDeViterbo * 360) / total;
            int g_sativanorte = (sativanorte * 360) / total;
            int g_sativasur = (sativasur * 360 )/ total;
            int g_soata = ((soata * 360) / total)+1;
            int g_socota = (socota * 360 )/ total;
            int g_sogamoso = (sogamoso * 360) / total;
            int g_somondonco = (somondonco * 360) / total;
            int g_soraca= (soraca * 360) / total;
            int g_sotaquira = (sotaquira * 360) / total;
            int g_susacon = (susacon * 360) / total;
            int g_sutamarchan = (sutamarchan * 360) / total;
            int g_tasco = (tasco * 360) / total;
            int g_tibana = (tibana * 360) / total;
            int g_tinjaca = (tinjaca * 360) / total;
            int g_togui = (togui * 360) / total;
            int g_tunungua = (tunungua * 360 )/ total;
            int g_turmeque = (turmeque * 360) / total;
            int g_tutaza = (tutaza * 360 )/ total;
            int g_umbita = (umbita * 360) / total;
            int g_ventaquemada = (ventaquemada * 360 )/ total;
            int g_viracacha = (viracacha * 360) / total;
            int g_zetaquira = ((zetaquira * 360) / total);
            
         
              
            g.setColor(Color.RED);
            g.fillArc(25, 80, 300, 300, 0, g_long_red);
            
            g.drawString(TypeMunicipality.ALMEIDA.getName(), 375, 30);
            
            g.setColor(Color.GREEN);
            g.fillArc(25, 80, 300, 300, g_long_red, g_long_green);
            
            g.drawString(TypeMunicipality.AQUITANA.getName(), 375, 60);
            
            g.setColor(Color.BLUE);
            g.fillArc(25, 80, 300, 300, g_long_red + g_long_green, g_long_blue);
           
            g.drawString(TypeMunicipality.ARCABUCO.getName(), 375, 90);
            
            g.setColor(Color.ORANGE);
            g.fillArc(25, 80, 300, 300, g_long_red + g_long_green + g_long_blue , g_long_orange);
           
            g.drawString(TypeMunicipality.BELEN.getName(), 375, 120);
            
            g.setColor(Color.YELLOW);
            g.fillArc(25, 80, 300, 300, g_long_red + g_long_green + g_long_blue + g_long_orange, g_long_yellow);
           
            g.drawString(TypeMunicipality.BERBEO.getName(), 375, 150);
            
            g.setColor(Color.PINK);
            g.fillArc(25, 80, 300, 300, g_long_red + g_long_green + g_long_blue + g_long_orange + g_long_yellow, g_long_pink);
           
            g.drawString(TypeMunicipality.BETEITIVA.getName(), 375, 180);
            
            g.setColor(Color.GRAY);
            g.fillArc(25, 80, 300, 300, g_long_red + g_long_green + g_long_blue + g_long_orange + g_long_yellow + g_long_pink , g_long_gray);
           
            g.drawString(TypeMunicipality.BOAVITA.getName(), 375, 210);
            
            g.setColor(Color.CYAN);
            g.fillArc(25, 80, 300, 300, g_long_red + g_long_green + g_long_blue + g_long_orange + g_long_yellow + g_long_pink + g_long_gray , g_long_cian);
           
            g.drawString(TypeMunicipality.BOYACA.getName(), 375, 240);
            
            g.setColor(Color.MAGENTA);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian,g_long_magenta);
        
            g.drawString(TypeMunicipality.BRICEÑO.getName(), 375, 270);
            
            g.setColor(Color.WHITE);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta,g_long_black);
            
            g.drawString(TypeMunicipality.CAMPOHERMOSO.getName(), 375, 300);
            
            g.setColor(Color.LIGHT_GRAY);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black,g_long_lightGray);
           
            g.drawString(TypeMunicipality.CHINAVITA.getName(), 375, 330);
            
            g.setColor(Constants.GRAY);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray,g_chiquinquira);
          
            g.drawString(TypeMunicipality.CHIQUINQUIRA.getName(), 375, 360);
            
            g.setColor(Constants.GRAY_RED);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira,g_chisca);
          
            g.drawString(TypeMunicipality.CHISCAS.getName(), 375, 390);
            
            g.setColor(Constants.COLOR_1);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca,g_chivor);
        
            g.drawString(TypeMunicipality.CHIVOR.getName(), 375, 420);
            
            g.setColor(Constants.COLOR_2);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor,g_coper);
         
            g.drawString(TypeMunicipality.COPER.getName(), 375, 450);
            
            g.setColor(Constants.COLOR_3);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper,g_covarachia);
        
            g.drawString(TypeMunicipality.COVARACHIA.getName(), 375, 480);
            
            g.setColor(Constants.COLOR_4);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia,g_cubara);
            
            g.drawString(TypeMunicipality.CUBARA.getName(), 375, 510);
            
            g.setColor(Constants.COLOR_5);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara, g_duitama);
            
            g.drawString(TypeMunicipality.DUITAMA.getName(), 500, 30);
            
            g.setColor(Constants.COLOR_6);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama,g_cocuy);
           
            g.drawString(TypeMunicipality.EL_COCUY.getName(), 500, 60);
            
            g.setColor(Constants.COLOR_7);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy,g_gameza);
            
            g.drawString(TypeMunicipality.GAMEZA.getName(), 500, 90);
            
            g.setColor(Constants.COLOR_8);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza,g_garagoa);
            
            g.drawString(TypeMunicipality.GARAGOA.getName(), 500, 120);
            
            g.setColor(Constants.COLOR_9);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa,g_gucamayas);
            
            g.drawString(TypeMunicipality.GUACAMAYAS.getName(), 500, 150);
            
            g.setColor(Constants.COLOR_10);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas,g_guayatan);
           
            g.drawString(TypeMunicipality.GUAYATAN.getName(), 500, 180);
            
            g.setColor(Constants.COLOR_11);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan,g_guican);
           
            g.drawString(TypeMunicipality.GUICAN.getName(), 500, 210);
            
            g.setColor(Constants.COLOR_12);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican,g_jenesano);
            
            g.drawString(TypeMunicipality.JENESANO.getName(), 500, 240);
            
            g.setColor(Constants.COLOR_13);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano,g_laUvita);
            
            g.drawString(TypeMunicipality.LA_UVITA.getName(), 500, 270);
            
            g.setColor(Constants.COLOR_14);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita,g_laVictoria);
           
            g.drawString(TypeMunicipality.LA_VICTORIA.getName(), 500, 300);
            
            g.setColor(Constants.COLOR_15);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria,g_labranzagrande);
            
            g.drawString(TypeMunicipality.LABRANZAGRANDE.getName(), 500, 330);
            
            g.setColor(Constants.COLOR_16);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande,g_maripi);
          
            g.drawString(TypeMunicipality.MARIPI.getName(), 500, 360);
            
            g.setColor(Constants.COLOR_17);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi,g_miraflores);
            
            g.drawString(TypeMunicipality.MIRAFLORES.getName(), 500, 390);
            
            g.setColor(Constants.COLOR_18);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores,g_mongui);
            
            g.drawString(TypeMunicipality.MONGUI.getName(), 500, 420);
            
            g.setColor(Constants.COLOR_19);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui,g_moniquira);
           
            g.drawString(TypeMunicipality.MONIQUIRA.getName(), 500, 450);
            
            g.setColor(Constants.COLOR_20);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira, g_muzo);
            g.drawString(TypeMunicipality.MUZO.getName(), 500, 480);
            
            g.setColor(Constants.COLOR_21);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo,g_otanche);
            
            g.drawString(TypeMunicipality.OTANCHE.getName(), 500, 510);
            
            g.setColor(Constants.COLOR_22);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche,g_pachavita);
        
            g.drawString(TypeMunicipality.PACHAVITA.getName(), 625, 30);
            
            g.setColor(Constants.COLOR_23);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita,g_paez);
            
            g.drawString(TypeMunicipality.PAEZ.getName(), 625, 60);
            
            g.setColor(Constants.COLOR_24);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez,g_paipa);
        
            g.drawString(TypeMunicipality.PAIPA.getName(), 625, 90);
            
            g.setColor(Constants.COLOR_25);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa,g_pajarito);
           
            g.drawString(TypeMunicipality.PAJARITO.getName(), 625, 120);
            
            g.setColor(Constants.COLOR_26);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito, g_panqueba);
            
            g.drawString(TypeMunicipality.PANQUEBA.getName(), 625, 150);
            
            g.setColor(Constants.COLOR_28);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba,g_pauna);
           
            g.drawString(TypeMunicipality.PAUNA.getName(), 625, 180);
            
            g.setColor(Constants.COLOR_29);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna,g_paya);
            
            g.drawString(TypeMunicipality.PAYA.getName(), 625, 210);
            
            g.setColor(Constants.COLOR_30);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya,g_pazDelRio);
            
            g.drawString(TypeMunicipality.PAZ_DEL_RIO.getName(),625, 240);
            
            g.setColor(Constants.COLOR_31);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio,g_pesca);
            
            g.drawString(TypeMunicipality.PESCA.getName(), 625, 270);
            
            g.setColor(Constants.COLOR_32);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca,g_pisba);
            
            g.drawString(TypeMunicipality.PISBA.getName(), 625, 300);
            
            g.setColor(Constants.COLOR_33);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba,g_puertoBoyaca);
           
            g.drawString(TypeMunicipality.PUERTO_BOYACA.getName(), 625, 330);
            
            g.setColor(Constants.COLOR_34);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca, g_quipama);
          
            g.drawString(TypeMunicipality.QUIPAMA.getName(), 625, 360);
            
            g.setColor(Constants.COLOR_35);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama,g_raquira);
           
            g.drawString(TypeMunicipality.RAQUIRA.getName(), 625, 390);
            
            g.setColor(Constants.COLOR_36);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira,g_saboya);
            
            g.drawString(TypeMunicipality.SABOYA.getName(), 625, 420);
            
            g.setColor(Constants.COLOR_37);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira+g_saboya,g_samaca);
           
            g.drawString(TypeMunicipality.SAMACA.getName(), 625, 450);
            
            g.setColor(Constants.COLOR_38);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira+g_saboya+g_samaca, g_sanEduardo);
            
            g.drawString(TypeMunicipality.SAN_EDUARDO.getName(), 625, 480);
            
            g.setColor(Constants.COLOR_39);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira+g_saboya+g_samaca+g_sanEduardo,g_sanJoseDePare);
            
            g.drawString(TypeMunicipality.SAN_JOSE_DE_PARE.getName(),625, 510);
            
            g.setColor(Constants.COLOR_40);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira+g_saboya+g_samaca+g_sanEduardo+g_sanJoseDePare,g_sanLuisDeGaceno);
            
            g.drawString(TypeMunicipality.SAN_LUIS_DE_GACENO.getName(), 750, 30);
            
            g.setColor(Constants.COLOR_41);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira+g_saboya+g_samaca+g_sanEduardo+g_sanJoseDePare+g_sanLuisDeGaceno,g_sanMateo);
            
            g.drawString(TypeMunicipality.SAN_MATEO.getName(), 750, 60);
            
            g.setColor(Constants.COLOR_42);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira+g_saboya+g_samaca+g_sanEduardo+g_sanJoseDePare+g_sanLuisDeGaceno+g_sanMateo,g_sanPabloDeBorb);
            
            g.drawString(TypeMunicipality.SAN_PABLO_DE_BORB.getName(), 750, 90);
            
            g.setColor(Constants.COLOR_43);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira+g_saboya+g_samaca+g_sanEduardo+g_sanJoseDePare+g_sanLuisDeGaceno+g_sanMateo+g_sanPabloDeBorb,g_sanPabloDeBorbur);
           
            g.drawString(TypeMunicipality.SAN_PABLO_DE_BORBUR.getName(), 750, 120);
            
            g.setColor(Constants.COLOR_44);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira+g_saboya+g_samaca+g_sanEduardo+g_sanJoseDePare+g_sanLuisDeGaceno+g_sanMateo+g_sanPabloDeBorb+g_sanPabloDeBorbur,g_santaMaria);
           
            g.drawString(TypeMunicipality.SANTA_MARIA.getName(), 750, 150);
            
            g.setColor(Constants.COLOR_45);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira+g_saboya+g_samaca+g_sanEduardo+g_sanJoseDePare+g_sanLuisDeGaceno+g_sanMateo+g_sanPabloDeBorb+g_sanPabloDeBorbur+g_santaMaria,g_santana);
           
            g.drawString(TypeMunicipality.SANTANA.getName(), 750, 180);
            
            g.setColor(Constants.COLOR_46);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira+g_saboya+g_samaca+g_sanEduardo+g_sanJoseDePare+g_sanLuisDeGaceno+g_sanMateo+g_sanPabloDeBorb+g_sanPabloDeBorbur+g_santaMaria+g_santana,g_santaRosaDeViterbo);
           
            g.drawString(TypeMunicipality.SANTA_ROSA_DE_VITERBO.getName(), 750, 210);
            
            g.setColor(Constants.COLOR_47);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira+g_saboya+g_samaca+g_sanEduardo+g_sanJoseDePare+g_sanLuisDeGaceno+g_sanMateo+g_sanPabloDeBorb+g_sanPabloDeBorbur+g_santaMaria+g_santana+g_santaRosaDeViterbo,g_sativanorte);
            
            g.drawString(TypeMunicipality.SATIVANORTE.getName(), 750, 240);
            
            g.setColor(Constants.COLOR_48);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira+g_saboya+g_samaca+g_sanEduardo+g_sanJoseDePare+g_sanLuisDeGaceno+g_sanMateo+g_sanPabloDeBorb+g_sanPabloDeBorbur+g_santaMaria+g_santana+g_santaRosaDeViterbo+g_sativanorte,g_sativasur);
            
            g.drawString(TypeMunicipality.SATIVASUR.getName(), 750, 270);
            
            g.setColor(Constants.COLOR_49);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira+g_saboya+g_samaca+g_sanEduardo+g_sanJoseDePare+g_sanLuisDeGaceno+g_sanMateo+g_sanPabloDeBorb+g_sanPabloDeBorbur+g_santaMaria+g_santana+g_santaRosaDeViterbo+g_sativanorte+g_sativasur,g_soata);
            
            g.drawString(TypeMunicipality.SOATA.getName(), 750, 300);
            
            g.setColor(Constants.COLOR_50);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira+g_saboya+g_samaca+g_sanEduardo+g_sanJoseDePare+g_sanLuisDeGaceno+g_sanMateo+g_sanPabloDeBorb+g_sanPabloDeBorbur+g_santaMaria+g_santana+g_santaRosaDeViterbo+g_sativanorte+g_sativasur+g_soata,g_socota);
            
            g.drawString(TypeMunicipality.SOCOTA.getName(), 750, 330);
            
            g.setColor(Constants.COLOR_51);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira+g_saboya+g_samaca+g_sanEduardo+g_sanJoseDePare+g_sanLuisDeGaceno+g_sanMateo+g_sanPabloDeBorb+g_sanPabloDeBorbur+g_santaMaria+g_santana+g_santaRosaDeViterbo+g_sativanorte+g_sativasur+g_soata+g_socota,g_sogamoso);
            
            g.drawString(TypeMunicipality.SOGAMOSO.getName(), 750, 360);
            
            g.setColor(Constants.COLOR_52);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira+g_saboya+g_samaca+g_sanEduardo+g_sanJoseDePare+g_sanLuisDeGaceno+g_sanMateo+g_sanPabloDeBorb+g_sanPabloDeBorbur+g_santaMaria+g_santana+g_santaRosaDeViterbo+g_sativanorte+g_sativasur+g_soata+g_socota+g_sogamoso,g_somondonco);
            
            g.drawString(TypeMunicipality.SOMONDONCO.getName(), 750, 390);
            
            g.setColor(Constants.COLOR_53);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira+g_saboya+g_samaca+g_sanEduardo+g_sanJoseDePare+g_sanLuisDeGaceno+g_sanMateo+g_sanPabloDeBorb+g_sanPabloDeBorbur+g_santaMaria+g_santana+g_santaRosaDeViterbo+g_sativanorte+g_sativasur+g_soata+g_socota+g_sogamoso+g_somondonco,g_soraca);
            
            g.drawString(TypeMunicipality.SORACA.getName(), 750, 420);
            
            g.setColor(Constants.COLOR_54);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira+g_saboya+g_samaca+g_sanEduardo+g_sanJoseDePare+g_sanLuisDeGaceno+g_sanMateo+g_sanPabloDeBorb+g_sanPabloDeBorbur+g_santaMaria+g_santana+g_santaRosaDeViterbo+g_sativanorte+g_sativasur+g_soata+g_socota+g_sogamoso+g_somondonco+g_soraca,g_sotaquira);
            
            g.drawString(TypeMunicipality.SOTAQUIRA.getName(), 750, 450);
            
            g.setColor(Constants.COLOR_55);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira+g_saboya+g_samaca+g_sanEduardo+g_sanJoseDePare+g_sanLuisDeGaceno+g_sanMateo+g_sanPabloDeBorb+g_sanPabloDeBorbur+g_santaMaria+g_santana+g_santaRosaDeViterbo+g_sativanorte+g_sativasur+g_soata+g_socota+g_sogamoso+g_somondonco+g_soraca+g_sotaquira,g_susacon);
           
            g.drawString(TypeMunicipality.SUSACON.getName(), 750, 480);
            
            g.setColor(Constants.COLOR_56);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira+g_saboya+g_samaca+g_sanEduardo+g_sanJoseDePare+g_sanLuisDeGaceno+g_sanMateo+g_sanPabloDeBorb+g_sanPabloDeBorbur+g_santaMaria+g_santana+g_santaRosaDeViterbo+g_sativanorte+g_sativasur+g_soata+g_socota+g_sogamoso+g_somondonco+g_soraca+g_sotaquira+g_susacon,g_sutamarchan);
            
            g.drawString(TypeMunicipality.SUTAMARCHAN.getName(), 750, 510);
            
            g.setColor(Constants.COLOR_57);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira+g_saboya+g_samaca+g_sanEduardo+g_sanJoseDePare+g_sanLuisDeGaceno+g_sanMateo+g_sanPabloDeBorb+g_sanPabloDeBorbur+g_santaMaria+g_santana+g_santaRosaDeViterbo+g_sativanorte+g_sativasur+g_soata+g_socota+g_sogamoso+g_somondonco+g_soraca+g_sotaquira+g_susacon+g_sutamarchan,g_tasco);
            
            g.drawString(TypeMunicipality.TASCO.getName(), 900, 30);
            
            g.setColor(Constants.COLOR_58);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira+g_saboya+g_samaca+g_sanEduardo+g_sanJoseDePare+g_sanLuisDeGaceno+g_sanMateo+g_sanPabloDeBorb+g_sanPabloDeBorbur+g_santaMaria+g_santana+g_santaRosaDeViterbo+g_sativanorte+g_sativasur+g_soata+g_socota+g_sogamoso+g_somondonco+g_soraca+g_sotaquira+g_susacon+g_sutamarchan+g_tasco,g_tibana);
            
            g.drawString(TypeMunicipality.TIBANA.getName(), 900, 60);
            
            g.setColor(Constants.COLOR_59);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira+g_saboya+g_samaca+g_sanEduardo+g_sanJoseDePare+g_sanLuisDeGaceno+g_sanMateo+g_sanPabloDeBorb+g_sanPabloDeBorbur+g_santaMaria+g_santana+g_santaRosaDeViterbo+g_sativanorte+g_sativasur+g_soata+g_socota+g_sogamoso+g_somondonco+g_soraca+g_sotaquira+g_susacon+g_sutamarchan+g_tasco+g_tibana,g_tinjaca);
            
            g.drawString(TypeMunicipality.TINJACA.getName(), 900, 90);
            
            g.setColor(Constants.COLOR_60);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira+g_saboya+g_samaca+g_sanEduardo+g_sanJoseDePare+g_sanLuisDeGaceno+g_sanMateo+g_sanPabloDeBorb+g_sanPabloDeBorbur+g_santaMaria+g_santana+g_santaRosaDeViterbo+g_sativanorte+g_sativasur+g_soata+g_socota+g_sogamoso+g_somondonco+g_soraca+g_sotaquira+g_susacon+g_sutamarchan+g_tasco+g_tibana+g_tinjaca,g_togui);
            
            g.drawString(TypeMunicipality.TOGUI.getName(), 900, 120);
            
            g.setColor(Constants.COLOR_61);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira+g_saboya+g_samaca+g_sanEduardo+g_sanJoseDePare+g_sanLuisDeGaceno+g_sanMateo+g_sanPabloDeBorb+g_sanPabloDeBorbur+g_santaMaria+g_santana+g_santaRosaDeViterbo+g_sativanorte+g_sativasur+g_soata+g_socota+g_sogamoso+g_somondonco+g_soraca+g_sotaquira+g_susacon+g_sutamarchan+g_tasco+g_tibana+g_tinjaca+g_togui,g_tunungua);
            
            g.drawString(TypeMunicipality.TUNUNGUA.getName(), 900, 150);
            
            g.setColor(Constants.COLOR_63);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira+g_saboya+g_samaca+g_sanEduardo+g_sanJoseDePare+g_sanLuisDeGaceno+g_sanMateo+g_sanPabloDeBorb+g_sanPabloDeBorbur+g_santaMaria+g_santana+g_santaRosaDeViterbo+g_sativanorte+g_sativasur+g_soata+g_socota+g_sogamoso+g_somondonco+g_soraca+g_sotaquira+g_susacon+g_sutamarchan+g_tasco+g_tibana+g_tinjaca+g_togui+g_tunungua,g_turmeque);
           
            g.drawString(TypeMunicipality.TURMEQUE.getName(),900, 180);
            
            g.setColor(Constants.COLOR_64);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira+g_saboya+g_samaca+g_sanEduardo+g_sanJoseDePare+g_sanLuisDeGaceno+g_sanMateo+g_sanPabloDeBorb+g_sanPabloDeBorbur+g_santaMaria+g_santana+g_santaRosaDeViterbo+g_sativanorte+g_sativasur+g_soata+g_socota+g_sogamoso+g_somondonco+g_soraca+g_sotaquira+g_susacon+g_sutamarchan+g_tasco+g_tibana+g_tinjaca+g_togui+g_tunungua+g_turmeque,g_tutaza);
            
            g.drawString(TypeMunicipality.TUTAZA.getName(), 900, 210);
            
            g.setColor(Constants.COLOR_65);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira+g_saboya+g_samaca+g_sanEduardo+g_sanJoseDePare+g_sanLuisDeGaceno+g_sanMateo+g_sanPabloDeBorb+g_sanPabloDeBorbur+g_santaMaria+g_santana+g_santaRosaDeViterbo+g_sativanorte+g_sativasur+g_soata+g_socota+g_sogamoso+g_somondonco+g_soraca+g_sotaquira+g_susacon+g_sutamarchan+g_tasco+g_tibana+g_tinjaca+g_togui+g_tunungua+g_turmeque+g_tutaza,g_umbita);
            
            g.drawString(TypeMunicipality.UMBITA.getName(), 900, 240);
            
            g.setColor(Constants.COLOR_66);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira+g_saboya+g_samaca+g_sanEduardo+g_sanJoseDePare+g_sanLuisDeGaceno+g_sanMateo+g_sanPabloDeBorb+g_sanPabloDeBorbur+g_santaMaria+g_santana+g_santaRosaDeViterbo+g_sativanorte+g_sativasur+g_soata+g_socota+g_sogamoso+g_somondonco+g_soraca+g_sotaquira+g_susacon+g_sutamarchan+g_tasco+g_tibana+g_tinjaca+g_togui+g_tunungua+g_turmeque+g_tutaza+g_umbita,g_ventaquemada);
           
            g.drawString(TypeMunicipality.VENTAQUEMADA.getName(), 900, 270);
            
            g.setColor(Constants.COLOR_67);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira+g_saboya+g_samaca+g_sanEduardo+g_sanJoseDePare+g_sanLuisDeGaceno+g_sanMateo+g_sanPabloDeBorb+g_sanPabloDeBorbur+g_santaMaria+g_santana+g_santaRosaDeViterbo+g_sativanorte+g_sativasur+g_soata+g_socota+g_sogamoso+g_somondonco+g_soraca+g_sotaquira+g_susacon+g_sutamarchan+g_tasco+g_tibana+g_tinjaca+g_togui+g_tunungua+g_turmeque+g_tutaza+g_umbita+g_ventaquemada,g_viracacha);
            
            g.drawString(TypeMunicipality.VIRACACHA.getName(), 900, 300);
            
            g.setColor(Constants.COLOR_68);
            g.fillArc(25, 80, 300, 300, g_long_red+g_long_green+g_long_blue+g_long_orange+g_long_yellow+g_long_pink+g_long_gray+g_long_cian+g_long_magenta+g_long_black+g_long_lightGray+g_chiquinquira+g_chisca+g_chivor+g_coper+g_covarachia+g_cubara+g_duitama+g_cocuy+g_gameza+g_garagoa+g_gucamayas+g_guayatan+g_guican+g_jenesano+g_laUvita+g_laVictoria+g_labranzagrande+g_maripi+g_miraflores+g_mongui+g_moniquira+g_muzo+g_otanche+g_pachavita+g_paez+g_paipa+g_pajarito+g_panqueba+g_pauna+g_paya+g_pazDelRio+g_pesca+g_pisba+g_puertoBoyaca+g_quipama+g_raquira+g_saboya+g_samaca+g_sanEduardo+g_sanJoseDePare+g_sanLuisDeGaceno+g_sanMateo+g_sanPabloDeBorb+g_sanPabloDeBorbur+g_santaMaria+g_santana+g_santaRosaDeViterbo+g_sativanorte+g_sativasur+g_soata+g_socota+g_sogamoso+g_somondonco+g_soraca+g_sotaquira+g_susacon+g_sutamarchan+g_tasco+g_tibana+g_tinjaca+g_togui+g_tunungua+g_turmeque+g_tutaza+g_umbita+g_ventaquemada+g_viracacha,g_zetaquira);
           
            g.drawString(TypeMunicipality.ZETAQUIRA.getName(), 900, 330);
            
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
