package views;

import views.dialogs.JDialogTwo;
import views.table.JtableElement;
import views.dialogs.JDialogOne;
import views.dialogs.JDialogSaveDatos;

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
    private JDialogSaveDatos jDialogSaveDatos;
	
    public MyJFramePpal(ActionListener actionListenner, ArrayList<Object[]> datasFarm) throws IOException, DeserializationException {
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
		jDialogSaveDatos=new JDialogSaveDatos(this,actionListenner);
    }
    public Pond actualizarTable() {
    	panel.restartTable();
    	Pond pond=dialogAdd.createRunner();
    	return pond;
    }
    public JtableElement obtenerTabla() {
    	return panel.getJtableElement();
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
		ReportEnum.price();
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
    public void openDialogSaveDatos() {
    	jDialogSaveDatos.setVisible(true);
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
    public void closeJjDialogSaveDatos() {
    	jDialogSaveDatos.setVisible(false);
    	jDialogSaveDatos.clearComponents();
    }
    public String getRutaFile() {
    	return jDialogSaveDatos.getRuta(); 
    }
    public String getEstadoTypeArchivo() {
    	return jDialogSaveDatos.estadoTypeArchivo();
    }
	public boolean estadoJRadioButton() {
		return jDialogSaveDatos.estadoJRadioButton();
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
	
	public void visibletableReport(boolean estado) {
		panel.visibletableReport(estado);
	}
	public void removerPanelGraphics() {
		panel.removerPanelGraphics();
	}
	
	public void tabledeReport(ArrayList<Object[]> datasFarm,HashMap<String, Double> SpeciesPriceInBoyaca) throws IOException, DeserializationException {
		int numero=0;
		if(estadoJComboReport().equals(HandlerLanguage.languageProperties.getProperty(Constants.AVERAGE_PRICE))) {
			numero=1;
			panel.tabledeReport(HandlerLanguage.languageProperties.getProperty(Constants.SPECIE), HandlerLanguage.languageProperties.getProperty(Constants.PRICE_ANIMAL), datasFarm);
			if(numero!=1 || panel.getComponentCount()>2) {
				panel.removerPanelGraphics();
			} 
			panel.addGragicaPanelReportBoyaca(SpeciesPriceInBoyaca,HandlerLanguage.languageProperties.getProperty(Constants.AVERAGE_PRICE));
			actualizarPantalla();
    	}else if(estadoJComboReport().equals(HandlerLanguage.languageProperties.getProperty(Constants.PERCENTAGE_SPECIE_SEEDED))) {
    		numero=2;
    		panel.tabledeReport(HandlerLanguage.languageProperties.getProperty(Constants.SPECIE), HandlerLanguage.languageProperties.getProperty(Constants.PERCENTAGE), datasFarm);
    		if(numero!=2 || panel.getComponentCount()>2) {
				panel.removerPanelGraphics();
			}
    		panel.addGraficaPanelReporrtPercentajeOfSpeciesInBoyaca(SpeciesPriceInBoyaca,HandlerLanguage.languageProperties.getProperty(Constants.PERCENTAGE_SPECIE_SEEDED));
    		actualizarPantalla();
    	}else if(estadoJComboReport().equals(HandlerLanguage.languageProperties.getProperty(Constants.AVERAGE_PRODUCTION_BY_SPECIE))) {
    		numero=3;
			panel.tabledeReport(HandlerLanguage.languageProperties.getProperty(Constants.SPECIE), HandlerLanguage.languageProperties.getProperty(Constants.AVERAGE), datasFarm);
			if(numero!=3 || panel.getComponentCount()>2) {
				panel.removerPanelGraphics(); 
			} 
			panel.addGragicaPanelReportBoyaca(SpeciesPriceInBoyaca,HandlerLanguage.languageProperties.getProperty(Constants.AVERAGE_PRODUCTION_BY_SPECIE));
			actualizarPantalla();
		}else if(estadoJComboReport().equals(HandlerLanguage.languageProperties.getProperty(Constants.PERCENTAGE_PRODUCTION_BY_SPECIE))) {
    		numero=4;
			panel.tabledeReport(HandlerLanguage.languageProperties.getProperty(Constants.SPECIE), HandlerLanguage.languageProperties.getProperty(Constants.PERCENTAGE), datasFarm);
			if(numero!=4 || panel.getComponentCount()>2) {
				panel.removerPanelGraphics();
			} 
			panel.addGraficaPanelReporrtPercentajeOfSpeciesInBoyaca(SpeciesPriceInBoyaca,HandlerLanguage.languageProperties.getProperty(Constants.PERCENTAGE_PRODUCTION_BY_SPECIE));
			actualizarPantalla();
		}else if(estadoJComboReport().equals(HandlerLanguage.languageProperties.getProperty(Constants.PERCENTAGE_PRODUCTION_BY_MUNICIPALITY))) {
    		numero=5;
			panel.tabledeReport(HandlerLanguage.languageProperties.getProperty(Constants.SPECIE), HandlerLanguage.languageProperties.getProperty(Constants.PERCENTAGE), datasFarm);
			if(numero!=5 || panel.getComponentCount()>2) {
				panel.removerPanelGraphics();
			} 
			panel.addGraficaPanelReporrtPercentajeOfMunicipality(SpeciesPriceInBoyaca,HandlerLanguage.languageProperties.getProperty(Constants.PERCENTAGE_PRODUCTION_BY_MUNICIPALITY));
			actualizarPantalla();
		}else if(estadoJComboReport().equals(HandlerLanguage.languageProperties.getProperty(Constants.PONDS_BY_YEAR))) {
    		numero=6;
			panel.tabledeReport("AÑO", "CULTIVOS", datasFarm);
			if(numero!=6 || panel.getComponentCount()>2) {
				panel.removerPanelGraphics();
			} 
			panel.addGragicaPanelYear(HandlerLanguage.languageProperties.getProperty(Constants.PONDS_BY_YEAR));
			actualizarPantalla();
		}else if(estadoJComboReport().equals(HandlerLanguage.languageProperties.getProperty(Constants.AVERAGE_WEIGHT_BY_SPECIE))) {
    		numero=7;
			panel.tabledeReport(HandlerLanguage.languageProperties.getProperty(Constants.SPECIE), HandlerLanguage.languageProperties.getProperty(Constants.WEIGHT_ANIMAL), datasFarm);
			if(numero!=7 || panel.getComponentCount()>2) {
				panel.removerPanelGraphics();
			} 
			panel.addGragicaPanelReportBoyaca(SpeciesPriceInBoyaca,HandlerLanguage.languageProperties.getProperty(Constants.AVERAGE_WEIGHT_BY_SPECIE));
			actualizarPantalla();
		}else if(estadoJComboReport().equals(HandlerLanguage.languageProperties.getProperty(Constants.AVERAGE_HARVESTED))) {
    		numero=8;
			panel.tabledeReport(HandlerLanguage.languageProperties.getProperty(Constants.SPECIE), HandlerLanguage.languageProperties.getProperty(Constants.HARVESTED_ANIMALS), datasFarm);
			if(numero!=8 || panel.getComponentCount()>2) {
				panel.removerPanelGraphics();
			} 
			panel.addGragicaPanelReportBoyaca(SpeciesPriceInBoyaca,HandlerLanguage.languageProperties.getProperty(Constants.AVERAGE_HARVESTED));
			actualizarPantalla();
		}else if(estadoJComboReport().equals(HandlerLanguage.languageProperties.getProperty(Constants.HARVESTED_IN_PUERTO_BOYCA))) {
    		numero=9;
			panel.tabledeReport(HandlerLanguage.languageProperties.getProperty(Constants.SPECIE), HandlerLanguage.languageProperties.getProperty(Constants.HARVESTED_ANIMALS), datasFarm);
			if(numero!=9 || panel.getComponentCount()>2) {
				panel.removerPanelGraphics();
			} 
			panel.addGragicaPanelReportPBoyaca(SpeciesPriceInBoyaca,HandlerLanguage.languageProperties.getProperty(Constants.HARVESTED_IN_PUERTO_BOYCA));
			actualizarPantalla();
		}else if(estadoJComboReport().equals(HandlerLanguage.languageProperties.getProperty(Constants.TOTAL_HARVESTED))) {
    		numero=10;
			panel.tabledeReport(HandlerLanguage.languageProperties.getProperty(Constants.SPECIE), HandlerLanguage.languageProperties.getProperty(Constants.HARVESTED_ANIMALS), datasFarm);
			if(numero!=10 || panel.getComponentCount()>2) {
				panel.removerPanelGraphics();
			} 
			panel.addGragicaHarvestedTotal(SpeciesPriceInBoyaca,HandlerLanguage.languageProperties.getProperty(Constants.TOTAL_HARVESTED));
			actualizarPantalla();
		}
	}
	public void openJFileChooser() {
		jDialogSaveDatos.openJFileChooser();
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
