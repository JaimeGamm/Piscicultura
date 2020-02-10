package controller;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.json.simple.DeserializationException;
import com.itextpdf.text.DocumentException;
import exceptions.EmptyFieldsException;
import exceptions.NoExistException;
import general.HandlerLanguage;
import models.FishFarm;
import models.Pond;
import persistence.DemoJsonConsume;
import persistence.GeneradorPDF;
import persistence.JsonFileManager;
import persistence.WriteBinario;
import views.Constants;
import views.MyJFramePpal;
import views.table.JtableElement;

public class Controller implements ActionListener{
	
	private static final String NAME_FILE_CONFIG = "config.init";
	
    private FishFarm fishFarm;
    private MyJFramePpal framePpal;
    private DemoJsonConsume demoJsonConsume;
    private HandlerLanguage config = null;
	private String languageDefault;
	private JsonFileManager jsonFileManager;
	
    public Controller() throws IOException, DeserializationException{
    	demoJsonConsume= new DemoJsonConsume();
    	jsonFileManager = new JsonFileManager();
		fishFarm = new FishFarm();
    	loadConfiguration();
    	try {
			inDatasWed();
			try {
				framePpal = new MyJFramePpal(this, fishFarm.toMatrixVector2());
			} catch (IOException | DeserializationException e1) {
				e1.printStackTrace();
			}
			framePpal.addTable(fishFarm.toMatrixVector2(), this);
	    	framePpal.addTableReport(toMatrixVectorAverageSpeciesPriceInBoyaca(), this);	
	    	getAndShowInformationPonds();	
		} catch (IOException | DeserializationException e1) {
			e1.printStackTrace();
		}		
    }
    
