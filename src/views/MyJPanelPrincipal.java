package views;

import views.table.JtableElement;
import views.table.JtableReport;
import views.body.JPBody;
import views.footer.Footer;
import views.header.JPanelHeader;
import views.reports.PanelReporrtPercentajeOfSpeciesInBoyaca;
import views.reports.PanelReportBoyacaAverageSpecies;
import views.reports.PanelReportHarvestedPuertoBoyaca;
import views.reports.PanelReportHarvestedTotal;
import views.reports.PanelReportMunicipalityPercentaje;
import views.reports.ReportYear;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.json.simple.DeserializationException;
import general.HandlerLanguage;


public class MyJPanelPrincipal extends JPanel{
	
	public static final int WIDTH_SCREEN = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	public static final int HEIGHT_SCREEN = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;

    private static final long serialVersionUID = 1L; 
    private JtableElement jtableElement;
    private JPanelHeader jPanelHeader;
    private JtableReport jtableReport;
    private Panel panelGraphics;
    private Footer footer;
    private JPBody body;

	
    public MyJPanelPrincipal(ActionListener actionListenner, ArrayList<Object[]> datasFarm) {
		panelGraphics = new Panel();
		setBackground(Color.white);
		setPreferredSize(new Dimension(WIDTH_SCREEN-25, 1300));
		FlowLayout flowLayout=new FlowLayout(FlowLayout.CENTER);
		flowLayout.setHgap(30);
		setLayout(flowLayout); 
		initComponents(actionListenner, datasFarm);
    }
	
    private void initComponents(ActionListener actionListenner, ArrayList<Object[]> datasFarm) {
    	jPanelHeader=new JPanelHeader(actionListenner);
    	startPanelGraphics();
    	jPanelHeader.setPreferredSize(new Dimension(WIDTH_SCREEN, 135));
    	add(jPanelHeader,BorderLayout.NORTH);
    	body =new JPBody();
    	body.setPreferredSize(new Dimension(WIDTH_SCREEN, 610));
    	add(body,BorderLayout.CENTER);
//    	showDatas(datasFarm);	
    	footer = new Footer();
    	footer.setPreferredSize(new Dimension(WIDTH_SCREEN, 130));
    	add(footer, BorderLayout.SOUTH);
    }
    
   

    private void startPanelGraphics() {
    	panelGraphics.setBackground(Color.black);
    	FlowLayout flowLayout=new FlowLayout(FlowLayout.CENTER);
    	panelGraphics.setLayout(flowLayout);
    	panelGraphics.setPreferredSize(new Dimension(530,530));

	}
    public void changeLanguage() { 
    	jtableElement.changeLanguageColunmJtable();
    	jPanelHeader.changeLanguageButtonsMenu();
    	footer.changeLanguage();
	}
    public void changeLanguageJtableReport(String titule1, String operation) { 
    	jtableReport.changeLanguageColunmJtableR(titule1, operation);
	}
    
	public void showDatas(ArrayList<Object[]> datasFarm) {
		jtableElement = new JtableElement();
	    jtableElement.setPreferredSize(new Dimension(1300,450));
		for (Object[] objects : datasFarm) {
			jtableElement.addElementTOtable(objects);
		}
		this.add(jtableElement,BorderLayout.CENTER);
	}
	public void showDatasReport(ArrayList<Object[]> datasFarm) {
		jtableReport = new JtableReport("ESPECIES", "PROMEDIO");
		for (Object[] objects : datasFarm) {
			jtableReport.addElementTOtable(objects);
		}
     
		this.add(jtableReport,BorderLayout.CENTER);
	}
	
	public void visibletableReport(boolean estado) {
		jtableReport.setVisible(estado);
	}
	

	public void newDatas(ArrayList<Object[]> datasFarm) {
		for (Object[] objects : datasFarm) {
			jtableElement.addElementTOtable(objects);
		}
		this.add(jtableElement,BorderLayout.CENTER);
		
	}
	
	public void restartTable() {
		jtableElement.cleanRowsTable();
	}
	
	public void visibleTable(boolean estado) {
		jtableElement.setVisible(estado);
	}
	
	public String estadoJComboReport() {
		return jPanelHeader.estadoJComboReport();
	}
	
	
	public void changeLanguageColunmJtableR(String titule1, String operation){
		jtableReport.changeLanguageColunmJtableR(titule1, operation);
	}
	
