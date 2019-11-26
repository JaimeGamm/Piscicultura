package controller;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Locale;

import javax.swing.JOptionPane;

import org.json.simple.DeserializationException;

import exceptions.EmptyFieldsException;
import exceptions.NoExistException;
import general.HandlerLanguage;
import models.FishFarm;
import models.Pond;
import persistence.JsonFileManager;
import persistence.Utilities;
import views.Constants;
import views.MyJFramePpal;

//import exceptions.DuplicateException;
//import exceptions.ValidateException;
//import exceptions.ValueNotFoundException;
public class Control implements ActionListener{
	
	private static final String NAME_FILE_CONFIG = "config.init";
	
    private FishFarm fishFarm;
    private MyJFramePpal framePpal;
    private JsonFileManager jsonFileManager;
    private HandlerLanguage config = null;
	private String languageDefault;
	
    public Control() throws IOException, DeserializationException{
    	jsonFileManager = new JsonFileManager();
		fishFarm= new FishFarm();
    	loadConfiguration();
    	inDatas();
    	framePpal = new MyJFramePpal(this, fishFarm.toMatrixVector2());
    	
    	getAndShowInformationPonds();		
    }
	
    public void actionPerformed(ActionEvent e){
    	switch (Commands.valueOf(e.getActionCommand())) {
    	case ADD:
            openDialogAdd();
            break;
    	case DELETE:
            openDialogDelete();
            break;
    	case SEE_LIST:
            getAndShowInformationPonds();
            break;
    	case GET_OUT:
            endProgram();
            break;
    	case CLOSE_ADD_DIALOG:
    		closeDialogAdd();
        	System.out.println("si");
	   break;
    	case CLOSE_DIALOG_ADD_CANCEL:
            framePpal.closeDialogAdd();
            break;
    	case CLOSE_DELETE_DIALOG:
            closeDialogDelete();
            break;
    	case CLOSE_DIALOG_DELETE_CANCEL:
            framePpal.closeDialogDelete();
            break;
    	case ENGLISH:	
			manageChangeLanguageUS();
			break;
		case SPANISH:	
			manageChangeLanguageES();
		default:
			break;
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
	
    private void closeDialogAdd() {
    	deletePond();
//    	framePpal.reiniciarTable();
//    	System.out.println("si");
//    	Pond pond =framePpal.actualizarTable();
//    	pond.setId(addId());
//    	fishFarm.addPond(pond);
//    	framePpal.cargaDeNuevoTabla(fishFarm.toMatrixVector2());
//    	System.out.println(pond.getSpecie());
//    	for(Pond pond2:fishFarm.getPonds()) {
//    		System.out.println(pond2.getSpecie());
//    	}
    	createAndAddPond();
        framePpal.closeDialogAdd();
        getAndShowInformationPonds();
    }
    private long addId() {
    	long numeroActual=0;
       	for(Pond pond:fishFarm.getPonds()) {
       		if(numeroActual<pond.getId()) {
       			numeroActual=pond.getId();
       		}
       		
       	}
    	numeroActual+=1;
       	return numeroActual;
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
        		framePpal.reiniciarTable();
            	System.out.println("si");
            	Pond pond =framePpal.actualizarTable();
            	pond.setId(addId());
            	fishFarm.addPond(pond);
            	framePpal.cargaDeNuevoTabla(fishFarm.toMatrixVector2());
            }
    	}catch(NumberFormatException e) { 
            framePpal.showErrorNumberFormatException();
    	}
    	
    }
	
    private void deletePond() {
    	try {
            if(framePpal.componentsDeleteDialogEmpty()) {
            Pond pond = fishFarm.searchPond(framePpal.getIdDeletDialog());
		if(pond != null) {
                    if(framePpal.showMessageConfirmationDelete() == framePpal.jOptionPaneYesOption()) {
                    	
			fishFarm.deletePond(pond);
			framePpal.showMessageCorrectDelete();
                    }
		}else {
                    Exception e = new NoExistException();
                    framePpal.showErrorMessage(e.getMessage());
		}
            }else {
                Exception e = new EmptyFieldsException();
                framePpal.showErrorMessage(e.getMessage());
            }
    	}catch(NumberFormatException e) {
            framePpal.showErrorNumberFormatException();
    	}
    }
	
	
	private void inDatas() throws FileNotFoundException, IOException, DeserializationException {
//		jsonFileManager = new JsonFileManager();
//		fishFarm= new FishFarm();
		for(Pond pond:jsonFileManager.readFile(Constants.ROUTE_DATA)) {
			fishFarm.addPond(pond);
		}
//		fishFarm.setPondList(jsonFileManager.readFile(Constants.ROUTE_DATA));
	}
	
	
    private void endProgram() {
    	if(framePpal.showMessageConfirmation() == framePpal.jOptionPaneYesOption()) {
    		framePpal.showMessage();
    		System.exit(0);	
    	}
    }
	
    private void getAndShowInformationPonds() {
    	framePpal.getPondsList(fishFarm.getInformationByPond());
    }
    private void leerlista() {
    	for(Pond pond2:fishFarm.getPonds()) {
    		System.out.println(pond2.getSpecie());
    	}
    }

	public static void main(String[] args) throws IOException, DeserializationException {
		Control control = new Control();
//		control.leerlista();
		Pond pond = new Pond(1996, "tunja", "rrrrrrrrrrrrrrrrrrrrrr", 3, 4,5 , 100, 1200);
		control.fishFarm.addPond(pond);
		control.leerlista();
	}
}
