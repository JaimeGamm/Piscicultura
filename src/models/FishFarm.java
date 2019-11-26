package models;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.DeserializationException;
import models.Pond;
import persistence.JsonFileManager;
import persistence.Utilities;
import views.Constants;

public class FishFarm {
	
	private JsonFileManager fileManager;
	private ArrayList<Pond> ponds; 
   
	 
	
    public FishFarm() {
    	this.ponds = new ArrayList<Pond>();
    	
    }
    
    public ArrayList<Pond> crearListPonds() throws FileNotFoundException, IOException, DeserializationException{
    	return fileManager.readFile(Constants.ROUTE_DATA);
    }
	
    public static Pond createRunner(long id, long year, String municipality, String specie, long seeded, long harvested, long weight, long production, long price){
    	return new Pond(id, year, municipality, specie, seeded, harvested, weight, production, price);
    }
    
	public ArrayList<Object[]> toMatrixVector2() {
		ArrayList<Object[]> datas = new ArrayList<Object[]>();
		for (Pond register : ponds) {
			datas.add( Utilities.concatObjectArrays2( register.toObjectVector()) );
		}
		return datas;
	}
	 
	public void at() {
		for (int i = 0; i < ponds.size(); i++) {
			System.out.println(ponds.get(i));
		}
	}
	
    public void addPond(Pond pond) {
	boolean ubication = false;
	int i = 0;
	while(ubication == false && i < this.ponds.size()) {
            if(ponds.get(i).getId() > pond.getId()) {
		ponds.add(i,pond);
		ubication = true;
            }
            i++;
	}
	if(ubication == false)
            ponds.add(pond);
    }
    
	public void setPondList(ArrayList<Pond> pondsList)throws FileNotFoundException, IOException, DeserializationException {
		this.ponds = pondsList;
	}
	
    public Pond searchPond(long id){
    	Pond soughtPOnd = null;
    	int i = 0;
    	while(soughtPOnd == null && i < this.ponds.size()) {
            if(this.ponds.get(i).getId() == id) 
            	soughtPOnd = this.ponds.get(i);
            i++;
            	}
    	return soughtPOnd;
    }
	
    public void editPond(Pond runner) {
    	boolean runnerEdit = false;
    	int i = 0;
    	while(runnerEdit == false && i < this.ponds.size()) {
            if(ponds.get(i).getId() == runner.getId()) {
            	ponds.set(i,runner);
            	runnerEdit = false;
            }
            i++;
		}
    }
//	public void addPond(Pond pond) {
//		ponds.add();
//	}
	
    public void deletePond(Pond pondToRemove) {
    	this.ponds.remove(pondToRemove);
    }
	
    public ArrayList<Object[]> getInformationByPond(){
    	ArrayList<Object[]> info = new ArrayList<>();
    	for (int i = 0; i < ponds.size(); i++) {
            info.add( ponds.get(i).toObjectVector());
    	}
    	return info;
    }

	public ArrayList<Pond> getPonds() {
		return ponds;
	}

	public void setPonds(ArrayList<Pond> ponds) {
		this.ponds = ponds;
	}
}
