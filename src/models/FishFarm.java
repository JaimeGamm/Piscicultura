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
	
	public long maxYear() {
		long year = 0;
		for(Pond pond: ponds) {
			if(pond.getYear() > year) {
				year = pond.getYear();
			}
		}
		return year;
	}
	
	public long minYear() {
		long year = Long.MAX_VALUE;
		for(Pond pond: ponds) {
			if(pond.getYear() < year) {
				year = pond.getYear();
			}
		}
		return year;
	}
	
	public HashMap<Long, Integer> pondsByYear(){
		HashMap<Long, Integer> map = new HashMap<Long, Integer>();
		for(long i=minYear(); i<=maxYear(); i++) {
			map.put(i, quantityPondByYear(i));
		}
		return map;
	}
	
	
	public int quantityPondByYear(long year) {
		int count = 0;
		for(Pond register : ponds) {
			if(year == register.getYear()) {
				count++;
			}
		}
		return count;
	}
	
	public double averageWeight(String mySpecie) {
		double countSpecieProduction =0;
		double numero = 0;
		double average=0;
		for (Pond register : ponds) {
			if(mySpecie.equals(register.getSpecie())) {
				countSpecieProduction += register.getWeight();
				numero++;
			}
		}
		average=countSpecieProduction/numero;

		return average;
	}
	
	public double averageHarvested(String mySpecie) {
		double countSpecieProduction =0;
		double numero = 0;
		double average=0;
		for (Pond register : ponds) {
			if(mySpecie.equals(register.getSpecie())) {
				countSpecieProduction += register.getHaversted();
				numero++;
			}
		}
		average=countSpecieProduction/numero;

		return average;
	}
	
	public HashMap<String, Double> averageHarvested() {
		HashMap <String, Double>averageSpecie =new HashMap<String, Double>();
		for (TypeSpecie specie : TypeSpecie.values()) {
			averageSpecie.put(specie.getName(), averageHarvested(specie.getName()));
		}
		return averageSpecie;
	}
	
	public HashMap<String, Double> averageWeightSpecies() {
		HashMap <String, Double>averageSpecie =new HashMap<String, Double>();
		for (TypeSpecie specie : TypeSpecie.values()) {
			averageSpecie.put(specie.getName(), averageWeight(specie.getName()));
		}
		return averageSpecie;
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
		return average;
	}
	
	public double countAnimalsHarvestedInPuertoBoyaca(String specie) {
		double countSpecieProduction =0;
		for (Pond register : ponds) {
			if(register.getMunicipality().equals(TypeMunicipality.PUERTO_BOYACA.getName())) {
				if(specie.equals(register.getSpecie())) {
					countSpecieProduction += register.getHaversted();
				}
			}
		}
		return countSpecieProduction; 
	}
	
	public double countAnimalsHarvestedTotal(String specie) {
		double countSpecieProduction =0;
		for (Pond register : ponds) {
			if(specie.equals(register.getSpecie())) {
				countSpecieProduction += register.getHaversted();
			}
		}
		return countSpecieProduction; 
	}
	
	public HashMap<String, Double> AnimalsHarvestedTotal() {
		HashMap <String, Double>percentageSpecie =new HashMap<String, Double>();
		for (TypeSpecie specie : TypeSpecie.values()) {
			percentageSpecie.put(specie.getName(), countAnimalsHarvestedTotal(specie.getName()));
		}
		return percentageSpecie;
	}
	
	public HashMap<String, Double> AnimalsHarvestedInPuertoBoyaca() {
			HashMap <String, Double>percentageSpecie =new HashMap<String, Double>();
			for (TypeSpecie specie : TypeSpecie.values()) {
				percentageSpecie.put(specie.getName(), countAnimalsHarvestedInPuertoBoyaca(specie.getName()));
			}
			return percentageSpecie;
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
		return percentaje;
	}
	

	
	public ArrayList<Object[]>toMatrixVectorAverageSpeciesPriceInBoyaca() {
		ArrayList<Object[]> datas = new ArrayList<Object[]>();
		for (TypeSpecie specie: TypeSpecie.values()) {
			double average = (double) averageSpeciesPriceInBoyaca().get(specie.getName());
			datas.add( Utilities.concatObjectArrays2(toObjectVector(specie.getName(),average)) );
		}
		return datas;
	} 
	
	public ArrayList<Object[]>toMatrixVectorAverageWeightSpecies() {
		ArrayList<Object[]> datas = new ArrayList<Object[]>();
		for (TypeSpecie specie: TypeSpecie.values()) {
			double average = (double) averageWeightSpecies().get(specie.getName());
			datas.add( Utilities.concatObjectArrays2(toObjectVector(specie.getName(),average)) );
		}
		return datas;
	} 
	
	public ArrayList<Object[]>toMatrixVectorPondsByYear() {
		ArrayList<Object[]> datas = new ArrayList<Object[]>();
		for (long i= minYear(); i<= maxYear();i++) {
			int average = (int)pondsByYear().get(i);
			datas.add( Utilities.concatObjectArrays2(toObjectVector(i,average)) );
		}
		return datas;
	}
	
	public ArrayList<Object[]>toMatrixVectorHarvested(){
		ArrayList<Object[]> datas = new ArrayList<Object[]>();
		for (TypeSpecie specie: TypeSpecie.values()) {
			double percentage = (double) averageHarvested().get(specie.getName());
			datas.add( Utilities.concatObjectArrays2(toObjectVector(specie.getName(),percentage)) );
		}
		return datas;
	}
	
	public ArrayList<Object[]>toMatrixVectorpercentageOfCultivatedSpecies(){
		ArrayList<Object[]> datas = new ArrayList<Object[]>();
		for (TypeSpecie specie: TypeSpecie.values()) {
			double percentage = (double) percentageOfCultivatedSpecies().get(specie.getName());
			datas.add( Utilities.concatObjectArrays2(toObjectVector(specie.getName(),percentage)) );
		}
		return datas;
	}
	
	public ArrayList<Object[]>toMatrixVectorHarvestedPuertoBoyaca(){
		ArrayList<Object[]> datas = new ArrayList<Object[]>();
		for (TypeSpecie specie: TypeSpecie.values()) {
			double percentage = (double) AnimalsHarvestedInPuertoBoyaca().get(specie.getName());
			datas.add( Utilities.concatObjectArrays2(toObjectVector(specie.getName(),percentage)) );
		}
		return datas;
	}
	
	public ArrayList<Object[]>toMatrixVectorAverageProductionSpeciesInBoyaca(){
		ArrayList<Object[]> datas = new ArrayList<Object[]>();
		for (TypeSpecie specie: TypeSpecie.values()) {
			double average = (double) averageProductionSpeciesInBoyaca().get(specie.getName());
			datas.add( Utilities.concatObjectArrays2(toObjectVector(specie.getName(),average)) );
		}
		return datas;
	}
	
	public ArrayList<Object[]>toMatrixVectorpercentageOfProductionSpecies(){
		ArrayList<Object[]> datas = new ArrayList<Object[]>();
		for (TypeSpecie specie: TypeSpecie.values()) {
			double percentage = (double) percentageOfProductionSpecies().get(specie.getName());
			datas.add( Utilities.concatObjectArrays2(toObjectVector(specie.getName(),percentage)) );
		}
		return datas;
	}
	
	public ArrayList<Object[]>toMatrixVectorPercentageOfProductionInPsiculturaForMunicipality(){
		ArrayList<Object[]> datas = new ArrayList<Object[]>();
		for (TypeMunicipality municipality: TypeMunicipality.values()) {
			double percentage = (double) percentageOfProductionInPsiculturaForMunicipality().get(municipality.getName());
			datas.add( Utilities.concatObjectArrays2(toObjectVector(municipality.getName(),percentage)) );
		}
		return datas;
	}
	
	public ArrayList<Object[]>toMatrixVectorHarvestedTotal(){
		ArrayList<Object[]> datas = new ArrayList<Object[]>();
		for (TypeSpecie specie: TypeSpecie.values()) {
			double percentage = (double) AnimalsHarvestedTotal().get(specie.getName());
			datas.add( Utilities.concatObjectArrays2(toObjectVector(specie.getName(),percentage)) );
		}
		return datas;
	}
	
	public Object[] toObjectVector(String dato1, double dato2) {
	return new Object[] {dato1,dato2};
    }
	
	public Object[] toObjectVector(long dato1, int dato2) {
		return new Object[] {dato1,dato2};
	    }
	
	public static void main(String[] args) throws IOException, DeserializationException {
		FishFarm farm = new FishFarm();
		System.out.println(farm.countAnimalsHarvestedInPuertoBoyaca(TypeSpecie.BOCACHICO.getName()));
	}

	public JsonFileManager getJsonFileManager() {
		return jsonFileManager;
	}

	public void setJsonFileManager(JsonFileManager jsonFileManager) {
		this.jsonFileManager = jsonFileManager;
	}
}
