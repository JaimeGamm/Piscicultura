package persistence;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.DeserializationException;

import org.json.simple.JsonArray;
import org.json.simple.JsonObject;
import org.json.simple.Jsoner;

import model.FishFarmingRegister;

public class JsonFileManager {
	public ArrayList<FishFarmingRegister> readFile(String fileName) throws FileNotFoundException,IOException, DeserializationException{
		ArrayList<FishFarmingRegister> fishFarmingRegisterList  = new ArrayList<>();
		JsonArray listPrincipal= (JsonArray)Jsoner.deserialize(new FileReader(fileName));
		long id=1;
	
		for(Object object: listPrincipal) {
			FishFarmingRegister fishFarmingRegister =null;
			try {
				JsonObject registerObj =(JsonObject)object;
				String municipio = registerObj.getString("municipio");
				String especie = registerObj.getString("especie");
				long animales_sembrados=Long.parseLong(registerObj.getString("animales_sembrados"));
				long animales_cosechados=Long.parseLong(registerObj.getString("animales_cosechados"));
				long peso_promedio=Long.parseLong(registerObj.getString("peso_promedio_por_animal_al_cosechar_g"));
				long produccion_estimada_kg=Long.parseLong(registerObj.getString("produccion_estimada_kg"));
				long precio_al_productor_kg=Long.parseLong(registerObj.getString("precio_al_productor_kg"));
//				System.out.println(id+"--"+municipio+"--"+especie+"--"+animales_sembrados+"--"+animales_cosechados+"--"+peso_promedio+"--"+produccion_estimada_kg);
				id++;
				fishFarmingRegister=new FishFarmingRegister(id,municipio,especie,animales_sembrados,animales_cosechados,peso_promedio,produccion_estimada_kg,precio_al_productor_kg);
				fishFarmingRegisterList.add(fishFarmingRegister);
//				String lastName = leagueObj.getString("lastName");
//				int jersey = Integer.parseInt(leagueObj.getString("jersey"));
//				String birthDate = leagueObj.getString("dateOfBirthUTC");
//				double heightMeters = Double.parseDouble(leagueObj.getString("heightMeters"));
//				JsonArray listTeam= (JsonArray)leagueObj.get("teams");	
//				int teamId=0; 
//			for(Object objectTeam:listTeam) {
//				JsonObject teamObj =(JsonObject)objectTeam;
//				teamId = Integer.parseInt(teamObj.getString("teamId"));
////				System.out.println(teamId);
//				
//				}
			} catch (NumberFormatException e) {
			}
		}
		return fishFarmingRegisterList;
	}
//public ArrayList<Team> readFileEquipo(String fileName) throws FileNotFoundException,IOException, DeserializationException{
//	ArrayList<Team> equipoList  = new ArrayList<>();
//	Team team = null;
//	JsonObject objectPrincipal = (JsonObject)Jsoner.deserialize(new FileReader(fileName));
//	JsonObject objectSports=(JsonObject)objectPrincipal.get("sports_content");
//	JsonObject objectTeam=(JsonObject)objectSports.get("teams");
//	JsonArray listTeam= (JsonArray)objectTeam.get("team");
//	for(Object object: listTeam) {
//		JsonObject teamObj =(JsonObject)object;
//		String teamName = teamObj.getString("team_name");
//		int id = Integer.parseInt(teamObj.getString("team_id"));
//		String city = teamObj.getString("city");
//		team =new Team(teamName,id,city);
//		equipoList.add(team);
//	
//	}
//	return equipoList;
//}
public static void main(String[] args) throws FileNotFoundException, IOException, DeserializationException {
	
//	Myfile arch = new Myfile("src\\Resources\\pueba");

	JsonFileManager jsonFileManager = new JsonFileManager();
	jsonFileManager.readFile("Resources/registros.txt");
//	jsonFileManager.readFileEquipo("Resources/teams.txt");
//	System.out.println(arch.contadorRegister());
	//System.out.println(Arrays.toString(arch.readRecords()));
//	v=arch.readRecords();
//	for (int i = 0; i <v.length; i++) {
//		Utilities ulti = new Utilities(v[i]);
		
		//System.out.println(ulti.toString());
//	}
}
}
