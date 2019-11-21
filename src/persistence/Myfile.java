
package persistence;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Array;
import java.util.Arrays;
import persistence.Utilities;

public class Myfile {
	File f;
	FileWriter fw;
	FileReader fr;
	BufferedWriter bw = null;
	BufferedReader br = null;
	
	public Myfile(String nameFile) {
		f = new File(nameFile);
	}

	
	private void openFile(char modo)	{
		try {
			//modo escritura "w" crea el archivo
			if (modo=='w'){
			 fw = new FileWriter(f);
			 bw = new BufferedWriter(fw);
			}
			else{
			//modo lectura "r" abre el archivo
			  fr = new FileReader(f);
			  br = new BufferedReader(fr);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void writeRecords(String[] info){
		this.openFile('w');
		if (bw!=null){
			try {
				for (String registe : info) {
					
				
				bw.write(registe);
				bw.newLine();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		 this.closeFile();
	}
	
	public String[] readRecords(){
		String[] info;
		info = new String[this.contadorRegister()];
		int i=0;
		this.openFile('r');
		try {
			String linea=br.readLine();
			  //System.out.println(prueba);
			while(linea!=null){
				info[i]=linea;
			    linea=br.readLine();
				i++;
			}
			//System.out.println(info[i]);
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 this.closeFile();
		return info;
	}
	
	public int contadorRegister(){
		int contador = 0; 
		this.openFile('r');
		 try {
			while (br.readLine()!=null){
				 contador++;
				//	String prueba =br.readLine();
				//	  System.out.println(prueba);
					  
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 this.closeFile();
		 //System.out.println(contador);
		return contador;
	}
	public void closeFile(){
		try {
			
			 if (br!=null)
			    br.close();
			 if (bw!=null)
				    bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

		public static void main(String[] args) {
			
			Myfile arch = new Myfile("src\\Resources\\pueba");
			String v[];
			System.out.println(arch.contadorRegister());
			//System.out.println(Arrays.toString(arch.readRecords()));
			v=arch.readRecords();
			for (int i = 0; i <v.length; i++) {
				Utilities ulti = new Utilities(v[i]);
				
				//System.out.println(ulti.toString());
			}
		}
			
	/*		
	 //   proceso de escribir el archivo
				String[] prueba= new String[4];	
		 prueba[0]= "jaime,saenz,13,83";
		 prueba[1]= "jhon,,13,83";
		 prueba[2]= "luis,13,83";
		 prueba[3]= "gahs,13,83";
		  arch.openFile('w');
		  arch.writeRecords(prueba);
		
		 arch.closeFile();
			
	//    proceso de leer el archivo
				  arch.openFile('r');

	  	  
		
		
		}*/
}
