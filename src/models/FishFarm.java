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
	
	private ArrayList<Pond> ponds; 
    private JsonFileManager jsonFileManager;
	 
	
    public FishFarm() throws IOException, DeserializationException{
    	jsonFileManager = new JsonFileManager();
    	this.ponds = new ArrayList<Pond>();
    	inDatas();	
    }
    
//    public ArrayList<Pond> crearListPonds() throws FileNotFoundException, IOException, DeserializationException{
//    	return fileManager.readFile(Constants.ROUTE_DATA);
//    }
	
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
	
	public double averageSpecieCounter(String specie) {
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
	
	public HashMap<String, Double> averageProductionSpeciesInBoyaca() {
		// promedio de producion por especie
		HashMap <String, Double>averageSpecie =new HashMap<String, Double>();
		for (TypeSpecie specie : TypeSpecie.values()) {
			averageSpecie.put(specie.getName(), averageProductionSpecieCounter(specie.getName()));
		}
		return averageSpecie;
	}
	public double averageProductionSpecieCounter(String specie) {
		double countSpecieProduction =0;
		double numero = 0;
		double average=0;
		for (Pond register : ponds) {
			if(specie.equals(register.getSpecie())) {
				countSpecieProduction += register.getProduction();
				numero++;
			}
		}
		average=countSpecieProduction/numero;

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
	public HashMap<String, Double> percentageOfProductionSpecies() {
	// porcentaje de porducion por especie en boyaca
		HashMap <String, Double>percentageSpecie =new HashMap<String, Double>();
		for (TypeSpecie specie : TypeSpecie.values()) {
			percentageSpecie.put(specie.getName(), contadorAndPercentageProductionSpecie(specie.getName()));
		}
		
		return percentageSpecie;
	}
	public HashMap<String, Double> percentageOfProductionInPsiculturaForMunicipality() {
	// porcentaje de producion en psicultura por municipio
		HashMap <String, Double>percentageMunicipality =new HashMap<String, Double>();
		for (TypeMunicipality municipality : TypeMunicipality.values()) {
			percentageMunicipality.put(municipality.getName(), addPercentageMunicipality(municipality.getName()));
		}
		
		return percentageMunicipality;
	}
	private double addPercentageMunicipality(String municipality) {
		
		double countMunicipality =0;
		double tote = 0;
		double percentaje=0;
		for (Pond register : ponds) {
			tote+=register.getProduction();
			if(municipality.equals(register.getMunicipality())) {
				countMunicipality += register.getProduction();
			}
		}
		percentaje=(countMunicipality*100)/(tote);

//	System.out.println(tote+" "+countSpecie+" "+percentaje);
		return percentaje;
	}
	
	
	private void inDatas() throws FileNotFoundException, IOException, DeserializationException {
		for(Pond pond: jsonFileManager.readFile(Constants.ROUTE_DATA)) {
			addPond(pond);
		}
	}
	
	public int calculatePercentage(String mySpecie) {
    	@SuppressWarnings("rawtypes")
		HashMap percentageSpecie= percentageOfCultivatedSpecies();
    	int percentage = 0;
    	for (@SuppressWarnings("unused") TypeSpecie specie : TypeSpecie.values()) {
    		double aux = (double)percentageSpecie.get(mySpecie);
    		percentage = (int) aux;
    	}
    	return percentage;
    }
	
	public int calculatePrice(String mySpecie) {
    	@SuppressWarnings("rawtypes")
		HashMap averageSpecie = averageSpeciesPriceInBoyaca();
    	int average = 0;
    	for (@SuppressWarnings("unused") TypeSpecie specie : TypeSpecie.values()) {
    		double aux = (double) averageSpecie.get(mySpecie);
    		average = (int)aux;
    		}
    	return average;
    }
	private double contadorAndPercentageProductionSpecie(String specie) {
		
		double countSpecie =0;
		double tote = 0;
		double percentaje=0;
		for (Pond register : ponds) {
			tote+=register.getProduction();
			if(specie.equals(register.getSpecie())) {
				countSpecie += register.getProduction();
			}
		}
		percentaje=(countSpecie*100)/(tote);

//	System.out.println(tote+" "+countSpecie+" "+percentaje);
		return percentaje;
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
	@SuppressWarnings("rawtypes")
	public ArrayList<Object[]>toMatrixVectorAverageSpeciesPriceInBoyaca() {
		HashMap averageSpecie=averageSpeciesPriceInBoyaca();
		ArrayList<Object[]> datas = new ArrayList<Object[]>();
		for (TypeSpecie specie: TypeSpecie.values()) {
			double average = (double) averageSpecie.get(specie.getName());
			datas.add( Utilities.concatObjectArrays2(toObjectVector(specie.getName(),average)) );
		}
		return datas;
	} 
	@SuppressWarnings("rawtypes")
	public ArrayList<Object[]>toMatrixVectorpercentageOfCultivatedSpecies(){
		HashMap percentageSpecie=percentageOfCultivatedSpecies();
		ArrayList<Object[]> datas = new ArrayList<Object[]>();
		for (TypeSpecie specie: TypeSpecie.values()) {
			double percentage = (double) percentageSpecie.get(specie.getName());
			datas.add( Utilities.concatObjectArrays2(toObjectVector(specie.getName(),percentage)) );
		}
		return datas;
	}
	
	public ArrayList<Object[]>toMatrixVectorAverageProductionSpeciesInBoyaca(){
		HashMap averageSpecie=averageProductionSpeciesInBoyaca();
		ArrayList<Object[]> datas = new ArrayList<Object[]>();
		for (TypeSpecie specie: TypeSpecie.values()) {
			double average = (double) averageSpecie.get(specie.getName());
			datas.add( Utilities.concatObjectArrays2(toObjectVector(specie.getName(),average)) );
		}
		return datas;
	}
	public ArrayList<Object[]>toMatrixVectorpercentageOfProductionSpecies(){
		HashMap percentageSpecie=percentageOfProductionSpecies();
		ArrayList<Object[]> datas = new ArrayList<Object[]>();
		for (TypeSpecie specie: TypeSpecie.values()) {
			double percentage = (double) percentageSpecie.get(specie.getName());
			datas.add( Utilities.concatObjectArrays2(toObjectVector(specie.getName(),percentage)) );
		}
		return datas;
	}
	public ArrayList<Object[]>toMatrixVectorPercentageOfProductionInPsiculturaForMunicipality(){
		HashMap percentageMunicipality=percentageOfProductionInPsiculturaForMunicipality();
		ArrayList<Object[]> datas = new ArrayList<Object[]>();
		for (TypeMunicipality municipality: TypeMunicipality.values()) {
			double percentage = (double) percentageMunicipality.get(municipality.getName());
			datas.add( Utilities.concatObjectArrays2(toObjectVector(municipality.getName(),percentage)) );
		}
		return datas;
	}
	
	public Object[] toObjectVector(String dato1, double dato2) {
	return new Object[] {dato1,dato2};
    }
	

}
