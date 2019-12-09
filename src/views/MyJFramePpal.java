package views;

import views.dialogs.JDialogTwo;
import views.reports.PondsReport;
import views.reports.PriceReport;
import views.dialogs.JDialogOne;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

import org.json.simple.DeserializationException;

import general.HandlerLanguage;
import models.Pond;

public class MyJFramePpal extends JFrame{
	
    private static final long serialVersionUID = 1L;
    private MyJPanelPrincipal panel;
    private JDialogTwo dialogAdd;
    private JDialogOne dialogDelete;
    private PondsReport pondsReport;
    private PriceReport priceReport;
	
    public MyJFramePpal(ActionListener actionListenner, ArrayList<Object[]> datasFarm) throws IOException, DeserializationException {
    	pondsReport = new PondsReport();
    	priceReport = new PriceReport();
    	setMinimumSize(new Dimension(700, 400));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		
		setIconImage(new ImageIcon(Constants.LOGO_PATH).getImage());
		setTitle(HandlerLanguage.languageProperties.getProperty(Constants.TITLE));
		initComponents(actionListenner, datasFarm);
		setVisible(true);
    	JScrollPane jScrollPane = new JScrollPane();
		jScrollPane.setViewportView(panel);
		this.add( jScrollPane);
    } 
	
    private void initComponents(ActionListener actionListenner, ArrayList<Object[]> datasFarm) {
    	panel = new MyJPanelPrincipal(actionListenner, datasFarm);
		add(panel);
		dialogAdd = new JDialogTwo(this,actionListenner,HandlerLanguage.languageProperties.getProperty(Constants.ADD_POND),Constants.ADD_PATH,false);
		dialogDelete = new JDialogOne(this,actionListenner,HandlerLanguage.languageProperties.getProperty(Constants.DELETE_POND),Constants.DELETE_PATH,false);
    }
    public Pond actualizarTable() {
    	panel.restartTable();
    	Pond pond=dialogAdd.createRunner();
    	return pond;
    }
    public void addTableReport(ArrayList<Object[]> datasFarm) {
    	panel.showDatasReport(datasFarm);
    	panel.visibletableReport(false);
    }
	public void reiniciarTable() {
		panel.restartTable();
	}
	public void cargaDeNuevoTabla(ArrayList<Object[]> datasFarm) {
		panel.newDatas(datasFarm);
	}
	public void changeLanguage(){
		panel.changeLanguage();
		dialogAdd.changeLanguage();
		dialogDelete.changeLanguage();
	}
    
    public void getPondsList(ArrayList<Object[]> info) {
    	//panel.getPondsList(info);
    }
	
    public void showMessage() {
    	JOptionPaneMessages.showMessageEndProgram();
    }
    
	public void visibleTable(boolean estado) {
		panel.visibleTable(estado);
	}
	

    public void openDialogAdd() {
    	dialogAdd.setVisible(true);
    }
	
    public void openDialogDelete() {
    	dialogDelete.setVisible(true);
    }
	
    public void closeDialogAdd() {
    	dialogAdd.setVisible(false);
		dialogAdd.clearComponents();
    }
	
    public void closeDialogDelete() {
    	dialogDelete.setVisible(false);
    	dialogDelete.clearComponents();
    }

	
    public boolean componentsAddDialogEmpty() {
    	return dialogAdd.verifyEmptyComponents();
    } 
	
	 
    public Pond getRunnerFromDialog() {
    	return dialogAdd.createRunner();
    }
	
    public  void showMessage(String message){
    	JOptionPaneMessages.showMessage(message);
    }
    
    public void showErrorMessage(String message){
    	JOptionPaneMessages.showErrorMessage(message);
    }
    
    public void showErrorNumberFormatException() {
    	JOptionPaneMessages.showErrorNumberFormatException();
    }
	
	
    public void showMessagePondCreated() {
    	JOptionPaneMessages.showMessagePondCreated();
    }
	
    public int showMessageConfirmation() {
    	return JOptionPaneMessages.showMessageConfirmation();
    }
	
    public int showMessageConfirmationDelete() {
    	return JOptionPaneMessages.showMessageConfirmationDelete();
    }
	

