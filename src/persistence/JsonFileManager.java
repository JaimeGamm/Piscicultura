package persistence;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.DeserializationException;
import org.json.simple.JsonArray;
import org.json.simple.JsonObject;
import org.json.simple.Jsoner;
import models.Pond;
import views.Constants;

public class JsonFileManager {

	public ArrayList<Pond> readFile(String fileName) throws FileNotFoundException,IOException, DeserializationException{
		ArrayList<Pond> fishFarmingRegisterList  = new ArrayList<>();
		JsonArray listPrincipal= (JsonArray)Jsoner.deserialize(new FileReader(fileName));
		long id=1;
	
		for(Object object: listPrincipal) {
			Pond pond =null;
			try {
				JsonObject registerObj =(JsonObject)object;
				String municipality = registerObj.getString(Constants.MUNICIPALITY_KEY);
				String specie = registerObj.getString(Constants.SPECIE_KEY);
				long year = Long.parseLong(registerObj.getString(Constants.YEAT_KEY));
				long seededAnimals=Long.parseLong(registerObj.getString(Constants.SEEDED_ANIMALS_KEY));
				long harvestedAnimals=Long.parseLong(registerObj.getString(Constants.HARVESTED_ANIMALS_KEY));
				long averageWeight=Long.parseLong(registerObj.getString(Constants.WEIGHT_ANIMALS_KEY));
				long estimatedProduction=Long.parseLong(registerObj.getString(Constants.PRODUCTION_KEY));
				long price=Long.parseLong(registerObj.getString(Constants.PRICE_KEY));
				id++;
				pond = new Pond(year, municipality,specie,seededAnimals,harvestedAnimals,averageWeight,estimatedProduction,price);
				pond.setId(id);
				fishFarmingRegisterList.add(pond);	
				} catch (NumberFormatException e) {
			}
		}
		return fishFarmingRegisterList;
	}
}
