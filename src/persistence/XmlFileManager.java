package persistence;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import models.Pond;
public class XmlFileManager {
	public ArrayList<Object> readFile(String fileName, boolean isFile){
		Document document = null;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try{
			DocumentBuilder docBuilder = factory.newDocumentBuilder();
			document = docBuilder.parse(getReader(fileName,isFile));
		}catch(SAXException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ParserConfigurationException e){
			e.printStackTrace();
		}
		document.getDocumentElement().normalize();
		return parserDocument(document);
	}
	
	public ArrayList<Object> parserDocument(Document document){
		ArrayList<Object> dataList = new ArrayList<>();
		NodeList nodeList = document.getElementsByTagName("contenido");
		for (int i = 0; i < nodeList.getLength(); i++) {
			Element element = (Element) nodeList.item(i);
			dataList.add(element);
		}
		return dataList;
	}	
	
	public static InputStream getHttpURLConnection(boolean isProxy, String filePath) {
		HttpURLConnection httpURLConnection;
		URL url = null;
		InputStream inputStream = null;
		try {
			url = new URL( filePath );
			if ( !isProxy ) {
				System.out.println("Sin proxy");
				httpURLConnection = (HttpURLConnection) url.openConnection();	
				inputStream = httpURLConnection.getInputStream();
			}else {
				System.out.println("Con proxy");
				Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("172.16.0.73", 8080));
				httpURLConnection = (HttpURLConnection) url.openConnection(proxy);
				inputStream = httpURLConnection.getInputStream();
				if(inputStream == null )
					System.out.println( "Este input no quiere funcionar" );
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
	
	public InputSource getReader(String route, boolean isFile) throws IOException{
		InputSource reader = null;
//		String entry;
//		String string = "";
		if(isFile)
			reader = new InputSource(route);
		else {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(getHttpURLConnection(false, route)));
//			while ((entry = buffer.readLine()) != null) {
//				string += entry;
//			}
			InputSource archive = new InputSource();
			archive.setCharacterStream(new StringReader(buffer.readLine()));
			reader = archive;
		}
		return reader;
	}
	
	public void createDocumentXML(String path,	ArrayList<Pond> fishFarmingRegisterList ) throws TransformerException, ParserConfigurationException {
		Document doc = null;
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder;
		
		docBuilder = docFactory.newDocumentBuilder();
		doc = docBuilder.newDocument();
		      
		Element rootElement = doc.createElement("CULTIVOS");
		doc.appendChild(rootElement);

		for (Pond pond : fishFarmingRegisterList) {
			Element cultivo = doc.createElement("cultivo");
			cultivo.setAttribute("Id", String.valueOf((int) pond.getId()));
			rootElement.appendChild(cultivo);
			cultivo.setTextContent(String.valueOf((int) pond.getId()));
			
			
			Element year = doc.createElement("a_o");
			year.appendChild(doc.createTextNode(Long.toString(pond.getYear())));
			cultivo.appendChild(year);
			
			Element municipality = doc.createElement("municipio");
			municipality.appendChild(doc.createTextNode(pond.getMunicipality()));
			cultivo.appendChild(municipality);
		
			Element seeded = doc.createElement("animales_sembrados");
			seeded.appendChild(doc.createTextNode(Long.toString(pond.getSeeded())));
			cultivo.appendChild(seeded);
			
			Element haversted = doc.createElement("animales_cosechados");
			haversted.appendChild(doc.createTextNode(Long.toString(pond.getHaversted())));
			cultivo.appendChild(haversted);
			
			Element weight = doc.createElement("peso_promedio_por_animal_al_cosechar_g");
			weight.appendChild(doc.createTextNode(Long.toString(pond.getWeight())));
			cultivo.appendChild(weight);
			
			Element production = doc.createElement("produccion_estimada_kg");
			production.appendChild(doc.createTextNode(Long.toString(pond.getProduction())));
			cultivo.appendChild(production);
			
			Element price = doc.createElement("precio_al_productor_kg");
			price.appendChild(doc.createTextNode(Long.toString(pond.getPrice())));
			cultivo.appendChild(price);
			
		}
		
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File(path+".txt"));
		transformer.transform(source, result);
	}
}
