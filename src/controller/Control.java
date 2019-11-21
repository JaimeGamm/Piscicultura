package controller;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import org.json.simple.DeserializationException;

import model.*;
import persistence.JsonFileManager;
import persistence.Myfile;
import persistence.Utilities;
import view.JFrameConsole;

//import exceptions.DuplicateException;
//import exceptions.ValidateException;
//import exceptions.ValueNotFoundException;
public class Control implements ActionListener{
	Myfile miFile;
    Utilities ultilida;
    JDialogAddNewJugador jDialogAddNewCyclist;
    JsonFileManager jsonFileManager;
    FishFarming fishFarming;


    public Control () throws FileNotFoundException, IOException, DeserializationException {
    	cargaDatos();
        JFrameConsole jFrameConsole= new JFrameConsole(this,fishFarming.toMatrixVector2());
        //room=new Room();
      
      // init();
    }
	@Override
	public void actionPerformed(ActionEvent e) {
    	switch(ActionCompoonet.valueOf(e.getActionCommand())){
    	case C_ADD_CYCLING:
    		jDialogAddNewCyclist = new JDialogAddNewJugador(this);
    		jDialogAddNewCyclist.setVisible(true);
//    		JOptionPane.showMessageDialog(null, new PanelNewCycking(this));
    		break;
    	case C_GUARDAR:
//    		System.out.println( jDialogAddNewCyclist.createCyclist());
//    		AddFormNewCyclist.setFirstName()
//    		jDialogAddNewCyclist.getpan
//    		JOptionPane.showMessageDialog(null, jDialogAddNewCyclist().;
    		break;
		case C_BORRAR_TEXT:
			break;
		case C_CANCEL_CREATE_COST:
			break;
		case C_CANCEOL_CREATE_INCOME:
			break;
		case C_CREATE_COST:
			break;
		default:
			break;
    	}
		
	}
	private void cargaDatos() throws FileNotFoundException, IOException, DeserializationException {
		jsonFileManager =new JsonFileManager();
		fishFarming= new FishFarming();
		fishFarming.setJugadorList(jsonFileManager.readFile("Resources/registros.txt"));
//		for(Jugador jugador: jugadorList) {
//			System.out.println(jugador.getFirstName()+"--"+jugador.getTeams().getName());
//		}
	}
    public void createCyclistArchivo() {
    	String[] vector;
    	String registro = "";
    	vector=miFile.readRecords();
    	for (int i = 0; i <vector.length; i++) {
    		if(vector[i]!=null) {
    			registro=vector[i];
    			ultilida = new Utilities(registro);	
//    			Cyclist cycli =ultilida.cleateCyclist();
    		
//    			if(cycli!=null) {
    			//System.out.println(cycli.getTeam());
//    			cyclingTour.addCyclist(cycli);
//    				}
    			}
    		
    	}	
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, DeserializationException {
    	//  new Control();
    }
	public FishFarming getSportsPrincipal() {
		return fishFarming;
	}
	public void setSportsPrincipal(FishFarming fishFarming) {
		this.fishFarming = fishFarming;
	}

	
}