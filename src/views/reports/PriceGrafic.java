package views.reports;	

	import java.awt.Color;
	import java.awt.Graphics;

import models.FishFarm;


	public class PriceGrafic extends javax.swing.JFrame {


		private static final long serialVersionUID = 1L;
		private FishFarm farm;

	    public PriceGrafic() {
	        initComponents();
	        this.setLocationRelativeTo(null);
	    }
	    


	    private void initComponents() {



	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);


	                                            
	        repaint();
	    }                                        


	    public static void main(String args[]) {

	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(PriceGrafic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(PriceGrafic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(PriceGrafic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(PriceGrafic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new PriceGrafic().setVisible(true);
	            }
	        });
	    }

	    // Variables declaration - do not modify                     

	    // End of variables declaration                   

	    public void paint(Graphics g){
	        super.paint(g); 
	            int total_votos = (int)(farm.averageSpecieCounter("TRUCHA") + farm.averageSpecieCounter("CAMACHA") + farm.averageSpecieCounter("CARPA"));
	            
	            double grados_rojo = farm.averageSpecieCounter("TRUCHA") * 360 / total_votos;
	            double grados_verde = farm.averageSpecieCounter("CAMACHA") * 360 / total_votos;
	            double grados_azul = farm.averageSpecieCounter("CARPA") * 360 / total_votos;
	            
	            g.setColor(new Color(255, 0, 0));
	            g.fillArc(25, 80, 200, 200, 0, (int) grados_rojo);
	            g.fillRect(250, 120, 20, 20);
	            g.drawString("Color Rojo", 275, 135);
	            
	            g.setColor(new Color(0, 130, 0));
	            g.fillArc(25, 80, 200, 200, (int) grados_rojo, (int)grados_verde);
	            g.fillRect(250, 150, 20, 20);
	            g.drawString("Color Verde", 275, 165);
	            
	            g.setColor(new Color(0, 0, 255));
	            g.fillArc(25, 80, 200, 200, (int)grados_rojo + (int)grados_verde, (int)grados_azul);
	            g.fillRect(250, 180, 20, 20);
	            g.drawString("Color Azul", 275, 195);
	        }
	    }




