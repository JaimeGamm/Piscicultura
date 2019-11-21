package persistence;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Utilities {
	public static final char SEPARADOR = '?';
	public static final String SEPARADOR1 = "\\?";
	public static final String DATEMAX ="09/18/1970";
	public static final String DATEMIN ="06/20/2008";
	public static final String FOMART_DATE_ES ="M/d/yyyy";
	private LocalDate presentDate = LocalDate.now(); 
	String[] partesRegistry;
	
	public Utilities(String registry) {
		this.partesRegistry=removeSeparatorsInARow1(registry).split("(\\?)");
	}
	
	public String newSeparatorsInARow(String registry) {
		String newRegistry="";
		
		for (int i = 0; i < registry.length(); i++) {
				char element = registry.charAt(i);
				if(element==SEPARADOR) {
					newRegistry+=",";
				
				}else if(element!=SEPARADOR) {
					newRegistry+=element;
				}	
		}
		return newRegistry;
	}
	public String removeSeparatorsInARow(String registry) {
		String newSeparator =newSeparatorsInARow(registry);
		//System.out.println(newSeparator);
		Pattern NewSeparatorPattern = Pattern.compile(",+");
		Matcher matcher =NewSeparatorPattern.matcher(newSeparator);
		return matcher.replaceAll(";");
	}
	
	public String removeSeparatorsInARow1(String registry) {
		String newSeparator =newSeparatorsInARow(registry);
		//System.out.println(newSeparator);
		Pattern NewSeparatorPattern = Pattern.compile("\\?+");
		Matcher matcher =NewSeparatorPattern.matcher(registry);
		
		return matcher.replaceAll(SEPARADOR1);
	}
	
	public void reemover(String registry) {
		
	}
	
    public static String getExtension(String filename) {
        int index = filename.lastIndexOf('?');
        if (index == -1) {
        
              return "";
              
        } else {
              return filename.substring(index + 1);
              
        }
    }

//	public TypeTeam getTeam() {
//		TypeTeam team1 = null;
//		for (TypeTeam team : TypeTeam.values()) {
//			if(partesRegistry[6].equals(team.getName())){
//				team1=team;
//				break;
//			}
//		}
//		return team1;
//	}
	public String getLapDuration1() {
		return partesRegistry[7];
	}
	public String[] getLapDuration() {
		return partesRegistry[7].split("(:)");
	}
	public String[] getPartesRegistry() {
		return partesRegistry;
	}
	public void setPartesRegistry(String[] partesRegistry) {
		this.partesRegistry = partesRegistry;
	}
	public static char getSeparador() {
		return SEPARADOR;
	}
	public boolean validadDate(String birthDate) {
		boolean validad = false;
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(FOMART_DATE_ES);
		long yearsCyclist =ChronoUnit.YEARS.between(LocalDate.parse(birthDate,dateTimeFormatter), presentDate);
		long yearsMax= ChronoUnit.YEARS.between(LocalDate.parse(DATEMAX,dateTimeFormatter), presentDate);
		long yearsMin= ChronoUnit.YEARS.between(LocalDate.parse(DATEMIN,dateTimeFormatter), presentDate);
		//System.out.println(yearsCyclist+ " EDAD MAX " + yearsMax+" MIN" + yearsMin);
		if(yearsCyclist<yearsMax&&yearsCyclist>yearsMin) {
			//
			validad =true;
		}
		 
		 return validad; 
	}
	public boolean validadNotDate(String birthDate) {
		boolean validad = false;
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(FOMART_DATE_ES);
		long yearsCyclist =ChronoUnit.YEARS.between(LocalDate.parse(birthDate,dateTimeFormatter), presentDate);
		long yearsMax= ChronoUnit.YEARS.between(LocalDate.parse(DATEMAX,dateTimeFormatter), presentDate);
		long yearsMin= ChronoUnit.YEARS.between(LocalDate.parse(DATEMIN,dateTimeFormatter), presentDate);
		//System.out.println(yearsCyclist+ " EDAD MAX " + yearsMax+" MIN" + yearsMin);
		if(yearsCyclist>yearsMax||yearsCyclist<yearsMin) {
			//
			validad =true;
		}
		 
		 return validad; 
	}
//	public Jugador cleateCyclistnotvalidos() {
//		Jugador cyclist=null;
//		if(validadNotDate(getBirthDate())==true) {
////			cyclist = new Jugador(getId(),firstNameResgister(),secondNameResgister(),lastNameResgister(),getBirthDate(),getGender(),getTeam(),getLapDuration1());
//			//System.out.println(secondNameResgister());
//		}
//		return cyclist;
//	}
	
//	public Jugador cleateCyclist() {
//		Jugador cyclist=null;
//		if(validadDate(getBirthDate())==true) {
////			cyclist = new Jugador(getId(),firstNameResgister(),secondNameResgister(),lastNameResgister(),getBirthDate(),getGender(),getTeam(),getLapDuration1());
//			//System.out.println(secondNameResgister());
//		}
//		return cyclist;
//	}
	
	public static Object[] concatObjectArrays2( Object[] vect1) {
		Object[] fusionArray = new Object[ vect1.length ];
		for (int i = 0; i < vect1.length; i++) {
			if ( i < vect1.length ) 
				fusionArray[i] = vect1[i];			
	
		}
		return fusionArray;
	}
//	public String toString() { 
//		return "id: "+getId()+ " nombre "+firstNameResgister() +" "+secondNameResgister() +" "+lastNameResgister()+" nacimiento "+getBirthDate()+" "+getGender()+" "+getTeam()+" "+getLapDuration1();
//	}
	public static void main(String[] args) {
	}

}
