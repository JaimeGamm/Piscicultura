package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import controller.ActionCompoonet;






public class JPMainPanel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	public JPMainPanel( ActionListener actionListener,ArrayList<Object[]> datasFarm ) {
		setLayout( new BoxLayout( this, BoxLayout.Y_AXIS ));
		initComponents( actionListener,datasFarm );
	}
	
	private void initComponents( ActionListener actionListener,ArrayList<Object[]> datasFarm ) {
		//addTable();
		addBottonesMen(actionListener);
		//addPanelNewCycking(actionListener);
		showDatas(datasFarm);
		/*addPanelMenu( actionListener );
		addPanelTextoImage();
		panelSoult();
		addHoteleBarrato();
		addHoteleBarrato2(); 
		addPanelCentral();
		addOfertasQueNoTePuedesPerder();
		addPagaTusViajes();
		addVuelosBaratos();
		addHoteleBarrato();
		addRentaCarro();
		addComentario();
		addPanelRcibeOferta();*/
	}
	
	private void addTable() {
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
	private void addBottonesMen(ActionListener ls) {
		JButtonMenu addCycling = new JButtonMenu("Agregar ciclista","Resources/AGREGAR2.png");
		addCycling.setPreferredSize(new Dimension(200,200));
		addCycling.addActionListener(ls);
		addCycling.setActionCommand(ActionCompoonet.C_ADD_CYCLING.toString());
		this.add(addCycling,BorderLayout.CENTER);

	}
	private void addPanelNewCycking(ActionListener actionListener) {
		PanelNewCycking panelNewCycking =new PanelNewCycking(actionListener);
		this.add(panelNewCycking,BorderLayout.CENTER);
	}
	
	
	/*	private void addPanelMenu(ActionListener ls) {
		JPanel panelCentralMenu = new JPanel();
		panelCentralMenu.setBackground(Color.decode("#323255"));
		FlowLayout flowLayout=new FlowLayout(FlowLayout.LEFT);
		flowLayout.setHgap(50);
		panelCentralMenu.setLayout(flowLayout);
	
		JpanelIcono jpanelIcono = new JpanelIcono();
		PanelPrincipal panelPrincipal =	new PanelPrincipal();
		JButtonRound jButtonRound= new JButtonRound("DESCUBLE Y VIAJA", "Resources/logo.png", "Resources/DescubreYViaja.png");
		JButttonViajala viajar = new JButttonViajala("VIAJAR");
		JButttonViajala hoteles = new JButttonViajala("HOTELES");
		JButttonViajala blog = new JButttonViajala("BLOG");
		jButtonRound.addActionListener(ls);
		jButtonRound.setActionCommand(ActionCompoonet.C_CANCEL_CREATE_COST.toString());
		jpanelIcono.setPreferredSize(new Dimension(236,100));
		panelCentralMenu.setPreferredSize(new Dimension(1583,100));
	
		panelCentralMenu.add(jpanelIcono);
		panelCentralMenu.add(viajar,BorderLayout.NORTH);
		panelCentralMenu.add(hoteles);
		panelCentralMenu.add(blog);
		panelCentralMenu.setPreferredSize(new Dimension(1236,70));
		panelCentralMenu.setBackground(Color.decode("#323255"));
		
		
		
		
		
		//this.getContentPane().add(panelPrincipal,BorderLayout.WEST);
		this.add(panelCentralMenu,BorderLayout.NORTH);
		//this.getContentPane().add(jButtonRound,BorderLayout.EAST);
	}
	private void addPanelTextoImage() {
		Panel panel = new Panel();
		panel.setBackground(Color.decode("#323255"));
		Panel panelTitle = new Panel();
		FlowLayout flowLayout=new FlowLayout(FlowLayout.LEFT);
		flowLayout.setHgap(50);
		panel.setLayout(flowLayout);
		panelTitle.setLayout(flowLayout);
		JlabelTitulosBotton title= new JlabelTitulosBotton("Busca los mejores hoteles en", 25,Color.white);
		JlabelTitulosBotton title2= new JlabelTitulosBotton("decenas de sitios de viajes", 25,Color.white);
		JlabeIlmage corazon = new JlabeIlmage("Resources/corazon.png",350,250);
		panelTitle.setPreferredSize(new Dimension(400,250));
		panelTitle.add(title);
		panelTitle.add(title2);
		panel.setPreferredSize(new Dimension(600,270));
		panel.add(panelTitle);
		panel.add(corazon);
		this.add(panel);
	}
	public void panelSoult() {
		Panel panel = new Panel();
		panel.setBackground(Color.white);
		panel.setBackground(Color.decode("#323255"));
		FlowLayout flowLayout=new FlowLayout(FlowLayout.LEFT);
		flowLayout.setHgap(50);
		panel.setLayout(flowLayout);
		JpanelButtonCentral panelWest = new JpanelButtonCentral("Ingresa una ciudad, alojamiento","Resources/ubicacion.png");
		JpanelButtonCentral panelWestCiudad = new JpanelButtonCentral("Bogota, colombia","Resources/circulo.png");
		JpanelButtonCentral panelWestCalendario = new JpanelButtonCentral("Ida","Resources/fechas.png",184,50);
		JpanelButtonCentral panelWestVuelta = new JpanelButtonCentral("Vuelta","Resources/fechas.png",184,50);
		
		JButton numeroCamas = new JButton(new ImageIcon("Resources/numeros de camas.png"));
		numeroCamas.setBackground(Color.decode("#323255"));

		numeroCamas.setPreferredSize(new Dimension(150,30));
		numeroCamas.setBackground(Color.white);
		
		//JButton busqueda = new JButton("buscar",new ImageIcon("Resources/buscar.png"));
		JButton busqueda = new JButton(new ImageIcon("Resources/buscar2.png"));
		busqueda.setPreferredSize(new Dimension(115,35));
		busqueda.setOpaque(false);
		//busqueda.setBounds(1, 1, 30, 25);
		busqueda.setBorder(new ButtonRound1(40));
		busqueda.setCursor(new Cursor(Cursor.HAND_CURSOR));
		busqueda.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		//JCalendar calendar = new JCalendar();
		//busqueda.setBackground(Color.blue);
		//busqueda.setBackground(Color.getHSBColor(67, 0, 1120));
		
		panel.add(panelWestCiudad,BorderLayout.WEST );
		panel.add(panelWest);
		panel.add(panelWestCalendario);
		panel.add(panelWestVuelta);
		panel.add(numeroCamas);

		//panel.add(calendar);
		add(panel);

	}
	private void addHoteleBarrato() {
		PanelHotelesBarratos panelHotelesBarratos = new PanelHotelesBarratos();
		this.add(panelHotelesBarratos,BorderLayout.CENTER);

	}
	private void addHoteleBarrato2() {
		JpanelHoteles2 jpanelHoteles2 = new JpanelHoteles2();
		this.add(jpanelHoteles2,BorderLayout.CENTER);

	}
private void addPanelCentral() {
		JpanelPaquetesTuristicos jpanelPaquetesTuristicos = new JpanelPaquetesTuristicos();
		jpanelPaquetesTuristicos.setPreferredSize(new Dimension(1236,210));
		this.add(jpanelPaquetesTuristicos,BorderLayout.CENTER);
		//JpanelAlojamiento jpanelAlojamiento = new JpanelAlojamiento();
		//jpanelAlojamiento.setPreferredSize(new Dimension(1236,500));
		//this.getContentPane().add(jpanelAlojamiento,BorderLayout.CENTER);
	}
	private void addOfertasQueNoTePuedesPerder() {
		JpanelOfertasQueNoTePuedesPerder jpanelOfertasQueNoTePuedesPerder = new JpanelOfertasQueNoTePuedesPerder();
		this.add(jpanelOfertasQueNoTePuedesPerder,BorderLayout.CENTER);
	}

	private void addPagaTusViajes() {
		JpanelPagaTusViajes jpanelPagaTusViajes= new JpanelPagaTusViajes();
		this.add(jpanelPagaTusViajes,BorderLayout.CENTER);
	}
	private void addVuelosBaratos() {
		PanelVuelosBaratos panelVuelosBaratos = new PanelVuelosBaratos();
		this.add(panelVuelosBaratos,BorderLayout.CENTER);
	}
	private void addHoteleBarrato() {
		PanelHotelesBarratos panelHotelesBarratos = new PanelHotelesBarratos();
		this.add(panelHotelesBarratos,BorderLayout.CENTER);

	}
	private void addRentaCarro() {
		PanelRentaDeCarros panelRentaDeCarros = new PanelRentaDeCarros();
		this.add(panelRentaDeCarros,BorderLayout.CENTER);

}
	private void addComentario() {
		PanelConoceExperiencias panelConoceExperiencias = new PanelConoceExperiencias();
		this.add(panelConoceExperiencias,BorderLayout.CENTER);
	}
	private void addPanelRcibeOferta() {
		PanelRcibeOferta panelRcibeOferta = new PanelRcibeOferta();
		this.add(panelRcibeOferta,BorderLayout.CENTER);

	}*/
}
