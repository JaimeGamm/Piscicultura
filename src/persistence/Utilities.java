package persistence;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilities {
	public static final char SEPARADOR = '?';
	public static final String SEPARADOR1 = "\\?";
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
	
	public String removeSeparatorsInARow1(String registry) {
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

	public static char getSeparador() {
		return SEPARADOR;
	}
	
	
	public static Object[] concatObjectArrays2( Object[] vect1) {
		Object[] fusionArray = new Object[ vect1.length ];
		for (int i = 0; i < vect1.length; i++) {
			if ( i < vect1.length ) 
				fusionArray[i] = vect1[i];			
		}
		return fusionArray;
	}

}