    public int jOptionPaneYesOption() {
    	return JOptionPaneMessages.jOptionPaneYesOption();
    }
	

    public void showMessageCorrectDelete() {
    	JOptionPaneMessages.showMessageCorrectDelete();
    }
	
	
    public boolean componentsDeleteDialogEmpty() {
    	return dialogDelete.verifyEmptyComponent();
    }
    
    public int getIdDeletDialog() {
    	return dialogDelete.getId();
    }
    
	public String estadoJComboReport() {
		return panel.estadoJComboReport();
	}
	
	public String estadoJComboReport2() {
		return panel.estadoJComboReport2();
	}
	
	public void showGrafics() {
		if(estadoJComboReport2().equals("Grafica de especies cultivadas en boyaca")) {
			pondsReport.setVisible(true);
		}else if(estadoJComboReport2().equals("Grafica de precios promedio de las especies")) {
			priceReport.setVisible(true);
		}
	}
	
	public void visibletableReport(boolean estado) {
		panel.visibletableReport(estado);
	}
	public void tabledeReport(ArrayList<Object[]> datasFarm,HashMap<String, Double> SpeciesPriceInBoyaca) throws IOException, DeserializationException {
		int numero=0;
		if(estadoJComboReport().equals("Promedio de precio por especie en boyaca")) {
			numero=1;
//			panel.borrarJtableReport();
			panel.tabledeReport("ESPECIES", "PROMEDIO DE PRECIO $", datasFarm);
			if(numero!=1 || panel.getComponentCount()>2) {
				panel.removerPanelGraphics();
			} 
			panel.addGragicaPanelReportBoyaca(SpeciesPriceInBoyaca,"Promedio de precio por especie en boyaca");
			actualizarPantalla();
    	}else if(estadoJComboReport().equals("Porcentaje de especies cultivadas en boyaca")) {
//    		panel.borrarJtableReport();
    		numero=2;
    		panel.tabledeReport("ESPECIES", "PORCENTAJE %", datasFarm);
    		if(numero!=2 || panel.getComponentCount()>2) {
				panel.removerPanelGraphics();
			}
    		panel.addGraficaPanelReporrtPercentajeOfSpeciesInBoyaca(SpeciesPriceInBoyaca,"Porcentaje de especies cultivadas en boyaca");
    		actualizarPantalla();
    	}else if(estadoJComboReport().equals("Promedio de producion por especie en boyaca")) {
    		numero=3;
			panel.tabledeReport("ESPECIES", "PROMEDIO", datasFarm);
			if(numero!=3 || panel.getComponentCount()>2) {
				panel.removerPanelGraphics(); 
			} 
			panel.addGragicaPanelReportBoyaca(SpeciesPriceInBoyaca,"Promedio de producion por especie en boyaca");
			actualizarPantalla();
		}else if(estadoJComboReport().equals("Porcentaje de porducion por especie en boyaca")) {
    		numero=4;
			panel.tabledeReport("ESPECIES", "PORCENTAJE %", datasFarm);
			if(numero!=4 || panel.getComponentCount()>2) {
				panel.removerPanelGraphics();
			} 
			panel.addGraficaPanelReporrtPercentajeOfSpeciesInBoyaca(SpeciesPriceInBoyaca,"Porcentaje de porducion por especie en boyaca");
			actualizarPantalla();
		}else if(estadoJComboReport().equals("Porcentaje de producion en psicultura por municipio")) {
    		numero=5;
			panel.tabledeReport("MUNICIPIO", "PORCENTAJE %", datasFarm);
			if(numero!=5 || panel.getComponentCount()>2) {
				panel.removerPanelGraphics();
			} 
			panel.addGraficaPanelReporrtPercentajeOfMunicipality(SpeciesPriceInBoyaca,"Porcentaje de producion en psicultura por municipio");
			actualizarPantalla();
		}
	}
	public void actualizarPantalla(){
		try {
			SwingUtilities.updateComponentTreeUI(this);
			this.validateTree();
		} catch (IllegalStateException e) {
			// TODO: handle exception
		}
	}

}