    public void loadDatas() {
    	
    }
    
	
    @SuppressWarnings("incomplete-switch")
	public void actionPerformed(ActionEvent e){
    	switch (Commands.valueOf(e.getActionCommand())) {
    	case ADD:
            openDialogAdd();
            break;
    	case DELETE:
            openDialogDelete();
            break;
    	case SAVE_DATA:
    		openDialogSaveDatos();
    		break;
    	case OPEN_J_CHOOSER:
    		framePpal.openJFileChooser();
    		break;
    	case CANCEL_SAVE:
    		framePpal.closeJjDialogSaveDatos();
    		break;
    	case ACEPT_SAVE:
    		try {
    			if(framePpal.getRouteFile() == null || framePpal.getRouteFile().isEmpty()){
    				framePpal.showErrorMessage("Ruta invalida");
    			}else {
				createFilePDF();
	    		framePpal.closeJjDialogSaveDatos();
    			}
			} catch (DocumentException | IOException e2) {
				e2.printStackTrace();
				
			} catch (TransformerException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ParserConfigurationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
   
    		break;
    	case SEE_LIST:
    		framePpal.visibleTable(true); 
    		framePpal.visibleGrafics(false);
            framePpal.visibletableReport(false);
            framePpal.visibleImages(false);
            framePpal.visibleFooter(false);
            break;
    	case HOME:
    		framePpal.visibleTable(false); 
    		framePpal.visibleGrafics(false);
            framePpal.visibletableReport(false);
            framePpal.visibleImages(true);
            framePpal.visibleFooter(true);
            break;
    	case CLOSE_ADD_DIALOG:
    		if(framePpal.componentsAddDialogEmpty() == true) {
    			closeDialogAdd();
    		}
    		else {
    			Exception ex = new EmptyFieldsException();
    			framePpal.showErrorMessage(ex.getMessage());
    		}
	   break;
    	case CLOSE_DIALOG_ADD_CANCEL:
            framePpal.closeDialogAdd();
            break;
    	case CLOSE_DELETE_DIALOG:
    		if(framePpal.componentsDeleteDialogEmpty() == true) {
    			closeDialogDelete();
    		}
    		else {
                Exception ex2 = new EmptyFieldsException();
                framePpal.showErrorMessage(ex2.getMessage());
    		}
            break;
    	case CLOSE_DIALOG_DELETE_CANCEL:
            framePpal.closeDialogDelete();
            break;
    	case ENTER_REPORT:
    		framePpal.visibleGrafics(true);
            framePpal.visibleTable(false);
            framePpal.visibleImages(false);
            framePpal.visibleFooter(false);
            framePpal.visibletableReport(true);
            try {
				framePpal.tabledeReport(estadoDeJComboReport(framePpal.estadoJComboReport()),estadoDeJComboReportHash(framePpal.estadoJComboReport()));
			} catch (IOException | DeserializationException e1) {
				e1.printStackTrace();
			}
            break;
    	case ENGLISH:	
			manageChangeLanguageUS();
			break;
		case SPANISH:	
			manageChangeLanguageES();
			break;
		case FB1:
			openFB1();
			break;
		case FB2:
			openFB2();
			break;
		case IN1:
			openIN1();
			break;
		case IN2:
			openIN2();
			break;
		case TW1:
			openTW1();
			break;
		}	
    }

    

	@SuppressWarnings("static-access")
	private void inDatasWed() throws FileNotFoundException, IOException, DeserializationException {
		try{
			for(Pond pond:demoJsonConsume.readSports("https://www.datos.gov.co/resource/yi68-jjgw.json")) {
				fishFarm.addPond(pond);
			}
		}catch (NullPointerException e) {
			inDatas();
		}
		
    }
	
	private void openFB1() {
		try {
			Desktop.getDesktop().browse(new URI("https://www.facebook.com/profile.php?id=100007493149183&ref=bookmarks"));
		}catch(Exception e) {
			
		}
	}
	
	private void openFB2() {
		try {
			Desktop.getDesktop().browse(new URI("https://www.facebook.com/jaime.saenzgamboa"));
		}catch(Exception e) {
			
		}
	}
	
	private void openIN1() {
		try {
			Desktop.getDesktop().browse(new URI("https://www.instagram.com/ivanalexism.c/"));
		}catch(Exception e) {
			
		}
	}
	
	private void openIN2() {
		try {
			Desktop.getDesktop().browse(new URI("https://www.instagram.com/jaimesaenzgamboa/"));
		}catch(Exception e) {
			
		}
	}
	
	private void openTW1() {
		try {
			Desktop.getDesktop().browse(new URI("https://twitter.com/5710dbc6348847f"));
		}catch(Exception e) {
			
		}
	}
    
	private void inDatas() throws FileNotFoundException, IOException, DeserializationException {
		for(Pond pond: jsonFileManager.readFile(Constants.ROUTE_DATA)) {
			fishFarm.addPond(pond);
		}
	}

    
    public String getLanguageDefault(){
		languageDefault = Locale.getDefault().getLanguage();
		switch (languageDefault) {
		case "es":
			return "Spanish";
		case "us":
			return "English";
		}
		return "Spanish";
	}

	public void loadLanguage() throws IOException{
		try {
			config.loadLanguage();
		} catch (Exception e) {			
		}
	}

	public void saveConfig() throws IOException{
		try {
			new HandlerLanguage(NAME_FILE_CONFIG).saveLanguage();
		} catch (Exception e) {
		}
	}

	public void changeToEnglish() throws IOException{
		HandlerLanguage.language = "language/languageUS.properties";
		saveConfig();
		loadLanguage();		
	}

	public void changeToSpanish() throws IOException{
		HandlerLanguage.language = "language/languageES.properties";
		saveConfig();
		loadLanguage();
	}
	
	public void loadConfiguration(){
		if(config == null){
			config = new HandlerLanguage(NAME_FILE_CONFIG);
		}
		try{
			config.loadLanguage();
		}catch(IOException e){
			System.err.println("file not found : NAME_FILE_CONFIG");
		}
	}
	
	private void manageChangeLanguageUS(){
		try {
			changeToEnglish();
		} catch (IOException e1) {
			e1.printStackTrace();
		}			
		manageChangeLanguage();
		
	}
	
	private void manageChangeLanguageES(){
		try {
			changeToSpanish();
		} catch (IOException e1) {
			e1.printStackTrace();
		}	
		manageChangeLanguage();
		
	}
	
	
	private void manageChangeLanguage(){
		framePpal.changeLanguage();		
	}
	
    private void openDialogAdd() {
    	framePpal.openDialogAdd();
    }
    private void openDialogSaveDatos() {
    	framePpal.openDialogSaveDatos();
    }
    

	
    private void closeDialogAdd() {
    	createAndAddPond();
        framePpal.closeDialogAdd();
        getAndShowInformationPonds();
    }
    private long addId() {
    	long actualNumber =0;
       	for(Pond pond:fishFarm.getPonds()) {
       		if(actualNumber <pond.getId()) {
       			actualNumber =pond.getId();
       		}
       		
       	}
    	actualNumber +=1;
       	return actualNumber ;
	}
	
    private void openDialogDelete() {
        framePpal.openDialogDelete();
    }
	
    private void closeDialogDelete() {
    	deletePond();
        framePpal.closeDialogDelete();
        getAndShowInformationPonds();
    }	 
	
    private void createAndAddPond() {
    	try {
           if(framePpal.componentsAddDialogEmpty() == true) {
        		framePpal.restartTable();
            	Pond pond =framePpal.updateTable();
            	pond.setId(addId());
            	fishFarm.addPond(pond);
            	framePpal.showTableAgain(fishFarm.toMatrixVector2());
            }
    	}catch(Exception e) { 
            JOptionPane.showMessageDialog(null, e);;
    	}
    	
    }
	
    private void deletePond() {
    	try {
            if(framePpal.componentsDeleteDialogEmpty()) {
            	Pond pond = fishFarm.searchPond(framePpal.getIdDeletDialog());
            	if(pond != null) {
                    if(framePpal.showMessageConfirmationDelete() == framePpal.jOptionPaneYesOption()) {
                    	framePpal.restartTable();
                    	framePpal.showMessageCorrectDelete();
                    	fishFarm.deletePond(pond);
                    	framePpal.showTableAgain(fishFarm.toMatrixVector2());	
                    }
            	}else {
                    Exception e = new NoExistException();
                    framePpal.showErrorMessage(e.getMessage());
            		}
            	}
            }catch(NumberFormatException e) {
            framePpal.showErrorNumberFormatException();
    	}
    }
	
    private void getAndShowInformationPonds() {
    	framePpal.getPondsList(fishFarm.getInformationByPond());
    }
    
	private HashMap<String, Double> percentageOfCultivatedSpecies() {
    	return fishFarm.percentageOfCultivatedSpecies();
    }
    
	private HashMap<String, Double> averageSpeciesPriceInBoyaca() {
    	return fishFarm.averageSpeciesPriceInBoyaca();
    }
    
    public HashMap<String, Double> pondsByYear(){
    	return fishFarm.pondsByYear();
    }
    
    public HashMap<String, Double> averageWeightSpecies(){
    	return fishFarm.averageWeightSpecies();
    }
    
    public HashMap<String, Double> averageHarvested(){
    	return fishFarm.averageHarvested();
    }

    private HashMap<String, Double>  averageProductionSpeciesInBoyaca() {
    	return fishFarm.averageProductionSpeciesInBoyaca(); 
    }
    private HashMap<String, Double> percentageOfProductionSpecies() {
    	return fishFarm.percentageOfProductionSpecies(); 
	}
    
    private HashMap<String, Double> percentageOfProductionInPsiculturaForMunicipality() {
    	return fishFarm.percentageOfProductionInPsiculturaForMunicipality(); 
	}
    
    private HashMap<String, Double> harvestedPuertoBoyaca() {
    	return fishFarm.AnimalsHarvestedInPuertoBoyaca(); 
	}
    
    private HashMap<String, Double> harvestedTotal() {
    	return fishFarm.AnimalsHarvestedTotal(); 
	}
    
    private ArrayList<Object[]> toMatrixVectorAverageSpeciesPriceInBoyaca() {
    	return fishFarm.toMatrixVectorAverageSpeciesPriceInBoyaca();
	}
    
    private ArrayList<Object[]> toMatrixVectorAverageWeightSpecies() {
    	return fishFarm.toMatrixVectorAverageWeightSpecies();
	}
    
    private ArrayList<Object[]> toMatrixVectorpercentageOfCultivatedSpecies(){
    	return fishFarm.toMatrixVectorpercentageOfCultivatedSpecies();
    }
    
    private ArrayList<Object[]> toMatrixVectorHarvested(){
    	return fishFarm.toMatrixVectorHarvested();
    }
    
    private ArrayList<Object[]> toMatrixVectorpondsByYear(){
    	return fishFarm.toMatrixVectorPondsByYear();
    }
    
    private ArrayList<Object[]> toMatrixVectorHarvestedPuertoBoyaca(){
    	return fishFarm.toMatrixVectorHarvestedPuertoBoyaca();
    }
    
    private ArrayList<Object[]> toMatrixVectorAverageProductionSpeciesInBoyaca(){
    	return fishFarm.toMatrixVectorAverageProductionSpeciesInBoyaca();
    }
    
    private ArrayList<Object[]> toMatrixVectorpercentageOfProductionSpecies(){
    	return fishFarm.toMatrixVectorpercentageOfProductionSpecies();
    }
    
    private ArrayList<Object[]> toMatrixVectorPercentageOfProductionInPsiculturaForMunicipality(){
    	return fishFarm.toMatrixVectorPercentageOfProductionInPsiculturaForMunicipality();
    }
    
    private ArrayList<Object[]> toMatrixVectorHarvestedTotal(){
    	return fishFarm.toMatrixVectorHarvestedTotal();
    }
    
    private ArrayList<Object[]> estadoDeJComboReport(String estado) {
    	ArrayList<Object[]> datas = new ArrayList<Object[]>();
    	if(estado.equals(HandlerLanguage.languageProperties.getProperty(Constants.AVERAGE_PRICE))) {
    		datas= toMatrixVectorAverageSpeciesPriceInBoyaca();  		
    	}else if(estado.equals(HandlerLanguage.languageProperties.getProperty(Constants.PERCENTAGE_SPECIE_SEEDED))) {
    		datas= toMatrixVectorpercentageOfCultivatedSpecies(); 
    	}else if(estado.equals(HandlerLanguage.languageProperties.getProperty(Constants.AVERAGE_PRODUCTION_BY_SPECIE))) {
    		datas= toMatrixVectorAverageProductionSpeciesInBoyaca(); 
    	}else if(estado.equals(HandlerLanguage.languageProperties.getProperty(Constants.PERCENTAGE_PRODUCTION_BY_SPECIE))) {
    		datas= toMatrixVectorpercentageOfProductionSpecies(); 
    	}else if(estado.equals(HandlerLanguage.languageProperties.getProperty(Constants.PERCENTAGE_PRODUCTION_BY_MUNICIPALITY))) {
    		datas= toMatrixVectorPercentageOfProductionInPsiculturaForMunicipality(); 
    	}else if(estado.equals(HandlerLanguage.languageProperties.getProperty(Constants.PONDS_BY_YEAR))) {
    		datas= toMatrixVectorpondsByYear(); 
    	}else if(estado.contentEquals(HandlerLanguage.languageProperties.getProperty(Constants.AVERAGE_WEIGHT_BY_SPECIE))) {
    		datas = toMatrixVectorAverageWeightSpecies();
    	}else if(estado.contentEquals(HandlerLanguage.languageProperties.getProperty(Constants.AVERAGE_HARVESTED))) {
    		datas = toMatrixVectorHarvested();
    	}else if(estado.contentEquals(HandlerLanguage.languageProperties.getProperty(Constants.HARVESTED_IN_PUERTO_BOYCA))) {
    		datas= toMatrixVectorHarvestedPuertoBoyaca();
    	}else if(estado.contentEquals(HandlerLanguage.languageProperties.getProperty(Constants.TOTAL_HARVESTED))) {
    		datas = toMatrixVectorHarvestedTotal();
    	}
    	return datas;
	}
    
    
    @SuppressWarnings("unchecked")
	private HashMap<String, Double>estadoDeJComboReportHash(String estado){
    	@SuppressWarnings("rawtypes")
		HashMap hash=new HashMap<String, Double>();
    	if(estado.equals(HandlerLanguage.languageProperties.getProperty(Constants.AVERAGE_PRICE))) {
    		hash= averageSpeciesPriceInBoyaca();  		
    	}else if(estado.equals(HandlerLanguage.languageProperties.getProperty(Constants.PERCENTAGE_SPECIE_SEEDED))) {
    		hash= percentageOfCultivatedSpecies(); 
    	}else if(estado.equals(HandlerLanguage.languageProperties.getProperty(Constants.AVERAGE_PRODUCTION_BY_SPECIE))) {
    		hash= averageProductionSpeciesInBoyaca(); 
    	}else if(estado.equals(HandlerLanguage.languageProperties.getProperty(Constants.PERCENTAGE_PRODUCTION_BY_SPECIE))) {
    		hash= percentageOfProductionSpecies(); 
    	}else if(estado.equals(HandlerLanguage.languageProperties.getProperty(Constants.PERCENTAGE_PRODUCTION_BY_MUNICIPALITY))) {
    		hash= percentageOfProductionInPsiculturaForMunicipality(); 
    	}else if(estado.equals(HandlerLanguage.languageProperties.getProperty(Constants.PONDS_BY_YEAR))) {
    		hash= pondsByYear(); 	
    	}else if(estado.equals(HandlerLanguage.languageProperties.getProperty(Constants.AVERAGE_WEIGHT_BY_SPECIE))) {
    		hash= averageWeightSpecies(); 	
    	}else if(estado.equals(HandlerLanguage.languageProperties.getProperty(Constants.AVERAGE_HARVESTED))) {
    		hash= averageHarvested(); 	
    	}else if(estado.equals(HandlerLanguage.languageProperties.getProperty(Constants.HARVESTED_IN_PUERTO_BOYCA))) {
    		hash= harvestedPuertoBoyaca();
    	}else if(estado.equals(HandlerLanguage.languageProperties.getProperty(Constants.TOTAL_HARVESTED))) {
    		hash = harvestedTotal();
    	}
    	return hash;
    }
    
    public JtableElement obtenerTabla() {
    	return framePpal.getTable();
    }
    
    @SuppressWarnings("unused")
	public void createFilePDF() throws MalformedURLException, DocumentException, IOException, TransformerException, ParserConfigurationException {
    	String ruta =framePpal.getRouteFile();
    	String tipeFile =framePpal.getStatusTypeFile();
    	boolean state =framePpal.statusJRadioButton();
    	if(tipeFile.equals("PDF")) {
    	GeneradorPDF generadorPDF=new GeneradorPDF(obtenerTabla(),ruta);
    		if(state==true) {
    			abrirarchivo(ruta+".pdf");
    		}
    	}else if(tipeFile.equals("JSON")){
    		fishFarm.getJsonFileManager().whiteFile(ruta, fishFarm.getPonds());
    		if(state==true) {
    	 	abrirarchivo(ruta+".txt");
    		}
		}else if(tipeFile.equals("XML")){
			fishFarm.getXmlFileManager().createDocumentXML(ruta,fishFarm.getPonds());
    		if(state==true) {
    	 	abrirarchivo(ruta+".txt");
    	 	
    		}
		}else if(tipeFile.equals("BINARIO")){
			fishFarm.getWriteBinario().createBinario(ruta,fishFarm.getPonds());
    		if(state==true) {
    	 	abrirarchivo(ruta+".txt");
    		}
		}
    	
    }
    
    public void abrirarchivo(String archivo){
        try {
               File objetofile = new File (archivo);
               Desktop.getDesktop().open(objetofile);
        }catch (IOException ex) {

               System.out.println(ex);

        }
    }    
}
