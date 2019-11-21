package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class JFrameConsole extends JFrame {
	public JFrameConsole(ActionListener actionListener,ArrayList<Object[]> datasFarm) {
		this.setSize(1000, 450); //Ancho y largo de la ventana
		//setLoButtonMenu.javacation(100, 460);
		setExtendedState( MAXIMIZED_BOTH ); 
		setLocationRelativeTo(null);// ESTABLECEMOS EL CENTRO DE LA PANTALLA ActionListener actionListener
		setMinimumSize(new Dimension(200,50)); //minima dimencion de la pantalla
	
		//setLayout(new GridLayout(3, 1));
		//JLabel icono = new JLabel();
		//ImageIcon logo = new ImageIcon("Resources/logo.png");
		//icono.setBounds(10, 10,271 , 136);
		//icono.setIcon(new ImageIcon(logo.getImage().getScaledInstance(icono.getWidth(), icono.getHeight(), Image.SCALE_SMOOTH)));// escalar la imagen
		
		//this.getContentPane().add(icono, BorderLayout.NORTH);
		//JLabel accommodation4= new JLabel("alojamiento",SwingConstants.CENTER); 
//		panelMenu(control);
//		panelCentral();
		initComponents(actionListener,datasFarm);
		setVisible(true);
	}
	
	private void initComponents( ActionListener actionListener,ArrayList<Object[]> datasFarm ) {
		JPMainPanel jpMainPanel = new JPMainPanel(actionListener,datasFarm);
		JScrollPane jScrollPane = new JScrollPane();
		jScrollPane.setViewportView( jpMainPanel );
		this.add( jScrollPane, BorderLayout.CENTER );
		//showDatas(datasFarm);
	}
	
/*	private void addTable() {
		JtableElement jtableElement = new JtableElement();
		this.add(jtableElement,BorderLayout.CENTER);
	}
	public void showDatas(ArrayList<Object[]> datasFarm) {
		JtableElement jtableElement = new JtableElement();
		//jtableElement.setPreferredSize(new Dimension(1000,600));
		for (Object[] objects : datasFarm) {
			jtableElement.addElementTOtable(objects);
		}
		this.add(jtableElement,BorderLayout.CENTER);
		
	}
	
*/
	
	
}
