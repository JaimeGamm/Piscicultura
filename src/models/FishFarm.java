package models;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

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
	
    public static Pond createRunner(long year, String municipality, String specie, long seeded, long harvested, long weight, long production, long price){
    	return new Pond(year, municipality, specie, seeded, harvested, weight, production, price);
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
	public void averageSpeciesGrownInBoyaca() {
		//promedio de especie cultivado en boyaca
		
	}
	
	public HashMap<String, Double> averageSpeciesPriceInBoyaca() {
		//promedio de precio por especie en boyaca
		HashMap <String, Double>averageSpecie =new HashMap<String, Double>();
		for (TypeSpecie specie : TypeSpecie.values()) {
			averageSpecie.put(specie.getName(), averageSpecieCounter(specie.getName()));
		}
		return averageSpecie;
	}
	
	private double averageSpecieCounter(String specie) {
		double countSpeciePrice =0;
		double numero = 0;
		double average=0;
		for (Pond register : ponds) {
			if(specie.equals(register.getSpecie())) {
				countSpeciePrice += register.getPrice();
				numero++;
			}
		}
		average=countSpeciePrice/numero;

//	System.out.println(tote+" "+countSpecie+" "+percentaje);
		return average;
	}
	
	public HashMap<String, Double> percentageOfCultivatedSpecies() {
	// porcentaje de especies cultivadas en boyaca
		HashMap <String, Double>percentageSpecie =new HashMap<String, Double>();
		for (TypeSpecie specie : TypeSpecie.values()) {
			percentageSpecie.put(specie.getName(), contadorAndPercentageSpecie(specie.getName()));
		}
		
		return percentageSpecie;
	}
	private double contadorAndPercentageSpecie(String specie) {
		
		double countSpecie =0;
		double tote = 0;
		double percentaje=0;
		for (Pond register : ponds) {
			tote+=register.getSeeded();
			if(specie.equals(register.getSpecie())) {
				countSpecie += register.getSeeded();
			}
		}
		percentaje=(countSpecie*100)/(tote);

//	System.out.println(tote+" "+countSpecie+" "+percentaje);
		return percentaje;
	}
	public ArrayList<Object[]>toMatrixVectorAverageSpeciesPriceInBoyaca() {
		HashMap averageSpecie=averageSpeciesPriceInBoyaca();
		ArrayList<Object[]> datas = new ArrayList<Object[]>();
		for (TypeSpecie specie: TypeSpecie.values()) {
			double average = (double) averageSpecie.get(specie.getName());
			datas.add( Utilities.concatObjectArrays2(toObjectVector(specie.getName(),average)) );
		}
		return datas;
	} 
	public ArrayList<Object[]>toMatrixVectorpercentageOfCultivatedSpecies(){
		HashMap percentageSpecie=percentageOfCultivatedSpecies();
		ArrayList<Object[]> datas = new ArrayList<Object[]>();
		for (TypeSpecie specie: TypeSpecie.values()) {
			double percentage = (double) percentageSpecie.get(specie.getName());
			datas.add( Utilities.concatObjectArrays2(toObjectVector(specie.getName(),percentage)) );
		}
		return datas;
	}
	public Object[] toObjectVector(String dato1, double dato2) {
	return new Object[] {dato1,dato2};
    }	
}
