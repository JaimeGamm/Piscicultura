package persistence;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;

import org.json.simple.DeserializationException;
import org.json.simple.JsonArray;
import org.json.simple.JsonObject;
import org.json.simple.Jsoner;

import models.Pond;
import views.Constants;

public class DemoJsonConsume {
	public static  ArrayList<Pond>  readSports(String webServicePath) throws IOException, DeserializationException{
		ArrayList<Pond> fishFarmingRegisterList  = new ArrayList<>();		
		BufferedReader br = new BufferedReader(new InputStreamReader(getHttpURLConnection(false,webServicePath)));
		JsonArray listPrincipal= (JsonArray)Jsoner.deserialize(br);
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
	
	public static InputStream getHttpURLConnection(boolean isProxy, String filePath) {
		HttpURLConnection httpURLConnection;
		URL url = null;
		InputStream inputStream = null;
		try {
			url = new URL( filePath );
			if ( !isProxy ) {
				System.out.println(Constants.WITHOUT_PROXY);
				httpURLConnection = (HttpURLConnection) url.openConnection();	
				inputStream = httpURLConnection.getInputStream();
			}else {
				System.out.println(Constants.WITH_PROXY);
				Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(Constants.IP, 8080));
				httpURLConnection = (HttpURLConnection) url.openConnection(proxy);
				inputStream = httpURLConnection.getInputStream();
				if(inputStream == null )
					System.out.println( Constants.MESSAGE_INPUT_ERROR );
			}

		}catch(ConnectException connectException) {
			isProxy = true;
			return getHttpURLConnection( isProxy, filePath );
		} catch (UnknownHostException e) {
			isProxy = true;
			System.out.println( "Catch: " + e.getMessage()  );
			return getHttpURLConnection( isProxy, filePath );
		} catch (MalformedURLException e1) {
			System.out.println(  e1.getMessage()  );
		}catch (IOException e) {
			System.out.println(  e.getMessage()  );
		}
		return inputStream;
	}
	
	@SuppressWarnings({ "static-access", "unused" })
	public static void main(String[] args) throws FileNotFoundException, IOException, DeserializationException {
		DemoJsonConsume demoJsonConsume = new DemoJsonConsume();
		ArrayList<Pond> fishFarmingRegisterList=demoJsonConsume.readSports("https://www.datos.gov.co/resource/yi68-jjgw.json");
		ArrayList<String>specie=new ArrayList<String>();
		specie.add("s");
		
	
	}
}