	public void tabledeReport(String titule, String operacion,ArrayList<Object[]> datasFarm) {
		jtableReport.clean(titule,operacion);
		for (Object[] objects : datasFarm) {
			jtableReport.addElementTOtable(objects);
		}
		this.add(jtableReport,BorderLayout.CENTER);
	}
	
	
	public void borrarJtableReport() {
		jtableReport.cleanRowsTable();
	}
	public void addGragicaPanelReportBoyaca(HashMap<String, Double> SpeciesPriceInBoyaca, String title) throws IOException, DeserializationException {
		JLabel titlePanel = startJlabel(title);
		panelGraphics.add(titlePanel);
		panelGraphics.add(new PanelReportBoyacaAverageSpecies(SpeciesPriceInBoyaca));
    	panelGraphics.setBackground(Color.black);
    	panelGraphics.setPreferredSize(new Dimension(1000,530));
		this.add(panelGraphics);
		HandlerLanguage.languageProperties.getProperty(title);
	}
	
	public void addGragicaPanelReportPBoyaca(HashMap<String, Double> SpeciesPriceInBoyaca, String title) throws IOException, DeserializationException {
		JLabel titlePanel = startJlabel(title);
		panelGraphics.add(titlePanel);
		panelGraphics.add(new PanelReportHarvestedPuertoBoyaca(SpeciesPriceInBoyaca));
    	panelGraphics.setBackground(Color.black);
    	panelGraphics.setPreferredSize(new Dimension(1000,530));
		this.add(panelGraphics);
	}
	
	public void addGragicaHarvestedTotal(HashMap<String, Double> SpeciesPriceInBoyaca, String title) throws IOException, DeserializationException {
		JLabel titlePanel = startJlabel(title);
		panelGraphics.add(titlePanel);
		panelGraphics.add(new PanelReportHarvestedTotal(SpeciesPriceInBoyaca));
    	panelGraphics.setBackground(Color.black);
    	panelGraphics.setPreferredSize(new Dimension(1000,530));
		this.add(panelGraphics);
	}
	
	public void addGragicaPanelYear(HashMap<String,Double> year, String title) throws IOException, DeserializationException {
		JLabel titlePanel = startJlabel(title);
		panelGraphics.add(titlePanel);
		panelGraphics.add(new ReportYear(year));
    	panelGraphics.setBackground(Color.black);
    	panelGraphics.setPreferredSize(new Dimension(530,530));
		this.add(panelGraphics);

	}
	
	public void addGraficaPanelReporrtPercentajeOfSpeciesInBoyaca(HashMap<String, Double> SpeciesPriceInBoyaca, String title) throws IOException, DeserializationException {
		JLabel titlePanel = startJlabel(title);
		panelGraphics.add(titlePanel);
		panelGraphics.add(new PanelReporrtPercentajeOfSpeciesInBoyaca(SpeciesPriceInBoyaca));
    	panelGraphics.setBackground(new Color(20, 20, 20));
    	panelGraphics.setPreferredSize(new Dimension(1000,530));
		this.add(panelGraphics);

	}
	
	public void addGraficaPanelReporrtPercentajeOfMunicipality(HashMap<String, Double> municipality, String title) throws IOException, DeserializationException {
		JLabel titlePanel = startJlabel(title);
		panelGraphics.add(titlePanel);
		panelGraphics.add(new PanelReportMunicipalityPercentaje(municipality));
    	panelGraphics.setBackground(new Color(30, 30, 30));
    	panelGraphics.setPreferredSize(new Dimension(1000,590)); 
		this.add(panelGraphics);

	}
	private JLabel startJlabel(String title) {
		JLabel titlePanel = new JLabel(title);
		titlePanel.setFont(new Font(Constants.FONT_RUBIK, 1, 16));
		titlePanel.setForeground(Color.white);
		return titlePanel;
	}
	public void removerPanelGraphics() {
		panelGraphics.removeAll();
		panelGraphics.repaint();
	
	}

	public JtableElement getJtableElement() {
		return jtableElement;
	}

	public void setJtableElement(JtableElement jtableElement) {
		this.jtableElement = jtableElement;
	}
	

}
